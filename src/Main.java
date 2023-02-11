public class Main {
    public static void main(String[] args) {

        int account = 100;
        int deposit = 12000;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int totalAmount =deposit + bonus;

        System.out.println("Итоговая сумма на счете: ");
        System.out.println(totalAmount);
        System.out.println("P");
        System.out.println(" в том чмсле бонус за пополнение: ");
        System.out.println(bonus);
        System.out.println("P");

    }
}