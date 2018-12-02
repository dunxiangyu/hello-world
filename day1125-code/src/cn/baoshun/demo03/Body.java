package cn.baoshun.demo03;

public class Body {

    public class Heart {    // 成员内部类

        // 内部类方法
        public void methodHeart() {
            System.out.println("心脏跳动！");
            System.out.println("我叫：" + name);
        }
    }

    // 外部类的成员变量
    private String name;

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 外部类方法
    public void methodBody() {
        System.out.println("外部方法");

        new Heart().methodHeart();
    }

}
