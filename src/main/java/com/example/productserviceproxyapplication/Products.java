package com.example.productserviceproxyapplication;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products extends BaseModel {

        private String name;
        private String description;
        private String price;
        private String category;
        private String image;

        public Products() {
        }

        public Products(String name, String description, String price, String category, String image) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.category = category;
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }

        public String getImage() {
            return image;
        }
}
