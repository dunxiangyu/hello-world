package cn.baoshun.demo14;

import java.util.ArrayList;

// 群主的类
public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // 需要一个集合，用来存储若干个红包
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看一下群主有多少钱
        int leftMoney = super.getMoney();    // 群主当前余额
        if(totalMoney > leftMoney) {
            System.out.println("余额不足！");
            return redList; // 返回空集合
        }

        // 扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);
        // 发红包，需要拆分，平均拆分count份
        int avg = totalMoney / count;
        int mode = totalMoney % count;  // 余数，
        // 剩下的零头装在最后一个红包里
        // 下面把红包一个一个放到集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // 最后一个红包
        int last = avg + mode;
        redList.add(last);

        return redList;


    }
}
