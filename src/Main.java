public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Операционная система не определена");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int clientDeviceYear = 2015;
        int yearOut = 2023;
        int clientOS = 0;

        if ((clientOS == 0) && (yearOut >= clientDeviceYear)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientOS == 0) && (yearOut < clientDeviceYear)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if ((clientOS == 1) && (yearOut >= clientDeviceYear)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ((clientOS == 1) && (yearOut < clientDeviceYear)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if ((clientOS > 1 || clientOS < 0)) {
            System.out.println("Операционная система не определена");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int year = 2200;
        boolean leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (leapYear) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int deliveryDistance = 101;
        int day = 0;
        boolean dayOne = ((deliveryDistance > 0) && (deliveryDistance < 20));
        boolean dayTwo = ((deliveryDistance >= 20) && deliveryDistance < 60);
        boolean dayThree = ((deliveryDistance >= 60) && (deliveryDistance < 100));

        if (dayOne) {
            System.out.println("Потребуется дней: " + day);
        }
        else if (dayTwo) {
            System.out.println("Потребуется дней: " + day + 1);
        }
        else if (dayThree) {
            System.out.println("Потребуется дней: " + day + 2);
        }
        else {
            System.out.println("Доставки нет");
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к зимнему сезону");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к весеннему сезону");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к летнему сезону");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к осеннему сезону");
                break;
            default:
                System.out.println("Нет такого месяца");

        }
    }

}