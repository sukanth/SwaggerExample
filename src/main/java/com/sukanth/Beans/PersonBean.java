package com.sukanth.Beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonBean {
    private String firstName;
    private String lastName;
    private String department;
    private int id;
}
