package cn.baoshun.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();    //无参构造
        System.out.println("================");
        Student stu2 = new Student("Jack", 20);     // 全参构造
        // 如果需要改变对象属性的内容，仍然需要使用setXxx方法
    }
}
