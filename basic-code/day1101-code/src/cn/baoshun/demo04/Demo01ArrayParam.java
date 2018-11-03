package cn.baoshun.demo04;

/*
* 数组可以作为方法的参数
* 当调用方法的时候，向方法中传递参数，传递进去的其实是数组的地址值
* */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] arrayA = new int[]{10, 20, 30, 40, 50};
        arrayPrint(arrayA);
        System.out.println("=================");
        arrayPrint(arrayA);
        System.out.println("==============");
        arrayPrint(arrayA);
    }

    public static void arrayPrint(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
