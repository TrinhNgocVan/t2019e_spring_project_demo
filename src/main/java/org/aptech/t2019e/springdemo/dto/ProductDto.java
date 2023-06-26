package org.aptech.t2019e.springdemo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/*
<a href="mailto:vantn93hd@gmail.com">Vantn93</a>
*/
@Data
@SuperBuilder
@NoArgsConstructor
public class ProductDto {
    private long id;
    private String productName;
    private long price;
    private LocalDateTime insertedTime;
    private String createdBy;
    private LocalDateTime updatedTime;
    private String updatedBy;
}
