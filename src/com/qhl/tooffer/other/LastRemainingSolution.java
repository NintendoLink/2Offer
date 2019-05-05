/**
 * @Author: LinK
 * @Date: 2019/5/5 9:51
 */

package com.qhl.tooffer.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一
 * 些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报
 * 数。每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友
 * 开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额
 * 有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 */
public class LastRemainingSolution {

    /**
     * 使用循环链表，这里可以想一下，为什么使用ArrayList与LinkedList都可以
     * @param n
     * @param m
     * @return
     */
    public static int solution(int n,int m){

        List<Integer> list = new ArrayList<>();

        for (int i =0;i<n;i++){
            list.add(i);
        }

        int bt =0;

        while (list.size()>1){
            bt = (bt + m-1) % list.size();
            list.remove(bt);
        }

        return list.size() ==1?list.get(0):-1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0;i<10;i++){
            list.add(i);
        }

//        list.stream().forEach(integer -> System.out.println(integer));

        System.out.println(solution(100,3));
    }
}
