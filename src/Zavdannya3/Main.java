package Zavdannya3;

public class Main {
    public static void main(String[] args) {
Car car1 =new Car();
Car car2 =new Car(2001);
Car car3 =new Car(2010,100);
Car car4 =new Car(2018,120,250);
Car car5 =new Car(2020,150,260,"красный");

        car1.kollir="Голубая";       car2.kollir= "Черная";     car3.kollir= "Золотая";  car4.kollir= "Багровая";
        car1.speed =60;              car2.speed =90;
        car1.vaga = 220;             car2.vaga = 240;           car3.vaga = 245;
        car1.rik =1999;

System.out.println("Цвет машины " +car5.kollir+", середняя скорость "+
        car5.speed+" км/ч, масса машины "+ car5.vaga+" кг ,год производства "+car5.rik+" год.");

 System.out.println("Цвет машины " +car4.kollir+", середняя скорость "+
                car4.speed+" км/ч, масса машины "+ car4.vaga+" кг ,год производства "+car4.rik+" год.");

 System.out.println("Цвет машины " +car3.kollir+", середняя скорость "+
                car3.speed+" км/ч, масса машины "+ car3.vaga+" кг ,год производства "+car3.rik+" год.");

System.out.println("Цвет машины " +car2.kollir+", середняя скорость "+
                car2.speed+" км/ч, масса машины "+ car2.vaga+" кг ,год производства "+car2.rik+" год.");

 System.out.println("Цвет машины " +car1.kollir+", середняя скорость "+
                car1.speed+" км/ч, масса машины "+ car1.vaga+" кг ,год производства "+car1.rik+" год.");
    }
}
/* Використовуючи Intelij IDEA, створити проект, пакет.
(Наново!) Створити клас Машина з полями рік(int), швидкість(double),
вага(int) колір(String). Створити конструктор за замовчуванням,
конструктор з 1 параметром, 2-а, 3-я, 4-а. Перевантажити конструктори.
Створити клас Main, де створити екземляри класу Машина з різними параметрами. */
