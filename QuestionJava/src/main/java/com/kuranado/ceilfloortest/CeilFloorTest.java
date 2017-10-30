package com.kuranado.ceilfloortest;

/**
 * Created by JING on 2017/10/28.
 */
public class CeilFloorTest {

    public static void main(String[] args) {
        double a = -0.5;
        System.out.println(Math.ceil(a));   //-0.0
        System.out.println(Math.floor(a));  //-1.0
        /*
        ceil方法有这样一段说明：If the argument value is less than zero but greater than -1.0, then the
        result is negative zero.
        floor方法有这样一段说明：If the argument is NaN or an infinity or positive zero or negative zero, then the result is the same as the argument.
        * */
    }

}
