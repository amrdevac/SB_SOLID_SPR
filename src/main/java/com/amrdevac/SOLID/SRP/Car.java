package com.amrdevac.SOLID.SRP;

public class Car {
    public static void main(String[] args) {
        ICarService carFunction = new CarService();
        carFunction.turnOfTheEngine();
        carFunction.turnOfTheEngine();
        carFunction.honkTheCar("BEEP BEEP");
    }

}

interface ICarService {
    void turnOnTheEngine();

    void turnOfTheEngine();

    void honkTheCar(String honkMessage);
}

class CarService implements ICarService {

    @Override
    public void turnOnTheEngine() {
        System.out.println("ENGINE ON");
    }

    @Override
    public void turnOfTheEngine() {
        System.out.println("ENGINE Off");
    }

    @Override
    public void honkTheCar(String honkMessage) {
        System.out.println(honkMessage);
    }
}
