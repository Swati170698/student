package com.calculator.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
public class CalRequest {

    int a;
    int b;

}
