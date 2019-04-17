/**
 * @Author: LinK
 * @Date: 2019/4/17 15:42
 */

package com.qhl.tooffer.basestructure;

/**
 * 1、用链表实现
 * 2、用数组实现自动伸缩的Stack
 * 3、加上泛型
 */
public class StringStack {

    private int length;
    private int size;

    private String[] strings;
    public StringStack(int length) {
        this.length = length;
        this.size = 0;
        strings =  new String[length];
    }

    public boolean push(String string){
        size++;
        if (size >length){
            return false;
        }
        strings[size-1] = string;
        return true;
    }

    public String pop(){

        if (size ==0){
            return "Empty";
        }
        size --;
        return strings[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
