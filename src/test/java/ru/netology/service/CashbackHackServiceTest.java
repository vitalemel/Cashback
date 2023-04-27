package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }


}


