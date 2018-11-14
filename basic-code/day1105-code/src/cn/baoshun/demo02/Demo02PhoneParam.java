package cn.baoshun.demo02;

public class Demo02PhoneParam {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.color = "白色";
        phone.price = 13456;
        method(phone);
    }

    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
