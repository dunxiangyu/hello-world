package cn.baoshun.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Jack");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名" + stu.getName() +
                ", 年龄：" + stu.getAge() +
                ", 是不是爷们：" + stu.isMale());
    }
}
