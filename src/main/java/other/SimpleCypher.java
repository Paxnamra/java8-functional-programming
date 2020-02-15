package other;

public class SimpleCypher {
    public static void main(String[] args) {

        //iterative chars
        String text = "we found a treasure!";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > 96 && text.charAt(i) < 124) {
                System.out.print((char) (97 - text.charAt(i) + 122));
            } else {
                System.out.print(text.substring(i, i + 1));
            }
        }

        System.out.println();

        String s = text.chars().filter(o -> o != ' ').map(e -> 97 - e + 122).collect(StringBuilder::new,
                (sb, s1) -> sb.append(s1).append(" "),
                (sb1, sb2) -> sb1.append(sb2.toString())).toString();

        String f = text.chars().map(e -> 97 - e + 122).collect(StringBuilder::new,
                (sb, s1) -> sb.append(s1).append(" "),
                (sb1, sb2) -> sb1.append(sb2.toString())).toString();

        System.out.println(s);
        System.out.println(f);
    }
}
