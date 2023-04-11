package org.example.homework_nr_6;

public class Date {
    public static void main(String[] args){
        Date date = new Date(4, 03, 1997);
        date.displayDate();
    }
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        /*this.day = day;
        this.month = month;
        this.year = year;*/
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if(day > 0 && day <=31) {
            this.day = day;
        }else {
            System.out.println("Invalid day value" + day);
        }
    }

    public void setMonth(int month) {
        if(month > 0 && month <=12){
            this.month = month;
        }else{
            System.out.println("Invalid mont value" + month);
        }

    }
    public void setYear(int year) {
        this.year = year;
    }
    public void displayDate(){
        System.out.println( day + "/" + month + "/" + year);
    }
}
