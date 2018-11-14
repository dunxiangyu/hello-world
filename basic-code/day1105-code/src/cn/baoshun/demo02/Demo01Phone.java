package cn.baoshun.demo02;

public class Demo01Phone {
    public static void main(String[] args) {
        // 根据Phone类创建对象
        Phone phone = new Phone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("=========================");
        phone.brand = "苹果";
        phone.color = "白色";
        phone.price = 5869;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("===================");
        phone.call("小白");
        phone.sendMessage();
        System.out.println("=======================");
        Phone phone1 = phone;
        phone.brand = "三星";
        phone.color = "黑色";
        phone.price = 1234;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
    }
}
