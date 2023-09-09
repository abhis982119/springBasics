package com.model;

import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@ToString
public class Student {

    private String name = "defaultName";

    private Integer  standard  = -1 ;

    private Integer rollNumber = -1;




    @PostConstruct
    public void printCreated(){
        System.out.println("@PostConstruct : " + this);
    }

}
