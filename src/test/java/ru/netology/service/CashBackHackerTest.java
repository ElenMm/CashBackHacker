package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackerTest {

    @Test
    public void shouldSayExtraPay100() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 900;

        int actual = cash.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSayExtraPay500() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 1500;

        int actual = cash.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSayNegativeAmount() {
        CashBackHacker cash = new CashBackHacker();
        int amount = -1500;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldSayZeroAmount() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 0;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSayExtraPay() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 1_000;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
