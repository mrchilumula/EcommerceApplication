package com.example.productserviceproxyapplication.Dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductDto {
    private String name;
    private String description;
    private String price;
    private String category;
     private String image;
}
