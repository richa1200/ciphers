public class Breaking_caesar_cipher {

    public static String decrypt_1key(String str, int key){
        String decrypted = "";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len; i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                int ascii = (int) ch;
                //System.out.print("Char = "+ch+" "+" ascii =" + ascii);
                ascii -= key;
                // System.out.print("  Ascii after =" +ascii+" ");
                if (ascii < 65)
                    ascii += 26;
                //System.out.print("char after" + (char)ascii);
                decrypted = decrypted + (char) ascii;
            } else {
                decrypted = decrypted + ' ';
            }
            System.out.println();
        }
        return decrypted;
    }

    public static String decrypt_2keys(String str, int key1, int key2) {
        String decrypted = "";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len; i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                int ascii = (int) ch;
                if(i%2==0)
                    ascii -= key1;
                else
                    ascii -= key2;
                if (ascii < 65)
                    ascii += 26;
                //System.out.print("char after" + (char)ascii);
                decrypted = decrypted + (char) ascii;
            } else {
                decrypted = decrypted + ' ';
            }
            System.out.println();
        }
        return decrypted;
    }
    public static void main(String[] args) {
        String enc = decrypt_1key("J BN IFSF", 1);
        System.out.println(enc);
    }
}
