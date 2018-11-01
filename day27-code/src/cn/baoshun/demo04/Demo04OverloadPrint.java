package cn.baoshun.demo04;

// byte short int long float double char boolean
// String
// 在调用输出语句的时候，println其实是进行了多种数据类型的重载形式

public class Demo04OverloadPrint {

    public static void main(String[] args) {
        myPrint(100);
        myPrint(true);
    }

    public static void myPrint(byte num){
        System.out.println(num);
    }

    public static void myPrint(short num){
        System.out.println(num);
    }

    public static void myPrint(int num){
        System.out.println(num);
    }

    public static void myPrint(long num){
        System.out.println(num);
    }

    public static void myPrint(float num){
        System.out.println(num);
    }

    public static void myPrint(double is){
        System.out.println(is);
    }

    public static void myPrint(char zifu){
        System.out.println(zifu);
    }

    public static void myPrint(boolean b){
        System.out.println(b);
    }
}
