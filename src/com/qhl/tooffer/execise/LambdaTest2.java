/**
 * @Author: LinK
 * @Date: 2019/4/29 16:15
 */

package com.qhl.tooffer.execise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest2 {
    public static void main(String[] args) {

        Person p1 = new Person("zhangsan",20,100);
        Person p2 = new Person("lisi",30,200);

        List<Person> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);

//        对person对象的每个salary进行操作
//        Consumer<Person> giveRaise = person -> person.setSalary(person.getSalary() + 100);
//        list.forEach(giveRaise);
//        list.forEach(person -> System.out.println(person.getSalary()));

//        利用Filter过滤salary
//        list.stream().filter(person -> person.getSalary()>100).forEach(person -> System.out.println(person.getSalary()));

//        第二种过滤方法,自定义过滤器
//        Predicate<Person> salaryPredictor = person -> person.getSalary()>100;
//        list.stream().filter(salaryPredictor).forEach(person -> System.out.println(person.getName()));

//        根据salary排序person
//        List<Person> personList = list.stream().sorted((person1,person2) -> (person2.getSalary() - person1.getSalary())).collect(Collectors.toList());
//        personList.forEach(person -> System.out.println(person.getName()));
    }
}
