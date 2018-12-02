package cn.baoshun.demo05;

public class Fu {

    int num = 10;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void method() {
        System.out.println("父类方法");
    }

    public void methodFu() {
        System.out.println("父类特有方法");
    }
}
