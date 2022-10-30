package Zavdannya2;

public class Main {
    public static void main(String[] args) {
    Car rik= new Car();
    Car kollir =new Car();
    Car rik2 = new Car(5);
    Car rik3 = new Car(10,"Green");


    rik.rik= 2;
    kollir.kollir ="Blue";

    //  book2.nameAuthor.Car();

    System.out.println("Произведенна "+rik.rik+ " года назад"+ " ,цвет машины "+kollir.kollir);
    System.out.println("Машина произведена "+rik2.rik+" лет назад");
    System.out.println("Машина произведена "+(rik3.rik)+" лет назад"+ " ,цвет машины "+(rik3.kollir));
}
}
