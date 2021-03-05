package com.company;

public class Footballer implements IAthlete{
    private int goals;
    private double salary;

    public Footballer(){

    }
    public Footballer(int goals, double salary) {
        this.goals = goals;
        this.salary = salary;
    }
    public String commentsToSalaryByEuros(){
        if (salary <= 100000 && salary >= 50000){
            return "You're a deep reserve player";
        } else if(salary > 100000 && salary <= 500000){
            return "You are a reserve player or a promising youth player";
        }else if (salary > 500000 && salary <= 1000000){
            return "You're a player who sometimes comes out to play";
        }else if (salary > 1000000 && salary <= 5000000) {
            return "You are already a well-known player and you go out on the field often";
        }else if (salary > 50000000){
            return "You are a man who has a contract like Messi";
        }else{
            return "It's time to think about retirement";
        }

    }

    public String seasonQuality(){
        if (goals > 40){
            return "You are G.O.A.T";
        } else if (goals > 20) {
            return "Perfect season";
        }else if (goals > 10){
            return "Good season";
        }else{
            return "It's time to think about retirement";
        }
    }
    @Override
    public void training() {
        System.out.println("I practice free kicks and especially penalties");
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "goals=" + goals +
                ", salary=" + salary +
                '}';
    }
}
