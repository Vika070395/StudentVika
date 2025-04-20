package by.homework.lessons.task16;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account a1 = new Account(1, "1111", "BYN", 500.0);
        Account a2 = new Account(2, "1222", "BYN", 300.0);
        Account a3 = new Account(3, "1333", "BYN", 1000.0);
        Account a4 = new Account(4, "1444", "BYN", 1500.0);
        Account a5 = new Account(5, "1555", "BYN", 700.0);


        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);
        bank.addAccount(a4);
        bank.addAccount(a5);


        try {
            bank.transferMoney("1111", "1222", 100.0);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }

        System.out.println("Финальные балансы:");
        for (Account acc : bank.accounts) {
            System.out.println(acc);
        }
    }
}
