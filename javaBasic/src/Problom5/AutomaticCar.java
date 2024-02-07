package problem4.entities;

import problem4.abstracts.Car;
import problem4.abstracts.Vehicle;

public class AutomaticCar extends Car implements Vehicle {

    public AutomaticCar(String vin, String color, boolean isStart) {
        super(vin, color, isStart);
    }

    @Override
    public void accelerate() {
        System.out.println("자동 변속기 자동차가 가속합니다!");
    }

    @Override
    public void stop() {
        System.out.println("자동 변속기 자동차가 정차합니다!");
    }

    @Override
    public void setStart() {
        super.setStart();
    }
}