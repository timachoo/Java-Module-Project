import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Привет, username! Это калькулятор счета.\n");

        //Заполним количество человек на которых будем делить счет
        int persons = getPersonCount();

        //Заполним счет позициями
        Bill bill = fillBill();

        //Напечатаем счет
        bill.printBill();

        //Напечатаем информацию о сумме на человека
        bill.printSplitSum(persons);
    }

    private static int getPersonCount() {
        System.out.println("На сколько человек нужно разделить счет?");

        int persons = 0;
        String inputText;
        boolean finishFlag = false;

        while (persons <= 1 && !finishFlag) {
            inputText = scanner.nextLine().trim();

            if (Messages.Bye(inputText)) {
                finishFlag = true;
            } else {
                try {
                    persons = Integer.parseInt(inputText);

                    if (persons <= 0) {
                        System.out.println("Нет людей - нет проблем! Нельзя разделить счет на 0 или меньше человек! Попробуйте еще раз.");
                    } else if (persons == 1) {
                        System.out.println("Forever alone! Найди друзей, нельзя разделить счет на одного! Попробуй еще раз.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Мы точно в этой вселенной? Используй арабские цифры. Попробуй еще раз. ");
                }
            }
        }

        return persons;
    }

    private static Bill fillBill(){
        Bill bill = new Bill();
        System.out.println("Введите позиции из счета.\n");

        String inputText;
        boolean finishFlag = false;

        while (!finishFlag) {
            bill.addProduct();

            System.out.println("Добавить еще один продукт? Для завершения введите \"" + Messages.FINISH_PHRASE + "\"");
            inputText = scanner.nextLine();

            if (Messages.Bye(inputText)) {
                finishFlag = true;
            }

        }

        return bill;
    }

}