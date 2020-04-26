package com.varjak.tacocloud.entity;

import lombok.Data;

/**
 * Description of Class
 *
 * @Author xhj
 * @Date 2020/4/26 15:03
 */

@Data
public class Order {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
