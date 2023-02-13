import java.util.ArrayList;
import java.util.List;

public class Track {
    static Track game;

    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public Track(List<Car> cars) {
        this.cars = cars;
    }

    void run() throws InterruptedException {
        for (int i = 0; i < 70; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    void move() {
        for (Car car : cars) {
            car.move();
        }
    }

    void print() {
        for (Car car: cars){
            car.print();
        }
        for (int i = 0;  i < 10; i++) {
            System.out.println();
        }
    }

    public Car getWinner(){
        Car result = cars.get(0);
        for (Car car : cars) {
            if (car.getDistance() > result.getDistance()){
                result = car;
            }
        }
        return result;
    }
    public void printWinner(){
        System.out.println("The winner is " + getWinner());
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Track(new ArrayList<>());
        game.getCars().add(new Car("Toyota", 2022, 35677, "silver", 1.6, 3, 0));
        game.getCars().add(new Car("Mazda", 2022, 35677, "silver", 1.6, 3, 0));
        game.getCars().add(new Car("Jeep", 2022, 35677, "silver", 1.6, 3, 0));
        game.run();

        game.printWinner();
    }


}
