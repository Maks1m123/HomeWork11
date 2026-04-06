
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello SkyPro!");

        leapYear(1892);
        deviceYear(1, 2004);
        int totalDays = deliveryDays(95);
        System.out.println("Потребуется дней: " + totalDays + " для доставки!");
    }

    public static void leapYear(int year) {
        //task1
        System.out.println("Task1");

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " Год является высокостным!");
        } else {
            System.out.println(year + " Год не является высокостным!");
        }
    }

    public static void deviceYear(int osType, int deviceYear) {
        //task2
        System.out.println("Task2");

        if (deviceYear < 2015) {
            if (osType == 0) {
                System.out.println("Установите облегченную версию для iOS");
            } else {
                System.out.println("Установите облегченную версию для Android");
            }
        } else {
            if (osType == 0) {
                System.out.println("Установите обычную версию для iOS");
            } else {
                System.out.println("Установите обычную версию для Android");
            }
        }


    }

    public static int deliveryDays(int distance) {
        //task2
        System.out.println("Task3");

        int days = 1;
        if (distance > 100) {
            return 0;
        }
        if (distance <= 20) {
        }
        if (distance > 20) {
            days++;
        }
        if (distance > 60) {
            days++;

        }
        return days;

    }

}
