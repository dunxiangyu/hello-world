package cn.baoshun.demo04;

/*
* 定义一个数组，存储3个Person对象
*
* 数组有一个缺点：
*   一旦创建，程序运行期间长度不可变
* */
public class Demo01Array {

    public static void main(String[] args) {
        // 创建一个长度为3的数组,用来存放Person类型的
        Person[] people = new Person[3];
        Person one = new Person("Jack", 14);
        Person two = new Person("Rose", 25);
        Person three = new Person("Ben", 98);
        // 将one中存的地址值，赋给0号元素位置
        people[0] = one;
        people[1] = two;
        people[2] = three;

        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);

        System.out.println(people[0].getName());
        System.out.println(people[1].getName());
        System.out.println(people[2].getName());
    }
}
