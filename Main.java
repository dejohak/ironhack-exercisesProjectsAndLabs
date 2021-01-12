package exercises121;

public class Main {

    public static void main(String args[]) {

        System.out.println("=== Exercise 1 ===");
        int[] arrayEx1 = {5, 4, 3, 2, 1};
        int aux=arrayEx1[0];
        for(int i=0; i<arrayEx1.length; i++) {
            if (i<arrayEx1.length-1) {
                arrayEx1[i]=arrayEx1[i]*arrayEx1[i+1];
            } else {
                arrayEx1[i]=arrayEx1[i]*aux;
            }
        }
        for (int i:arrayEx1) {
            System.out.println(i);
        }

        System.out.println("=== Exercise 2 ===");
        int[] arrayEx2 = {5, 4, 3, 2, 1};
        for(int i = arrayEx2.length-1;i>=((arrayEx2.length-1)/2);i--) {
            aux=arrayEx2[arrayEx2.length-1-i];
            arrayEx2[arrayEx2.length-1-i]=arrayEx2[i];
            arrayEx2[i]=aux;
        }
        for (int i:arrayEx2) {
            System.out.println(i);
        }
    }
}
