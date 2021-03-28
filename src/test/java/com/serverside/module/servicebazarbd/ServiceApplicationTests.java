package com.serverside.module.servicebazarbd;

import com.serverside.module.servicebazarbd.utils.MathUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ServiceApplicationTests {

    @Autowired
    private MathUtils mathUtils;


    @Test
    void add(){
        int Output2 = 3;
        int Output1 = mathUtils.add(1,2);
        assertEquals(Output1, Output2, "Error");
        assertEquals(mathUtils.computeCircleArea(10.0), 314.1592653589793, "");
    }

    @Test
    void testComputeCircleRadius(){
        mathUtils.subtract(8,9);
    }
}
