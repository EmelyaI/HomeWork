package Task_1;

import java.util.Scanner;

public class CreditCard {
    Scanner scanner = new Scanner(System.in);
 private String[] cardNumber = {"1", "2", "3"};
 private int[] moneyOnThecard = {100, 200, 300};

    public String[] getCardNumber() {
        return cardNumber;
    }

    public int[] getMoneyOnThecard() {
        return moneyOnThecard;
    }

    public void setCardNumber(String[] cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setMoneyOnThecard(int[] moneyOnThecard) {
        this.moneyOnThecard = moneyOnThecard;
    }
    public void info (){
        System.out.println("What is you card number?");
        int n = scanner.nextInt();
        System.out.println("Card number - " + cardNumber[n - 1]);
        System.out.println("Money - " + moneyOnThecard[n - 1]);
    }
    public void add (){
        System.out.println("What is you card number?");
        int n = scanner.nextInt();
        System.out.println("How much money you wanna add?");
        int ad = scanner.nextInt();
        moneyOnThecard[n - 1] += ad;
    }
    public void withdraw (){
        System.out.println("What is you card number?");
        int n = scanner.nextInt();
        System.out.println("How much money you wanna withdraw?");
        int ad = scanner.nextInt();
        if (ad>moneyOnThecard[n - 1])
        {
            System.out.println("Not enough money");
        }else
        {
            moneyOnThecard[n - 1] -= ad;

        }

    }
}
