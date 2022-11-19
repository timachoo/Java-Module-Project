public class Messages {
    public static final String FINISH_PHRASE = "Завершить";

    public static boolean Bye(String text){
        if (FINISH_PHRASE.equalsIgnoreCase(text.trim())) {
            System.out.println("Bye!");
            return true;
        }
        return false;
    }
}
