package cn.baoshun.demo14;

import java.util.ArrayList;
import java.util.Random;

// 普通成员
public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> arrayList) {
        // 从多个红包当中随便抽取一个list集合当中的随机编号
        int index = new Random().nextInt(arrayList.size());
        // 根据索引从集合当中删除，并且得到被删除的红包
        int delta = arrayList.remove(index);
        // 成员当前有多少钱呢
        int money = super.getMoney();
        // 更新红包
        super.setMoney(money + delta);
    }

}
