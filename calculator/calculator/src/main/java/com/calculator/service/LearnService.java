package com.calculator.service;

import com.calculator.dto.CalRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LearnService {

    public List<Integer> add2(List<CalRequest> req){
        List<Integer> retrnList = new ArrayList<>();
        for(CalRequest request : req){
          int result = request.getA()+request.getB();
          retrnList.add(result);
        }
        return retrnList;
    }

}
