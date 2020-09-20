package org.kodluyoruz.trendyol;

import org.assertj.core.api.Java6Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTests {

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

    @Test
    public void pop_ShouldStackCountDecrease1AndReturnTopElement() {

        //Arrange
        String element = "Deneme";

        //Act
        sut.push(element);
        String result = sut.pop();

        //Assert
        assertThat(result).isEqualTo(element);
        assertEquals(0, sut.count());
    }

    @Test
    public void pop_WhenStackIsEmpty_ShouldThrowIllegalStateException() {

        //Arrange

        //Act
        Throwable throwable = Java6Assertions.catchThrowable(() -> sut.pop());

        //Assert
        assertThat(throwable).isInstanceOf(IllegalStateException.class).hasMessage("Stack is empty.");
    }

    @Test
    public void pop_WhenStackPushCalled3Times_PeekMethodsCalled1Times_PopMethodsCalled1Times_ShouldReturnTopElement() {

        //Arrange
        String element = "Deneme";
        String element2 = "Deneme2";
        String element3 = "Deneme3";

        //Act
        sut.push(element);
        sut.push(element2);
        sut.push(element3);
        sut.peek();
        String result = sut.pop();

        //Assert
        assertThat(result).isEqualTo(element3);
    }

    @Test
    public void peek_ShouldStackCountDoesNotDecrease1AndReturnTopElement() {

        //Arrange
        String element = "Deneme";

        //Act
        sut.push(element);
        String result = sut.peek();

        //Assert
        assertThat(result).isEqualTo(element);
        assertEquals(1, sut.count());
    }

    @Test
    public void peek_WhenStackIsEmpty_ShouldThrowIllegalStateException() {

        //Arrange

        //Act
        Throwable throwable = Java6Assertions.catchThrowable(() -> sut.peek());

        //Assert
        assertThat(throwable).isInstanceOf(IllegalStateException.class).hasMessage("Stack is empty.");
    }

    @Test
    public void peek_WhenStackPushCalled3Times_PopMethodsCalled1Times_PeekMethodsCalled1Times_ShouldReturnSecondElement() {

        //Arrange
        String element = "Deneme";
        String element2 = "Deneme2";
        String element3 = "Deneme3";

        //Act
        sut.push(element);
        sut.push(element2);
        sut.push(element3);
        sut.pop();
        String result = sut.peek();

        //Assert
        assertThat(result).isEqualTo(element2);
    }


    @Test
    public void count_WhenStackPushMethodCalled2Times_ShouldReturn2() {

        //Arrange
        String element = "Deneme";
        String element2 = "Deneme2";

        //Act
        sut.push(element);
        sut.push(element2);

        //Assert
        assertEquals(2, sut.count());
    }

    @Test
    public void count_WhenStackPushAndPopMethodsCalled2Times_ShouldReturn0() {

        //Arrange
        String element = "Deneme";
        String element2 = "Deneme2";

        //Act
        sut.push(element);
        sut.push(element2);
        sut.pop();
        sut.pop();

        //Assert
        assertEquals(0, sut.count());
    }

    @Test
    public void count_WhenStackPushAndPeekMethodsCalled2Times_ShouldReturn2() {

        //Arrange
        String element = "Deneme";
        String element2 = "Deneme2";

        //Act
        sut.push(element);
        sut.push(element2);
        sut.peek();
        sut.peek();

        //Assert
        assertEquals(2, sut.count());
    }

    @Test
    public void count_WhenStackPushCalled2Times_PopAndPeekMethodsCalled1Times_ShouldReturn1() {

        //Arrange
        String element = "Deneme";
        String element2 = "Deneme2";

        //Act
        sut.push(element);
        sut.push(element2);
        sut.pop();
        sut.peek();

        //Assert
        assertEquals(1, sut.count());
    }



    /*
    push -> eleman ekliyor
    pop -> eleman getiriyor eleman azaltıyor
    peek -> eleman alıyor ama azaltmıyor
    count -> */
}
