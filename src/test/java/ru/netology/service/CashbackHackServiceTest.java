package ru.netology.service;

//import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest  {

    @Test
    public void oneTestRemain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void twoTestRemain() {
        int amount = 500;
        int expected = 500;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void threeTestRemain() {
        int amount = 200;
        int expected = 800;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void fourTestRemain() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals( expected, actual);
    }
}