package cn.baoshun.demo06;

public class DemoMain {

    public static void main(String[] args) {
        // 创建英雄角色
        Hero hero = new Hero();
        hero.setName("Jack");
        hero.setAge(20);
        Weapon weapon = new Weapon("多兰");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
