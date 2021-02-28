package myPackageForJava;

public class multiplesOfThreeAndFive2 {

    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0  && i % 5!= 0)    //   =! Not equal to zero

            {
                System.out.println("multiple of three");
            }
            else if (i % 5 == 0 &&  i % 3!=0 ) {

                System.out.println("multiple of five");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("multiple of three and five" );
            }

            else System.out.println(i);

        }

    }
}