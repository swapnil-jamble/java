package MyJavaPackage;

public class Star6 {
    public static void main(String[] args) {
        int space=2;
        for(int i=1; i<=5; i++)
        {
          for(int k=1; k<=space; k++)
          {
              System.out.print(" ");
          }
          space--;
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
}

/*

    *
   ***
  *****

 */