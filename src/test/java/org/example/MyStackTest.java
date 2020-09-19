package org.example;

import org.assertj.core.api.Java6Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {

    MyStack<String> sut;

    @BeforeEach
    public void setup() {
        sut = new MyStack<String>();
    }

    @AfterEach
    public void cleanup() {
        sut = null;
    }

    @Test
    public void push_WhenInputIsWord_ShouldStackCountIncrease1() {

        //Arrange
        String element = "Deneme";

        //Act
        sut.push(element);

        //Assert
        assertEquals(1, sut.count());
    }

    @Test
    public void push_WhenInputIsNull_ShouldThrowIllegalArgumentException() {
        // Arrange

        // Act
        Throwable throwable = Java6Assertions.catchThrowable(() -> sut.push(null));

        //Assert
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class).hasMessage("Element must not be null!");
    }




    /*
    push -> eleman ekliyor
    pop -> eleman getiriyor eleman azaltıyor
    peek -> eleman alıyor ama azaltmıyor
    count -> */
}
