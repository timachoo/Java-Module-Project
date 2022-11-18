public class Messages {
    public static final String finishPhrase = "Завершить";

    public static boolean Bye(String text){
        if (text.equalsIgnoreCase(finishPhrase.trim())) {
            System.out.println("Bye!");
            return true;
        }
        return false;
    }
}
