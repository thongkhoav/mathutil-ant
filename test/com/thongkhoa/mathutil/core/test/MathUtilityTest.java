package com.thongkhoa.mathutil.core.test;


import com.thongkhoa.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author thongkhoa
 */
public class MathUtilityTest {
    // test getF() if n OUT range
    // ném ngoại lệ
    // JUnit 4 ko có hàm  assertEquals() cho Exception
    // JUnit 5 có hàm assertThrows()
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowException() {
        MathUtility.getFactorial((-8));
    } 
    
    // test getF() if n IN range
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        // Test case #1: test getF() with n=0
        // Expected: 0!=1
        int n=0;
        long expected =1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        // XANH nếu 2 thằng giống nhau
        // ĐỎ nếu 2 thằng khác nhau
        
        // Test case #2: test getF() with n=1
        // Expected: 1!=1
         n=1;
         expected =1;
         actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        // Test case #3: test getF() with n=5
        // Expected: 5!=120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
    } 
    
    @Test
    public void testRedGreen() {
        Assert.assertEquals(69, 69);
    }
    
    
}
