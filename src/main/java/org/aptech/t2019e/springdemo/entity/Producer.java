package org.aptech.t2019e.springdemo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "producer_table")
@Data
@SuperBuilder
@NoArgsConstructor
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "producer_name",nullable = false)
    private String productName;
    @Column(name = "address",nullable = true)
    private String address;
}
