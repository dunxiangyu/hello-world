package cn.baoshun.demo05;

public class Demo01Student {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Jack");
        stu.setAge(20);
        System.out.println("姓名：" + stu.getName() + ", 年龄：" + stu.getAge());
        System.out.println("======================");

        Student stu1 = new Student("Rose", 20);
        stu1.setAge(22);
        System.out.println("姓名：" + stu1.getName() + ", 年龄：" + stu1.getAge());
    }
}
