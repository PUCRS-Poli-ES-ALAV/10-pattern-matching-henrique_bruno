public class Enunciado1 {
    public static void main (String[] args) {
        System.out.println(stringMatch("ABCDCBDCBDACBDABDCBADF", "ADF"));

    }

    public static int stringMatch(String s1, String s2) {
        int contagem = 0;
       for (int i =0; i<s1.length(); i++) {

            if (s1.charAt(i) == s2.charAt(0)) {

                for (int j=0; j < s2.length(); j++ ) {

                    if (s2.charAt(j) == s1.charAt(i+j)) {
                        contagem++;
                    }
                }
                if (contagem == s2.length()) {
                    return i;
                }
                contagem = 0;
            }
       }
        return 0;
    }
}
