package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {

    MyStack sut;

    @BeforeEach
    public void setup() {
        sut = new MyStack();
    }

    @AfterEach
    public void cleanup() {
        sut = null;
    }

    @Test
    public void push_WhenInputIsWord_ShouldStackCountIncrease1(){

        //Arrange
        String element = "Deneme";

        //Act
        sut.push(element);

        //Assert
        assertEquals(0, sut.count());
    }




    /*
    push -> eleman ekliyor
    pop -> eleman getiriyor eleman azaltıyor
    peek -> eleman alıyor ama azaltmıyor
    count -> */
}
