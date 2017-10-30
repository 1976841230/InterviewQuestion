package com.kuranado.arraylisttest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JING on 2017/10/29.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(5);
        for (int i = 0; i < list.size(); i ++) {
            int v = list.get(i);
            if (v % 2 == 0) {
                //list.remove(v); //越界异常,因为调用的是remove(int index)方法而不是remove(Object obj方法)
                list.remove((Object) v);
            }
        }
        System.out.println(list);
    }

}
