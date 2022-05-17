package com.company;

public class field {
    int width;
    int length;
    int sqyare;
    public field(int width, int length, int  sqyare){
    this.width=width;
    this.length=length;
    this.sqyare=sqyare;
}
    void startfield(){
    length = 108;
    System.out.println("Гравець команди пробіг всю довжину поля і вернувся і подолав відстань:"+ (2*length));
}
    int startwidth(int i){

    width= 600;
    return width;
}
    double startwidth(){
        double wid = width + 700;
        System.out.println("Відстань RealMadrid пройдена під час оборони"+wid);
        return wid;
    }
    static void stadion(double height, double price, double contains ){

    }
    field(){
    width = 0;
    length = 0;
    sqyare = 0;
    }
    field(int len){
        width = length = sqyare = len;
    }
    double volume(){
        return width * length * sqyare;
    }
}
