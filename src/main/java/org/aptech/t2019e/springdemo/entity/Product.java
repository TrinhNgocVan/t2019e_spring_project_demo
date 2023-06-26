package org.aptech.t2019e.springdemo.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

/*
<a href="mailto:vantn93hd@gmail.com">Vantn93</a>
*/
@Entity
@Table(name = "product_table")
@Data
@SuperBuilder
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_name",nullable = false)
    private String productName;
    private long price;
    // format
    @Column(name = "inserted_time", nullable = false)
    private LocalDateTime insertedTime;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_time", nullable = false)
    private LocalDateTime updatedTime;
    @Column(name = "updated_by")
    private String updatedBy;
    @PrePersist
    public void beforeInsert(){
        this.insertedTime = LocalDateTime.now();
        this.updatedTime = LocalDateTime.now();
    }
    @PreUpdate
    public void beforeUpdate(){
        this.updatedTime = LocalDateTime.now();
    }
}
