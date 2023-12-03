package MyJavaPackage;

public class Star5 {
    public static void main(String[] args) {
        int space = 1;
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();

            for(int k=1; k<=space; k++)
            {
                System.out.print(" ");
            }

            space++;


        }
    }
}

/*


 *****
  ****
   ***
    **
     *

 */