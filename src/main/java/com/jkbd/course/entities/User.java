package com.jkbd.course.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
