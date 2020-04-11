package Miscellaneous;

public class ReverseString {
    public static void main(String[] args) {
        String str = new String("Elephant"), reverse;
        char[] rchar = new char[str.length()];

        for(int i = str.length(); i > 0; i--){
            rchar[str.length()-i] = str.charAt(i-1);
        }
        reverse = new String(rchar);
        //reverse = rchar.toString();  == Doesnt work.
        
        System.out.println("Reverse String  = " + reverse);
    }
}
