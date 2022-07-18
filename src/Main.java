public class Main {
    public static void main(String[] args) {
        System.out.println(min(8, 3, 2, 4));
        System.out.println(min(9, 44, 22, 1));
        System.out.println(min(88, 2, 3, 1));
    }
    public static int min(int a, int b, int c, int d) {
        if(a<b && a<c && a<d) {
            return a;
        }
        if (b<a && b<c && b<d) {
            return b;
        }
        if (c<a && c<b && c<d) {
            return c;
        }
        else {
            return d;
        }
    }
}