package com.kuranado;

/**
 * Created by JING on 2017/10/28.
 */
public class StringTest {

    public static void main(String[] args) {
        String str = "Admin";
        System.out.println(isAdmin(str));
    }

    public static boolean isAdmin(String str) {
        return str.toLowerCase() == "admin";
    }

}
