package com.maliha.exceptionhandlingspring.service;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.InputMismatchException;

@Service
public class ExceptionTestingService {


    public int arrayIterate(int a) throws ArrayIndexOutOfBoundsException{
        int[] array=new int[10];
        int sum=0;
        for (int i=0; i<a;i++){
            array[i]=i;
            sum=sum+array[i];
        }
        return sum;
        }
    public String stringCreator(Object s)throws NullPointerException {
        if(s.equals("")){
            throw new NullPointerException();

        } else{
            return "A=apple, B=ball, C=Cat";
        }

    }
}
