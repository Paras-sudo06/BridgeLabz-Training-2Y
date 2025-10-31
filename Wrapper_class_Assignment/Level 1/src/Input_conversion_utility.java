public class Input_conversion_utility {
    public static void main(String[] args) {
        String[] inputs = {"123","abc","45.6","0"};

        for(String input : inputs){
            int result = safeParseInt(input);
            System.out.println("Input: "+ input + " Output: "+result);
        }
    }
    public static int safeParseInt(String input){
        try{
            return Integer.parseInt(input);
        }
        catch (NumberFormatException e){
            return -1;
        }
    }
}
