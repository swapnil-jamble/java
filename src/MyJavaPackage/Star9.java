package MyJavaPackage;

public class Star9 {
    public static void main(String[] args) {

        int i=1,row=7,col=1;
        int space=3;

        while(i<=row)
        {
            int k=1;
            while(k<=space)
            {
                System.out.print(" ");
                k++;
            }
            int j=1;
            while(j<=col)
            {
                System.out.print("* ");
                j++;
            }
            if(i<3) {
                space--;
                col++;
            }
            else
            {
                space++;
                col--;
            }
            i++;
            System.out.println();

        }
    }
}

/*

    *
   * *
  * * *
   * *
    *

 */