package cn.baoshun.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.name = "Jack";
//        person.age = -18;   //直接访问private内容是错误的
        person.setAge(-20);
        person.show();
    }
}
