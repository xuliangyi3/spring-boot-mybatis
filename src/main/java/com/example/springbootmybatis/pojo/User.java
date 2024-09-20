package com.example.springbootmybatis.pojo;

import lombok.*;

//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String phone;
}