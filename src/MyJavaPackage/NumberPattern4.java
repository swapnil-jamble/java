package MyJavaPackage;

public class NumberPattern4 {
    public static void main(String[] args) {
        int space=1;
     for(int row=5; row>=1; row--)
     {
         for(int col=1; col<=row; col++)
         {
             System.out.print(col);
         }
         System.out.println();
         for(int i=1; i<=space; i++)
         {
             System.out.print(" ");
         }
         space++;
     }

    }
}

/*

 12345
  1234
   123
    12
     1
 */