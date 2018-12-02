package cn.baoshun.demo14;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {

        Manager manager = new Manager("群主", 100);
        Member member1 = new Member("A", 0);
        Member member2 = new Member("B", 0);
        Member member3 = new Member("D", 0);
        Member member4 = new Member("E", 0);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();

        System.out.println("======================");

        ArrayList<Integer> redList = manager.send(25, 4);
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        member4.receive(redList);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
    }
}
