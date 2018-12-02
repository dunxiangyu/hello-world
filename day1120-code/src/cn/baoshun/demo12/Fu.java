package cn.baoshun.demo12;

/*
* 一个抽象类不一定有抽象方法，但是抽象方法肯定在抽象类中
* */
public abstract class Fu {

    public Fu(){
        System.out.println("父类抽象方法！！！");
    }

    public abstract void eat();
}
