package minggu5;

public class Showroom {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("BMW", "M2 Coupe", 2016, 6816, 728),
                new Car("Ford", "Fiesta ST", 2014, 3921, 575),
                new Car("Nissan", "370Z", 2009, 4360, 657),
                new Car("Subaru", "BRZ", 2014, 4058, 609),
                new Car("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Car("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Car("Toyota", "86/GT86", 2014, 4180, 609),
                new Car("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int maxAcceleration = findMaxAcceleration(cars, 0, cars.length - 1);
        System.out.println("Top acceleration tertinggi: " + maxAcceleration);
        int minAcceleration = findMinAcceleration(cars, 0, cars.length - 1);
        System.out.println("Top acceleration terendah: " + minAcceleration);
        double averagePower = calculateAveragePower(cars);
        System.out.println("Rata-rata top power: " + averagePower);
    }
    static int findMaxAcceleration(Car[] cars, int low, int high) {
        if (low == high)
            return cars[low].top_acceleration;

        int mid = (low + high) / 2;
        int leftMax = findMaxAcceleration(cars, low, mid);
        int rightMax = findMaxAcceleration(cars, mid + 1, high);

        return Math.max(leftMax, rightMax);
    }
    static int findMinAcceleration(Car[] cars, int low, int high) {
        if (low == high)
            return cars[low].top_acceleration;

        int mid = (low + high) / 2;
        int leftMin = findMinAcceleration(cars, low, mid);
        int rightMin = findMinAcceleration(cars, mid + 1, high);

        return Math.min(leftMin, rightMin);
    }
    static double calculateAveragePower(Car[] cars) {
        int totalPower = 0;
        for (Car car : cars) {
            totalPower += car.top_power;
        }
        return (double) totalPower / cars.length;
    }
}
