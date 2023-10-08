package com.example.productserviceproxyapplication.Controller;

import com.example.productserviceproxyapplication.Categories;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RestController
@RequestMapping ("Products/Categories")
public class CategoryController {
    public String getAllCategories() {
        return "getAllCategories";
    }
    public String getProductByCategory(Categories id) {
        return "getProductByCategory";
    }

}
