package com.example.productserviceproxyapplication;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public abstract class BaseModel {
    private long id;
    private Date created;
    private Date updated;
    private boolean deleted;
}
