package MyJavaPackage;

public class NumberPattern2 {
    public static void main(String[] args) {
        int space=4;
        for(int row=1; row<=5; row++)
        {
           for(int i=1; i<=space; i++)
           {
               System.out.print(" ");
           }
            for(int col=1; col<=row; col++)
            {
                System.out.print(col);
            }
            System.out.println();
            space--;
        }
    }
}
/*

    1
   12
  123
 1234
12345

 */