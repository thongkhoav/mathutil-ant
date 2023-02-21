/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thongkhoa.mathutil.core;

/**
 *
 * @author ACER
 */
public class MathUtility {

    public static final double PI = 3.1415;

    // hàm tính n!
    // quy ước: n! = 1 x 2 x 3 x 4 x ... x n
    //          0! = 1! = 1
    // không có giai thừa của số âm
    // Thiết kế của hàm tính giai thừa của chúng ta là:
    // hàm ko tính giai thừa âm, nếu đưa giai thừa âm => EXCEPTION
    // hàm ko tính giai thừa quá to, n <= 21
    // vì kiểu long chỉ có tối đa 18 số 0
    // QC phải test hàm có đúng thiết kế ko thông qua TEST CASE
    public static long getFactorial(int n) {
        if (n < 0 || n > 21) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        // nếu n = 2..20
        long product = 1; // tích nhân dồn!!!
        for (int i = 2; i < n; i++) {  // ko nhân phần tử cuối
            product *= i;
        }

        return product;
    }
}
