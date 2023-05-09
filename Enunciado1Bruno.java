public class Enunciado1Bruno{
    public static void main(String[] args){
       String s1 = "ABCDEFGHIJKLMN";
       String s2 = "EFGH";

         System.out.println(stringMatch(s1, s2));
    }

    public static int stringMatch(String s1, String s2){
        for(int i=0; i<s1.length(); i++){
            
            if(s1.charAt(i) == s2.charAt(0)){
                int aux = i;

               for(int k = 0; k<=s2.length(); k++){
                    if(s2.charAt(k)!=s1.charAt(aux)){
                        break;
                    }else
                        aux++;
                    
                    if(k==s2.length()-1){
                        return i;
                    }
               }
            }
        }
        return -1;
 
    }
}
    