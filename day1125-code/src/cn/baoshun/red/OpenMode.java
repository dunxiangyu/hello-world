package cn.baoshun.red;

import java.util.ArrayList;

public interface OpenMode {

    /**
     * @param totalMoney        总金额为方便计算，已转换为整数型，单位为分
     * @param totalCount        红包个数
     * @return ArrayList<Integer> 元素为各个红包的金额值，所有元素的值累加等于总金额
     */
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}
