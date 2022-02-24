package com.example.car_gen;

import org.junit.Assert;
import org.junit.Test;


public class CarTest {
    Honda civic = new Honda("blue", 2010, 65, false);

    @Test
    public void testAccelerateSpeed() {
        Assert.assertEquals(5, civic.accelerateSpeed());
    }

    @Test
    public void testDecelerateSpeed() {
        Assert.assertEquals(0, civic.decelerateSpeed());
    }

    @Test
    public void testIsElectric() {
        Assert.assertEquals(true, civic.convertToElectric());
    }
}
