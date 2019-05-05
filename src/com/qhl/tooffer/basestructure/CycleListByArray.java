/**
 * @Author: LinK
 * @Date: 2019/5/5 10:09
 */

package com.qhl.tooffer.basestructure;

import java.util.ArrayList;
import java.util.List;

/**
 * 用ArrayList实现循环链表
 */
public class CycleListByArray {

    private List<Integer> list;

    private int pivot;

    public CycleListByArray() {
        this.list = new ArrayList<>();
        this.pivot = 5;
    }

    public boolean set(int number){

        return list.add(number);
    }

    public int get(){
        return list.get((pivot++) % list.size());
    }

    public static void main(String[] args) {
        CycleListByArray cycleListByArray = new CycleListByArray();

        for(int i =0;i<10;i++){
            cycleListByArray.set(i);
        }

        for (int i =0;i<10;i++){
            System.out.println(cycleListByArray.get());
        }
    }
}
