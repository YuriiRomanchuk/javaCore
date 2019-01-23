package core;

public class MainClass {
    public static void main(String[] args) {

    char x = 'D';

    char y = (char) ('A' + (x -'A'+ 1)%26);

    System.out.println(y);
    char z = (char) ('A' + (y - 'A' - 1)%26);
    System.out.println(z);

/*

    String ss = "asdfasdfasf";
        System.out.println(ss.toCharArray());

        for (char f:ss.toCharArray()) {
            System.out.println( (char) ('A' + (f - 'A' + 1) % 26 ));
        }
*/

    }

}