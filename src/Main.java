public class Main {
    public static void main(String[] args) {
        int currentScore; // текущий счет
        int differenceScore; // сумма пополнения
        int bonus; //начисляемые бонусы
        int finalScore; //конечная сумма с учетом бонусов
        currentScore = 100;
        differenceScore = 1100;
        if (differenceScore > 1000) {
            bonus = differenceScore / 100;
        } else {
            bonus = 0;
        }
        finalScore = currentScore + differenceScore + bonus;

        System.out.println("Ваш итоговый счет составляет " + finalScore + " руб., колличество бонусных рублей после пополнения на сумму " + differenceScore + " руб. составляет " + bonus + " руб.");
    }
}