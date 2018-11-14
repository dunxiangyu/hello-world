package cn.baoshun.demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jack";
        person.sayHello("zhangsan");

        System.out.println(person);
    }
}
