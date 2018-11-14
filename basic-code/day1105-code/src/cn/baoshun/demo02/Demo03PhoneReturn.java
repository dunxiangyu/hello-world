package cn.baoshun.demo02;

public class Demo03PhoneReturn {
    public static void main(String[] args) {
        Phone phone = method();
        System.out.println(phone.color);
        System.out.println(phone.brand);
        System.out.println(phone.price);
    }

    public static Phone method() {
        Phone phone = new Phone();
        phone.price = 1356;
        phone.color = "白色";
        phone.brand = "苹果";
        return phone;
    }
}
