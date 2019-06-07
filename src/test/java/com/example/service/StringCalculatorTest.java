package com.example.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringCalculatorTest {
    private StringCalculator subject = new StringCalculator();

    @Test
    void noNumbers() {
        int actual = subject.add("");
        assertThat(actual).isEqualTo(0);
    }
    
    @Test
    void oneNumber() {
        int act = subject.add("1");
        assertThat(act).isEqualTo(1);
    }
    
    @Test
    void twoNumbers() {
        assertThat(subject.add("2,3")).isEqualTo(5);
    }
    
    @Test
    void nNumbers() {
//        int ran = (int) (Math.random()*10) + 1;
//        String actual = "";
//        int total = 0;
//        for (int i = 0; i < ran; i++) {
//            int temp = (int) (Math.random()*10) + 1;
//            total += temp;
//            actual += temp + ",";
//        }
//        assertThat(subject.add(actual.substring(0,actual.length()-1)))
//                .isEqualTo(total);
        assertThat(subject.add("1,2,3,4,5")).isEqualTo(15);
    }

    @Test
    void nNumbersNewline() {
        assertThat(subject.add("1,2,3\n4,5")).isEqualTo(15);
    }
    
    @Test
    public void differentDelims() {
        assertThat(subject.add("//\n\n1\n2\n3\n4\n5")).isEqualTo(15);
    }
    
    @Test
    void negNumbers() {
        RuntimeException thrown = assertThrows(RuntimeException.class, () -> {
            subject.add("1,2,-3,4,-5");
        });
        assertTrue(thrown.getMessage().contains("negative numbers not allowed [-3, -5]"));
    }
}
