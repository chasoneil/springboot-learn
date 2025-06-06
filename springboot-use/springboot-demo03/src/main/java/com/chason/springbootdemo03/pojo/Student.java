package com.chason.springbootdemo03.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chason
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private int id;
    private String name;
    private int age;
}
