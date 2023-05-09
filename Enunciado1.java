import static java.util.Objects.hash;

public class Enunciado1 {
    private static long R = 26;
    private static int Q = 2147483647;

    public static void main (String[] args) {
        // System.out.println(stringMatch("ABCDCBDCBDACBDABDCBADF", "ADF"));
        // System.out.println(search("ABCDCBDCBDACBDABDCBADF", "ADF"));
        System.out.println(search("ana", "Pedro Gosta de Banana"));

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

    private static int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        long patHash = hash(pat, M);

        for (int i = 0; i <= N - M; i++) {
            long txtHash = hash(txt.substring(i, i+M), M);
            if (patHash == txtHash)
                return i; // ocorrência? colisão?
        }
        return N; // nenhuma ocorrência
    }

    private static long hash(String s, int M) {
        long h = 0;
        for (int j = 0; j < M; j++)
           h = (h * R + s.charAt(j)) % Q;
        return h;
     }



}
