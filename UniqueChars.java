/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {
        String fin = "";
        int length = str.length();
        for (int i=0; i<length; i++){
         //assigns char at i to 'c'
         char c= str.charAt(i);
         if (i==str.indexOf(c)){
            fin+=c;
         }
         else if (c == ' '){
            fin+=c;
         }

           } 
        
   



        return fin;
    }
}