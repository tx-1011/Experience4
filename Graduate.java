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
    public double getxuefei(){//����ÿѧ��ķ���
        return xuefei * 2;
    }
    public double setsalary(){
        return 0;
    }
    public double getsalary(){//����������
        return salary * 12;
    }

}