package cn.baoshun.demo07;

import java.util.ArrayList;
import java.util.List;


/*
* java.util.List正式ArrayList所实现的接口
* */
public class DemoInterfaceimpl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List addNames(List<String> list) {
        list.add("Jack");
        list.add("Rose");
        list.add("Ben");
        list.add("James");
        return list;
    }
}
