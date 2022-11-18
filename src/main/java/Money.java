public class Money {
    public static String getRurPrice(double price){

        String result;

        if (price%100>=11&&price%100<=14){
            result = String.format("%.2f рублей", price);
        } else {
            switch ((int)price%10) {
                case 1:
                    result = String.format("%.2f рубль", price);
                    break;
                case 2:
                case 3:
                case 4:
                    result = String.format("%.2f рубля", price);
                    break;
                default:
                    result = String.format("%.2f рублей", price);
                    break;
            }
        }
        return result;
    }
}
