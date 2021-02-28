package myPackageForJava;

public class multiplesOfThreeAndFive {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("multiple of three= " + i);
            }
            if (i % 5 == 0) {

                System.out.println("  multiple of five= " + i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("       multiple of three and five= " + i);


            }
        }

    }
}