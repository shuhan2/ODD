package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {

    }
    public String getResult(Integer number) {

        if (number%10 == 3 || number /10 ==3){
            return "Fizz";
        }
        else if (number %3 ==0 ){
            if (number % 5 == 0 && number % 7 == 0){
                return "FizzBuzzWhizz";
            }
            else if (number % 5 == 0){
                return "FizzBuzz";
            }
            else if (number % 7 == 0){
                return "FizzWhizz";
            }
            return "Fizz";
        }
        else if(number % 5 == 0){
            if (number % 7 == 0){
                return "BuzzWhizz";
            }
            return "Buzz";
        }
        else if(number % 7 == 0){
            return "Whizz";
        }
        else{
            return number.toString();
        }

    }
    public List<String> getResults() {
        return results;
    }
}


