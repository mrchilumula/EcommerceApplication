package com.example.productserviceproxyapplication;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;


@Getter
@Setter
public class Categories extends BaseModel{

    private String name;
    private String description;
    private ArrayList<Products> ProductList;
}


