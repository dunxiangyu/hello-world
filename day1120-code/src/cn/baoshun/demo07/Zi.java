package cn.baoshun.demo07;

public class Zi extends Fu {

    public Zi(){
//        super();    //隐含的
        super(10);  // 调用父类重载的构造方法
        System.out.println("子类构造方法");
    }
}
