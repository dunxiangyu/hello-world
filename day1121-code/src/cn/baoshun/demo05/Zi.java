package cn.baoshun.demo05;

public class Zi extends Fu {

    int num = 20;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void method() {
        System.out.println("子类方法！");
    }

    public void methodZi() {
        System.out.println("子类特有方法！");
    }
}
