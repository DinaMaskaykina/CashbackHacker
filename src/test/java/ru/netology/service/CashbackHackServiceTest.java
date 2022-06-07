package ru.netology.service;

//import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void oneTestRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void twoTestRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void threeTestRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 200;
        int expected = 800;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void fourTestRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}