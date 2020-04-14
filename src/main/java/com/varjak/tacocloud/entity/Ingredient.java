package com.varjak.tacocloud.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author XHJ
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        /**
         * 配料类型
         */
        CHEESE, PROTEIN, SAUCE, VEGGIES, WRAP
    }
}
