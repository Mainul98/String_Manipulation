package oop;

public class MySalary {
    public int getSalary(int hour){
        return hour*500;
    }
    public int getSalary(int hour, int overtime){
        return (hour*500)+(overtime*700);
    }
    public static void main(String[] args) {
        MySalary rafiq=new MySalary();
        int salary= rafiq.getSalary(8,2);
        System.out.println(salary);
    }
}
