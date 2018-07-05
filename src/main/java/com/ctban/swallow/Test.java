package com.ctban.swallow;

import com.ctban.swallow.service.Defaulable;
import com.ctban.swallow.service.DefaulableFactory;
import com.ctban.swallow.service.imp.DefaultableImpl;
import com.ctban.swallow.service.imp.OverridableImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.Integer.compare;
import static java.util.stream.Collectors.toList;

/**
 * @author GuoJie 2018/7/5 10:39
 */
public class Test {

    public static void main(String[] args) {
        //测试Lambda 表达式
        List<Integer> list = Arrays.asList(12, 13, 14, 15);
//        list.sort((e1, e2) -> e1.compareTo(e2));
//
//        Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
//
//        System.out.println(defaulable.notRequired());
//
//        defaulable = DefaulableFactory.create(OverridableImpl::new);
//        System.out.println(defaulable.notRequired());

        //java中lambda表达式的使用
        list.forEach(System.out::println);
//        list.stream().map(x -> x + 0.5).forEach(System.out::println);
//        System.out.print(list.stream().map(x -> x + 0.5).reduce(String::concat).get());

        Predicate<Integer> ageFilter = (p) -> (p > 25);
        //https://www.cnblogs.com/franson-2016/p/5593080.html



        System.out.println(list.stream().min((x1, x2) ->(compare(x1,x2))).get());

//        filterTest(list, x -> x.startsWith("j"));
    }

    public static void filterTest(List<String> strList, Predicate<String> condition) {
        strList.stream().filter(x -> condition.test(x)).forEach(System.out::println);

    }


}
