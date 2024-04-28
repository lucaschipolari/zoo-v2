package Vista;

public class Utils {
    public static boolean isNullOrEmpty(String text){
        return  text == null || text.trim().isEmpty();
    }
    public static boolean isNotANumber(String text){
        return isNullOrEmpty(text) || !isANumber(text);
    }
    public static boolean isANumber(String text){
        return  !isNullOrEmpty(text) && text.chars().allMatch( Character::isDigit );
    }
}
