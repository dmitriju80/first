package com.ushakovdv.mylife.first.hamster;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class HamsterFactory {
    static final Scanner scanner = new Scanner(System.in);
ArrayList  <Hamster> fabric = new ArrayList <Hamster>();

    public void start() {
        try {
            while (true) {
                System.out.println("Введите команду...");

                String commandName = scanner.nextLine();
               if (commandName.equalsIgnoreCase("завершить")) {
                   System.out.println("Программа завершена! Спасибо за то, что пользуетесь нашей сетью хомячих фабрик");
                   break;}
               else {

                   //Interface.execute(commandName, this);
               }
                //, который распознаёт команду и вызывает необходимый метод для её обработки
            }
        } catch (Exception e) {
            System.out.println("Ошибка выполнения: " + e.getMessage());
        }
    }
/*
    public void ExecutePrint() {
        ... // выведите сообщение: "Вывожу актуальный список хомяков в хранилище:"
        ... // вам нужно напечатать всех хомяков, которые есть в хранилище
    }

    public void executeCreate(String name) {
        ... // создайте хомяка с именем [name] и добавьте его в ваше хранилище
        ... // выведите сообщение: "Хомяк '[name]' создан и добавлен в хранилище"
    }

    public void executeRemoveByIndex(int index) {
        ... // если хомяк существует - удалить его и вывести в лог сообщение: "Хомяк '[Имя удалённого хомяка]' удалён успешно"
        ... // иначе вывести в лог сообщение: "Хомяка по заданному индексу не существует"
    }

    public void executeClear() {
        ... // очистить хранилище и вывести в лог сообщение: "Операция очистки завершена успешно! Все хомяки были удалены из хранилища"
    }

    public void executeSet(int index, String name) {
        ... // создайте хомяка с именем [name] и замените им хомяка на позиции [index]
        ... // выведите сообщение "Хомяк '[Имя удалённого хомяка]' был успешно заменён на хомяка '[Имя нового хомяка]'"
    }

    public void executeSize() {
        ... // если в хранилище есть хомяки - вывести в лог: "Количество хомяков в хранилище равно [текущее количество хомяков в хранилище]"
        ... // иначе - вывести в лог: "В хранилище нет хомяков"
    }

    public void showErrorMessage() {
        ... // вывести сообщение: "Неверная команда, попробуйте ещё раз."
    }
*/
}
