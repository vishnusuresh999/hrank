
public class CeaserCipher {
    
    public static void main(String[] args) {
        System.out.println( ceaserCipher("middle-Outz", 2));//bcdea
    }
    
    private static String ceaserCipher(String s, int k) {
        String result = "";
        for(char ch : s.toCharArray()) {
            int character = (int)ch;
            int newcharacter = character + ( k % 26 );
            if(character>=65 && character<=90) {
                if(newcharacter>90) {
                    newcharacter = 65 + newcharacter - 90 - 1;
                } else {
                    newcharacter = character + (k % 26);
                }
            } else if(character>=97 && character<=122) {
                if(newcharacter>122) {
                    newcharacter = 97 + newcharacter - 122 - 1;
                } else {
                    newcharacter = character + (k % 26);
                }
            } else {
                newcharacter = ch;
            }
            result += (char) newcharacter;
        }
        return result;
    }
}
