public class ShoppingCartTotalCalculator {
    public static void main(String[] args) {
        String[] prices = {"250","499","abc","490"};

        int total = 0;
        for(String price : prices){
            try{
                int value = Integer.parseInt(price);
                total += value;
            }catch (NumberFormatException e){
                System.out.println("Invalid price found: "+price);
            }
        }
        System.out.println("The total price is:"+total);
    }
}
