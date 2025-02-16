public class valid {
    public static boolean palindrome(String str){

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        String str="A man, a plan, a canal; panama";
        System.out.println(palindrome(str));
    }
}
