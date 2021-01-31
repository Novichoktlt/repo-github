package lesson4.online;

public class Employees {

    private static int n = 0;
    public int id;
    private String fullName;
    private String position;
    private String phone;
    private int salary;
    private int age;
    float increase = 10000;


    public Employees(String fullName, String position, String phone, int salary, int age) {
        this.id = ++n;
        this.fullName = fullName;
        this.position = position ;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }


    public String getFullName(){
        return fullName;
    }

    String getPosition(){
        return position;
    }

    String getPhone(){
        return phone;
    }


    int getSalary(){
        return salary;
    }

    int getAge(){
        return age;
    }

    public void setSalary(int increase) {
        this.salary = this.salary + increase;
    }



    String getList(){
       return this.id + " " + this.fullName + ", должность: " + this.position + ", телефон: " + phone +
               ", заработная плата: " + salary + ", возрост: " + age;
    }








}
