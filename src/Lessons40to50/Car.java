package Lessons40to50;

public class Car {
    private class Motor {
        int power;

        public Motor(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }
    }

    public int start() {
        Car.Motor motor = new Car.Motor(100);
        return motor.getPower();
    }


}
