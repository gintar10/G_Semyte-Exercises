package lt.techin.pd8;

public class PD8_5 {
    public static void main(String[] args) {
        MoneyBox moneyBox = new MoneyBox();
        moneyBox.deposit(100);
        moneyBox.deposit(400);
        moneyBox.deposit(400);
        moneyBox.deposit(300);
        System.out.println(moneyBox.withDraw(900));
        System.out.println(moneyBox.getAverageAmount());
        System.out.println(moneyBox.isEmpty());
    }
}
