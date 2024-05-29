package com.ushakovdv.mylife.first.bank;

public class Bank {

    public BankAccount createNewAccount(String typeAccount, String currency) { // создать метод createNewAccount, который принимает на вход строку с типом аккаунта и строку с создаваемой валютой

        if (typeAccount.equals("debit_account")) { // если тип "debit_account"
            System.out.println("Ваш дебетовый счёт создан"); // вывести сообщение "Ваш дебетовый счёт создан"
            DebitAccount debitAccount = new DebitAccount(0, currency); // создать дебетовый аккаунт в выбранной валюте и с нулевым балансом
            return debitAccount;
        } else if (typeAccount.equals("credit_account")) { // если тип "credit_account"
            int creditLimit = calculateCreditLimit(currency); // посчитать кредитный лимит в зависимости от валюты
            System.out.println("Кредитный счёт создан. Ваш лимит по счёту " + creditLimit + " " + currency); // вывести сообщение "Кредитный счёт создан. Ваш лимит по счёту {limit} {currency}"
            CreditAccount creditAccount = new CreditAccount(0, currency, creditLimit); // создать кредитный аккаунт в выбранной валюте и с посчитанным кредитным лимитом
            return creditAccount;
        } else { // иначе
            System.out.println("Неверно указан тип создаваемого счёта"); // вывести сообщение "Неверно указан тип создаваемого счёта"
            BankAccount bankAccount = new BankAccount();// создать пустой объект BankAccount()
            return bankAccount;
        }
    }


    public void closeAccount(BankAccount bankAccount){ // создать метод closeAccount, который принимает на вход переменную типа BankAccount
        if (bankAccount instanceof DebitAccount) { // если переданный аккаунт дебетовый
            if (bankAccount.amount == 0) { // если на счету нет денег, вывести сообщение "Ваш дебетовый счёт закрыт"
                System.out.println("Ваш дебетовый счёт закрыт");
            } else {   // иначе вывести сообщение "Ваш дебетовый счёт закрыт. Вы можете получить остаток по вашему счёту в размере {amount} {currency} в отделении банка"
                System.out.println("Ваш дебетовый счёт закрыт. Вы можете получить остаток по вашему счёту в размере " + bankAccount.amount + " " + bankAccount.currency + " в отделении банка");
            }
        } else if (bankAccount instanceof CreditAccount) { // если переданный аккаунт кредитный
            if (bankAccount.amount == 0)  {
                System.out.println("Ваш кредитный счёт закрыт");
            } else if (bankAccount.amount > 0)  {   // если на счету положительный баланс, вывести сообщение "Ваш кредитный счёт закрыт. Вы можете получить остаток по вашему счёту в размере {amount} {currency} в отделении банка"
                System.out.println("Ваш кредитный счёт закрыт. Вы можете получить остаток по вашему счёту в размере " + bankAccount.amount + " " + bankAccount.currency + " в отделении банка");
            } else { // если на счету отрицательный баланс, вывести сообщение "Вы не можете закрыть кредитный счёт, потому как на нём ещё есть задолженность. Ваша задолженность по счёту составляет {amount} {currency}"
                System.out.println("Вы не можете закрыть кредитный счёт, потому как на нём ещё есть задолженность. Ваша задолженность по счёту составляет " + bankAccount.amount + " " + bankAccount.currency);
            }
        } else {
            System.out.println("Пока что мы не можем закрыть данный вид счёта"); // иначе вывести сообщение "Пока что мы не можем закрыть данный вид счёта"
        }
    }


    private int calculateCreditLimit(String currency) {
        switch (currency) {
            case "RUB" :
                return 100000;

            case "USD" :
                return 1250;

            case "EUR" :
                return 1000;

            default :
                return 0;

        }
    }
}
