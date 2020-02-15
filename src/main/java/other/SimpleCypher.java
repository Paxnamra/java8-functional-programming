package other;

public class SimpleCypher {
    public static void main(String[] args) {

        //iteration over chars
        String text = "we found a treasure!";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 96 && text.charAt(i) < 124) {
                System.out.print((char) (97 - text.charAt(i) + 122));
            } else {
                System.out.print(text.substring(i, i + 1));
            }
        }
    }
}
