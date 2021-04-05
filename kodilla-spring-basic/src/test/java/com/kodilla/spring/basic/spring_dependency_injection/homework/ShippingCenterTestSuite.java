package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

@SpringBootTest
public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter shippingCenterBean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldDeliverWhenPackagesWeightIsUnderOrEqual30kg() {
        String delivered = shippingCenterBean.sendPackage("New York", 29);
        assertEquals("Package delivered to: New York", delivered);
    }

    @Test
    public void shouldNotDeliverWhenPackagesWeightIsAbove30kg() {
        String delivered = shippingCenterBean.sendPackage("New York", 31);
        assertEquals("Package not delivered to: New York", delivered);
    }

}