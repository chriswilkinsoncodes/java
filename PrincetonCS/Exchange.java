/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Exchange {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int t = a;
        System.out.println("a: " + a + ", b: " + b);
        a = b;
        b = t;
        System.out.println("a: " + a + ", b: " + b);
    }
}
