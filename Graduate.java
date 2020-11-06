package text4;

public class Graduate implements Student, Teacher{
    public String name;
    public String sex;
    public int age;
    private double xuefei;
    private double salary;
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setmoney(double name, double sex) {
        xuefei = name;
        salary = sex;
    }
    public double setxuefei(){
        return 0;
    }
    public double getxuefei(){//返回每学年的费用
        return xuefei * 2;
    }
    public double setsalary(){
        return 0;
    }
    public double getsalary(){//返回年收入
        return salary * 12;
    }

}