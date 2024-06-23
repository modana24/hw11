public class elevenHomeTask {
    public static void main(String[] args) {
        //task1
        int taskYear = 2023;
        printLeapCode(taskYear);

        //task2
        int clientOS = 1;
        int clientDeviceYear = 2002;
        printTheCorrectOS(clientOS, clientDeviceYear);

        //task3
        int distance = 95;
        countDeliveryDays(distance);

    }

    public static void printLeapCode(int year) {
        if (year % 4 == 0 && year > 1584 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");

        }
    }

    public static void printTheCorrectOS(int type, int year) {
        if (type == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (type == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (type == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void countDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }
}
