package MyJavaPackage;

public class NumberPattern5 {
    public static void main(String[] args) {
        int tcol = 1;
        int space =3;
       for(int row=1; row<=3; row++)
       {
           for(int i=1; i<=space; i++)
           {
               System.out.print(" ");
           }
           int col;
           for( col=1; col<=tcol; col++)
           {
               System.out.print(col);
               
           }


           System.out.println();
           space--;
           tcol++;
       }
    }
}


/*

    1
   121
  12321

 */