package Zavdannya4;

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
        this(rik);
        this.speed=speed;
    }
    public Car ( int rik,double speed,int vaga){
        this(rik, speed);
        this.vaga=vaga;
    }
    public Car ( int rik,double speed,int vaga,String kollir){
        this(rik, speed, vaga);
        this.kollir=kollir;

    }

}