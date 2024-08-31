package com.calculator.service;

import com.calculator.dto.CalRequest;
import com.calculator.dto.CalResponse;
import org.springframework.stereotype.Service;

@Service
public class exService {

    public CalResponse add(int a, int b){
        int add = a+b;
        int multiply = a*b;
        int divide = a/b;

        CalResponse calResponse = new CalResponse();
        calResponse.setSum(add);
        calResponse.setDiv(divide);
        calResponse.setMulti(multiply);

        return calResponse;
    }

    public CalResponse add2(CalRequest cal){

        int add = cal.getA() + cal.getB();
        int mul = cal.getA() * cal.getB();
        int div = cal.getA() / cal.getB();

        CalResponse calResponse = new CalResponse();
        calResponse.setSum(add);
        calResponse.setDiv(div);
        calResponse.setMulti(mul);

        return calResponse;
    }
}
