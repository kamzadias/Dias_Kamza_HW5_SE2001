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
    public String checkSalaryByEuros(){
        if (salary <= 100000) return "You're a deep reserve player";
        if (salary > 100000 && salary <= 500000) return "You are a reserve player or a promising youth player";
        if (salary > 500000 && salary <= 1000000) return "You're a player who sometimes comes out to play";
        if (salary > 1000000 && salary <= 5000000) return "You are already a well-known player and you go out on the field often";
        if (salary > 50000000) return "You are a man who has a contract like Messi";
        return "It's time to think about retirement";
    }

    public String checkSeasonQuality(){
        if (goals > 40) return "You are G.O.A.T";
        if (goals > 20) return "Perfect season";
        if (goals > 10) return "Good season";
        return "It's time to think about retirement";
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
