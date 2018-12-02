package cn.baoshun.demo07;

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("Jack");
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("万箭齐发");
//            }
//        };

        // 同时使用了匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("万箭齐发");
            }
        });
        hero.attack();

    }
}
