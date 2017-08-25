package 二进制1的个数;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private int input;
    private int expect;

    @Before
    public void setUp() throws Exception {
        input=-5;
        expect=0;

        String strNum=Integer.toBinaryString(input);
        System.out.println(strNum);
        for (int i=0;i<strNum.length();i++){
            if(strNum.charAt(i)=='1'){
                expect++;
            }
        }

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void countOnes() throws Exception {
        assertEquals(expect,new Solution().countOnes(input));
    }

}