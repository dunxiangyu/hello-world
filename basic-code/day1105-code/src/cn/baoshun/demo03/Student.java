package cn.baoshun.demo03;

/*
* 对于基本类型的boolean的数据，他的Getter方法使用isXxx的形式，而set方法的命名不变
* */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return this.male;
    }
}
