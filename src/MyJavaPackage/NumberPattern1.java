package MyJavaPackage;

public class NumberPattern1 {
    public static void main(String[] args) {
        for(int row=1; row<=5; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print(col);
            }
            System.out.println();
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