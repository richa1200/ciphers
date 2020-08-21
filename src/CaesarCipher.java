public class CaesarCipher {
    public static String encrypt(String str, int key) {
        String encrypted = "";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len; i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                int ascii = (int) ch;
                //System.out.print("Char = "+ch+" "+" ascii =" + ascii);
                ascii += key;
                // System.out.print("  Ascii after =" +ascii+" ");
                if (ascii > 90)
                    ascii -= 26;
                //System.out.print("char after" + (char)ascii);
                encrypted = encrypted + (char) ascii;
            } else {
                encrypted = encrypted + ' ';
            }
            System.out.println();
        }
        return encrypted;
    }

    public static String encrypt_2keys(String str, int key1, int key2) {
        String encrypted = "";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                int ascii = (int) ch;
                if (i % 2 == 0)
                    ascii += key1;
                else
                    ascii += key2;
                if (ascii > 90)
                    ascii -= 26;
                //System.out.print("char after" + (char)ascii);
                encrypted = encrypted + (char) ascii;
            } else {
                encrypted = encrypted + ' ';
            }
            //System.out.println();
        }
        return encrypted;
    }

    //public static int wordLength(String)

    public static void main(String[] args) {
        String enc = encrypt_2keys("Can you imagine life WITHOUT the internet AND computers in your pocket?", 21, 8);
        System.out.println(enc.toLowerCase());
    }
}
