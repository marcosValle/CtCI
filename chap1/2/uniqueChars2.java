public class uniqueChars2{
    public static void main (String[] args){
        int alphaBit = 0;
        String str = "banana";

        for(int i=0 ; i<str.length() ; i++){
            if(alphaBit.charAt(str[i]-'a') == 1){
                System.out.println("non unique");
                System.exit(1);                
            }

        }    
    }
}
