public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // начальный баланс счета
        int deposit = 3080; // сумма пополнения

        int bonus = (deposit > 1000) ? deposit / 10 : 0;

        // итог
        int finalBalance = initialBalance + deposit + bonus;

        System.out.println("бонусные рубли: " + bonus);
        System.out.println("итоговый баланс: " + finalBalance);

    }
}