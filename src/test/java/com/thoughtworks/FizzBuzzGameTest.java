package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzGameTest {
    private FizzBuzzGame game = new FizzBuzzGame();
    @Test
    public void should_return_Fizz_when_have_3() {
        outSpecialString(Arrays.asList(3,6,13,31,35,57),"Fizz");
    }
    @Test
    public void should_return_Buzz_when_have_5() {
        outSpecialString(Arrays.asList(5,10,95),"Buzz");
    }
    @Test
    public void should_return_Whizz_when_have_7(){
        outSpecialString(Arrays.asList(7,14,56),"Whizz");
    }
    @Test
    public void should_return_FizzBuzz_when_have_3and5(){
        outSpecialString(Arrays.asList(15,75,90),"FizzBuzz");
    }
    @Test
    public void should_return_FizzWhizz_when_have_3and7(){
        outSpecialString(Arrays.asList(21,42),"FizzWhizz");
    }
    @Test
    public void should_return_BuzzWhizz_when_have_5and7(){
        outSpecialString(Arrays.asList(70),"BuzzWhizz");
    }
    @Test
    public void should_return_FizzBuzzWhizz_when_have_3and5and7(){
        outSpecialString(Arrays.asList(105),"FizzBuzzWhizz");
    }
    @Test
    public void should_return_initValue_when_have_noSpecialNumber(){
        outInitNumber(Arrays.asList(1,2,11,22,79));
    }
    
    private void outSpecialString(List<String> list,String result){
        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(result, game.getResult(list.get(i)));
        }
    }
    private void outInitNumber(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(String.valueOf(list.get(i)), game.getResult(list.get(i)));

        }
    }
}
