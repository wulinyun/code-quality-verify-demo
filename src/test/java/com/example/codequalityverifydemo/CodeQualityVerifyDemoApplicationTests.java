package com.example.codequalityverifydemo;

import org.junit.*;

public class CodeQualityVerifyDemoApplicationTests {

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("before class test");
    }
    @Before
    public void beforeTest() {
        System.out.println("before test");
    }
    @Test
    public void contextLoads() {
        System.out.println("This is the Unit Test");
    }
    @Test
    public void Test1() {
        System.out.println("test 1+1=2");
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void Test2() {
        System.out.println("test 2+2=4");
        Assert.assertEquals(4, 2 + 2);
    }
    @After
    public void afterTest() {
        System.out.println("after test");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("after class test");
    }

}
