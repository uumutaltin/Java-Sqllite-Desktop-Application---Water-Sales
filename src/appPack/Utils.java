package appPack;

public class Utils {
    
    //to avoid java.lang.numberformatexception 
    public static boolean checkParseLong(String input) {
        boolean isParseable = false;

        try {
            Long.parseLong(input);
            isParseable = true;
        } catch (Exception e) {
            System.out.println("parseInteger Error : " + e);
        }

        return isParseable;
    }

    public static boolean isValidPhone(String input){
        boolean isValid = false;
        
        if(checkParseLong(input) && input.length() == 10){
            isValid = true;
        }
        if(input.startsWith("0")){
            isValid= false;
        }
        
        
        
        return isValid;
    }

}
