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

public class Car {
    private String model;
    private int year;
    private double price;
    private String color;
    private double power;
    private boolean isEngine;
    private double speed;
    private double distance;

    public Car(String model2, int year2, double price2, String color2, double power2,  double speed, double distance) {
        this.model = model2;
        this.year = year2;
        this.price = price2;
        this.color = color2;
        this.power = power2;
        this.isEngine = false;
        this.distance = distance;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public double getSpeed() {
        return speed;
    }
    public double getDistance() {
        return distance;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void setEngine(boolean engine) {
        isEngine = engine;
    }
    public void setSpeed (double speed) {
        this.speed = speed;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void getInfo() {
        System.out.println("Model:" + model + ", year: " + year + ", price: " + price + ", color: " + color + ", power: " + power);
    }

    public void start() {
        this.isEngine = true;
        System.out.println(this.model + " is working");
    }

    public void stop() {
        this.isEngine = false;
        System.out.println(this.model + " is stopped");
    }

    public void road(String place) {
        if (this.isEngine)
            System.out.println(this.model + " goes to " + place);
        else
            System.out.println(this.model + " is not going anywhere");
    }

    public void checkByYear(Car car1) {
        if (this.year == car1.getYear()) {
            //System.out.println("This " + this.color + " " + this.model + " same year with " + car1.getColor() + " " + car1.getModel());
            System.out.println(String.format("This %s %s same year with %s %s", this.color, this.model, car1.getColor(), car1.getModel()));
        }
        else if (this.year > car1.getYear()){
            System.out.println(String.format("This %s %s is younger then %s %s", this.color, this.model, car1.getColor(), car1.getModel()));
        }
        else {
            System.out.println(String.format("This %s %s is older then %s %s", this.color, this.model, car1.getColor(), car1.getModel()));
        }
    }
    void move(){
        this.distance += Math.random() * this.speed;
    }
    void print(){
        StringBuilder track = new StringBuilder();
        for (int i = 0; i < (int)this.distance; i++) {
            track.append(".");
        }
        System.out.println(track.toString() + model);
    }

    @Override
    public String toString() {
        return String.format("Model: " + model + " by year: " + year + " and with color: " + color + " with power: " + power + " and price:" + price);
    }
}



