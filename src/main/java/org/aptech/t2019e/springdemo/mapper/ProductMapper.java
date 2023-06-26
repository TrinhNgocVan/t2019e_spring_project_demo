package org.aptech.t2019e.springdemo.mapper;

import org.aptech.t2019e.springdemo.dto.ProductDto;
import org.aptech.t2019e.springdemo.entity.Product;
import org.mapstruct.Mapper;

/*
<a href="mailto:vantn93hd@gmail.com">Vantn93</a>
*/
@Mapper
public interface ProductMapper {
    ProductDto entityToDto(Product product);
    Product dtoToEntity(ProductDto productDto);
}
