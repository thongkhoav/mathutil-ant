/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import com.thongkhoa.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author thongkhoa
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {

    // Chuẩn bị data là mảng 2 chiều kiểu Object
    // JUnit tự loop duyệt mảng lôi tách data ra
    // Giúp ta đổ vào hàm assertEquals()
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        return new Object[][]{{0, 1},
        {1, 1},
        {2, 2},
        {3, 6},
        {4, 24},
        {5, 120},
        {6, 720}};
    }
    
    // map từng cột của từng dòng vào 2 biến tương ứng n và expected
    @Parameterized.Parameter(value = 1) // cột 1
    public long expected;
    
    @Parameterized.Parameter(value = 0) // cột 0
    public int n;
    
    // so sánh expected và actual
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
}
