/**
 * @Author: LinK
 * @Date: 2019/4/17 16:00
 */

package com.qhl.tooffer.basestructure;

public class StringStack2 {

    private static final int INIT_LENGTH = 2;

    private static final int FLEX_FACTOR= 2;

    private int size;

    private int length;

    private String[] strArray;

    public StringStack2() {
        this.size = 0;
        this.length = INIT_LENGTH;
        this.strArray = new String[this.length];
    }

    public boolean push(String string){
        if (++size > length){
            this.strArray = resize(strArray);

        }

        strArray[size-1] = string;
        return true;
    }

    /**
     * 扩容
     * @param strings
     * @return
     */
    private String[] resize(String[] strings){

        int newlen = this.length * FLEX_FACTOR;
        String[] newArray = new String[newlen];

        for(int i = 0; i<length;i++){
            newArray[i] = strArray[i];
        }

        this.length = newlen;
        return newArray;
    }

    public String pop(){
        if (size == 0){
            return "Empty";
        }
        return strArray[--size];
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
