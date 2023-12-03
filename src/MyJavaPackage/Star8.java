package MyJavaPackage;

public class Star8 {
    public static void main(String[] args) {

        int space=3;

        for(int i=1; i<=4; i++)
        {
            for(int k=1; k<=space; k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
            space--;
        }

        space=1;

        for(int i=1; i<=3; i++)
        {
             for(int k=1; k<=space; k++)
             {
                 System.out.print(" ");
             }
             for(int j=3; j>=i; j--)
             {
                 System.out.print("* ");
             }
            System.out.println();
             space++;
        }

    }
}

/*

     *
    * *
   * * *
  * * * *
   * * *
    * *
     *
 */