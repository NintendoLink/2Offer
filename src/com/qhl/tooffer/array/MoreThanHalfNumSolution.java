/**
 * @Author: LinK
 * @Date: 2019/4/28 17:09
 */

package com.qhl.tooffer.array;


/**
 * 数组中出现次数超过一半的数字
 */
public class MoreThanHalfNumSolution {


    /**
     * 思路
     * 1、直接用HashMap计算法，需要额外的存储空间
     * 2、直接用消去法
     * @param array
     * @return
     */
    public static int solution(int[] array){
        if (array ==null || array.length ==0){
            return 0;
        }


//        Map<Integer,Integer> map = new HashMap<>();
//
//        for (Integer integer:array){
//            map.put(integer,map.containsKey(integer)?map.get(integer)+1:1);
//        }
//
//        for(Iterator it = map.keySet().iterator();it.hasNext();){
//            Integer key = (Integer) it.next();
//            if (map.get(key) > array.length /2){
//                return key;
//            }
//        }
//        return 0;

        int times= 0;
        int cand =0;
        for (int i =0;i<array.length;i++){
            if (times == 0){
                cand = array[i];
            }else if (cand == array[i]){
                times++;
            }else {
                cand--;
            }
        }
        times = 0;
        for (int i = 0;i<array.length;i++){
            if (cand == array[i]){
                times++;
            }
        }

        if (2* times >array.length){
            return cand;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,5,5,5,5,5,5};

        System.out.println(solution(array));
    }
}
