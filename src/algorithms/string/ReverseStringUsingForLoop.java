package algorithms.string;

public class ReverseStringUsingForLoop {

    public static void main(String[] args) {
        String name = "siddharth";
        String stringeverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            stringeverse = stringeverse + name.charAt(i);

        }
        System.out.println(": "+stringeverse);

     }
}