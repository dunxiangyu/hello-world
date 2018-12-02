package cn.baoshun.demo07;

public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

//        // 准备一个鼠标
//        Mouse mouse = new Mouse();
//        // 首先进行向上转型
//        USB usb = mouse;
        USB mouse = new Mouse();
        computer.useDevice(mouse);

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard(); // 没有用多态写法
        // 方法参数是USB类型，传递进去的是一个实现类对象
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
