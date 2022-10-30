package Zavdannya3;

public class Car {
    public int rik;
    public double speed;
    public int vaga;
    public String kollir;

    public Car(){
    }
 public Car ( int rik){
        this.rik=rik;
 }
    public Car ( int rik,double speed){
        this.rik=rik;
        this.speed=speed;
    }
    public Car ( int rik,double speed,int vaga){
        this.rik=rik;
        this.speed=speed;
        this.vaga=vaga;
    }
    public Car ( int rik,double speed,int vaga,String kollir){
        this.rik=rik;
        this.speed=speed;
        this.vaga=vaga;
        this.kollir=kollir;

    }

}



/* Використовуючи Intelij IDEA, створити проект, пакет.
(Наново!) Створити клас Машина з полями рік(int), швидкість(double),
вага(int) колір(String). Створити конструктор за замовчуванням,
конструктор з 1 параметром, 2-а, 3-я, 4-а. Перевантажити конструктори.
Створити клас Main, де створити екземляри класу Машина з різними параметрами. */