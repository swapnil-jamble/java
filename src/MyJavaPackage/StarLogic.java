package MyJavaPackage;

public class StarLogic {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==1 || i==5)
                {
                    System.out.print("*");
                }

                if((i==2 || i==3 || i==4) && (j==2 || j==3 || j==4))
                {
                    for(int k=1; k<=3; k++)
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
