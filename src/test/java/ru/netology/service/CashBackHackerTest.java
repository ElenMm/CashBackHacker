package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackerTest {

    // Тесты на JUnit4

    @Test
    public void shouldSayExtraPay100() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 900;

        int actual = cash.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSayExtraPay500() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 1500;

        int actual = cash.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSayNegativeAmount() {
        CashBackHacker cash = new CashBackHacker();
        int amount = -1500;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSayZeroAmount() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 0;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSayExtraPay() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 1_000;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    // Далее тесты на JUnit5

    @Test
    public void shouldSayExtraPay100JUnit5() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 900;

        int actual = cash.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSayExtraPay500JUnit5() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 1500;

        int actual = cash.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSayNegativeAmountJUnit5() {
        CashBackHacker cash = new CashBackHacker();
        int amount = -1500;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSayZeroAmountJUnit5() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 0;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSayExtraPayJUnit5() {
        CashBackHacker cash = new CashBackHacker();
        int amount = 1_000;

        int actual = cash.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
