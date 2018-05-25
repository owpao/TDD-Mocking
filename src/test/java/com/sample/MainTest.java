package com.sample;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {

    @Test
    public void TestCalculateMethod()
    {
        Main.Calculate("1,2");
    }

    @Test(expected =  RuntimeException.class)
    public void whenMoreThanTwoNumbersAreCalculatedThenShowError(){
        Main.Calculate("1,2,3");
    }

    @Test
    public void whenRetrieveListThenOkay() {
        String[] sample = {"1","2","3"};

        Assert.assertTrue(Main.ToList(sample) != null);
    }

    @Test
    public void testMocking(){
        //given
        Main mockedClass = mock(Main.class);
        //when
        when(mockedClass.ReturnNumber()).thenReturn(50);
        //then
        Assert.assertEquals(mockedClass.ReturnNumber(), 50);
    }

}
