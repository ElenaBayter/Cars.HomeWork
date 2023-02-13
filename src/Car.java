/*
Напишите класс Car.
    В классе должна храниться следующая информация:
    название автомобиля  - model;
    год выпуска - year;
    стоимость - price;
    цвет - color;
    объем двигателя - power.

    Добавьте в класс Car метод getInfo без параметров, который будет печать на экране значения полей объекта
    класса  model , power и yeare.



    Доработайте класс Car.
    В классе должна храниться следующая информация:
	Свойство - которое говорит заведен авто или нет
	Метод - запуска автомобиля
    Метод - остановки автомобиля
	Метод дороги - при вызове, в качестве аргумента передаем место назначения
	И если авто заведён - выводим, что мы на такой-то авто едем место назначения
	Если не заведён - сообщить, что авто не заведено. И мы не можем ехать

	Доработайте программу в свободном стиле.
    Можно сравнить 2 автомобиля между собой
    Или пусть авто заедет за фруктами :-)
    Добавьте несколько произвольных методов и свойств
    <br>
    ДОП: Сделать гонки:
    - задаём растояние
    - едут до финиша.
    Сказать кто победит.

 */

import java.util.Random;

public class Cars {
    String model;
    int year;
    double price;
    String color;
    double power;
    boolean isEngine;

    public Cars(String model2, int year2, double price2, String color2, double power2) {
        this.model = model2;
        this.year = year2;
        this.price = price2;
        this.color = color2;
        this.power = power2;
        this.isEngine = false;
    }

    public void getInfo(){
        System.out.println("Model:" + model + ", year: " + year + ", price: " + price + ", color: " + color + ", power: " + power);
    }

    public void start()
    {
        this.isEngine = true;
        System.out.println(this.model + " is working");
    }

    public void stop()
    {
        this.isEngine = false;
        System.out.println(this.model + " is stopped");
    }

    public void road(String place) {
        if (this.isEngine)
            System.out.println(this.model + " goes to " + place);
        else
            System.out.println(this.model + " is not going anywhere");
    }

    public void newCar(){
        if (this.year > this.year){
            System.out.println(this.model + " is more new");
        }
    }
    Random random = new Random();

    public void rides(){
        
    }
}
