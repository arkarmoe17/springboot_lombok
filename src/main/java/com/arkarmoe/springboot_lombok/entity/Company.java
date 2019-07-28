package com.arkarmoe.springboot_lombok.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Company {
    private String name;
    private String type;
}
