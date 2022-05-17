package com.company;

public class realMadrid {
    int power;
    int speed;
    int endurence;

    public realMadrid(int power, int speed, int endurence) {
        this.power = power;
        this.speed = speed;
        this.endurence = endurence;
    }

    void startpower() {
        power = 50;
        System.out.println("RealMadrid атакує із силою " + power);
    }

    int startspeed() {
       int speed = 80;
       System.out.println("Швидкість під час контролю м'яча "+ speed);

        return 0;
    }
    double startspeed(double speed){
        double spee = speed + 30;
        System.out.println("Після втрати м'яча швидкість збільшилась на "+ spee);
        return spee;
    }
    static void vorotareal(double height, double width){
        double square = height * width;
        System.out.println("Висота: " + height + " Ширина: "+ width+ " Площа: "+ square);
    }
}
