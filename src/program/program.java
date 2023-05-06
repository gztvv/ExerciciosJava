package program;

import model.entities.Account;
import model.exceptions.LimitWithdraw;
import model.exceptions.NotEnoughBalance;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number;
        String holder;
        double balance;
        double withdrawLimit;
        double withdraw;

        System.out.println("Entre com os dados da conta");
        System.out.print("Numero: ");
        number = sc.nextInt();
        System.out.print("Proprietario: ");
        holder = sc.next();
        System.out.print("Saldo Inicial da conta: ");
        balance = sc.nextDouble();
        System.out.print("Limite para saques: ");
        withdrawLimit = sc.nextDouble();

        Account conta = new Account(number,holder,balance,withdrawLimit);

        System.out.println("Entre com um valor para saque: ");
        withdraw = sc.nextDouble();

        try {
            conta.withdraw(withdraw);
            System.out.println(conta.getBalance());
        }
        catch (NotEnoughBalance | LimitWithdraw ne) {
            System.out.println("Erro : " + ne.getMessage());
        }


        sc.close();
    }

}
