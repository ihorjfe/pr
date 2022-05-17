package com.company;

public class mansiti {
    int power;
    int speed;
    int endurence;

    public mansiti(int power, int speed, int endurence) {
        this.power = power;
        this.speed = speed;
        this.endurence = endurence;

    }

    void startendurence() {
        endurence = 60;
        System.out.println("Mansiti захищаються і витривалості  залишається " + (endurence-10));
    }

    int  startpower(){
    power = 80;
    System.out.println("Сила на час виходу із оборони"+power);
    return 0;
    }
    double startpower(double power) {
        double powe = power + 20;
        System.out.println("Сила під кінець атаки "+powe);
        return  powe;
    }
    static void vorotamansiti(double height, double width){
        double square = height * width;
        System.out.println("Висота: " + height + " Ширина: "+ width+ " Площа: "+ square);
    }
}