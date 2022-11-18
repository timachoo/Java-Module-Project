import java.util.Scanner;

public class Product {
    private static final Scanner scanner = new Scanner(System.in);
    private String name;
    private double price = 0;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Запрос наименования позиции
    public static String initName(){
        System.out.println("Введите наименовние позиции из счете");

        String inputText = "";

        while(inputText.isEmpty()) {
            inputText = scanner.nextLine();

            if (inputText.isEmpty()){
                System.out.println("Наименованое не может быть пустым. Попробуйте еще раз.");
            }
        }

        return inputText;
    }

    //Запрос цены по позиции
    public static double initPrice(){
        System.out.println("Введите стоимость позиции из счете в формате XX.XX");

        String inputText;
        double price = 0;

        while (price <= 0) {
            inputText = scanner.nextLine().trim();
            try {
                price = Double.parseDouble(inputText.replace(",", "."));

                if(price < 0) {
                    System.out.println("Стоимость не может быть отрицательной. Попробуйте еще раз.");
                } else if (price == 0){
                    System.out.println("Стоимость не может быть равна 0. Попробуйте еще раз.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите стоимость позиции из счете в формате XX.XX. Попробуйте еще раз.");
            }
        }

        return price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
