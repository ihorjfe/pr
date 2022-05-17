package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println("Початок матчу");
    System.out.println();


	realMadrid real = new realMadrid(100,80,90);
    System.out.println("Realmadrid-" + " Сила: "+ real.power+" Швидкість: " + real.speed+ " Витривалість:"+ real.endurence);
    real.startpower();
    System.out.println("Після атаки швидкість зменшилась на "+ real.speed);
    real.startspeed();
    real.startspeed(80);
    realMadrid.vorotareal(2.44, 7.32);
    System.out.println();

    mansiti siti = new mansiti(99, 85,60);
    System.out.println("Mansiti-"+ " Сила: "+ siti.power + " Швидкість: " + siti.speed+ " Витривалість:"+ real.endurence );
    siti.startendurence();
    System.out.println("На початку атаки сила збільшилась на " + siti.power);
    siti.startpower();
    siti.startpower(90);
    mansiti.vorotamansiti(2.44, 7.32);
    System.out.println();

    System.out.println();
    field fiel = new field(68,105,7140);
    System.out.println("Field-"+ "Ширина: "+ fiel.width+ " Довжина:"+ fiel.length+" Площа:"+ fiel.sqyare);
    System.out.println("За перші 10хв гравці пробігли відстань : "+ fiel.startwidth());
    fiel.startfield();
    fiel.startwidth(600);
    fiel.startwidth();
    field.stadion(300, 2.945,34915);
    field myfield1 = new field(68,105,7140);
    field myfield2 = new field();
    field myfield3 = new field(6);
    System.out.println(myfield1.volume());
    System.out.println(myfield2.volume());
    System.out.println(myfield3.volume());

    System.out.println();
    System.out.println("Кінець матчу");

    }
}
