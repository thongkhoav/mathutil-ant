/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.thongkhoa.mathutil.main;

import com.thongkhoa.mathutil.core.MathUtility;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentThrowsException();
    }

    // Kiểm thử hàm getF() có được viết đúng như thiết kế hay không?
    // thiết kế: đưa n tử tế từ 0..20 -> tính được n
    // đưa n sai < 0 hoặc 20, chửi
    // Ta phải giả lập các cách xài của user/ai đó
    // Mỗi cách xài hàm, ứng với 1 n thì hàm s4 chạy với n đó
    // Mỗi cách xài thì gọi là TEST CASE
    // Quy tắc đặt tên hàm dành cho kiểm thử code
    // Cú pháp con lạc đà camelCase notation
    // Tên hàm luôn mang ý nghĩa/mục đích của việc test
    public static void testFactorialGivenRightArgumentReturnsWell() {
        // Test case #1: Tình huống xài hàm số 1
        //               Test getF() with n = 0;
        // Expected value: 1;

        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        // kiểm thử là so sánh expected vs actual
        System.out.println("Test " + n + "!: expected: " + expectedValue + ""
                + " | actual: " + actualValue);

        // Test case #2: Tình huống xài hàm số 2
        //               Test getF() with n = 1;
        // Expected value: 1;
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!: expected: " + expectedValue + ""
                + " | actual: " + actualValue);

        // Test case #3: Tình huống xài hàm số 3
        //               Test getF() with n = 2;
        // Expected value: 2;
        System.out.println("Test 2!: expected: 2"
                + " | actual: " + MathUtility.getFactorial(2));
        
        // Test case #4: Tình huống xài hàm số 4
        //               Test getF() with n = 3;
        // Expected value: 6;
        System.out.println("Test 3!: expected: 6"
                + " | actual: " + MathUtility.getFactorial(3));
        
        // Test case #5: Tình huống xài hàm số 5
        //               Test getF() with n = 5;
        // Expected value: 120;
        System.out.println("Test 5!: expected: 120"
                + " | actual: " + MathUtility.getFactorial(5));
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
        // Test case #6: test getF() with n = -1
        // Expected value: throw Exception
        
        System.out.println("Test -1!: expected An illegal Argument Exception "
                + "is thrown. | actual: ");
        MathUtility.getFactorial(-1);
    }

}
