import java.util.Scanner;

public class UnsetTheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(unSet(A,B));
    }
    public static int unSet(int A,int B)
    {
        if(checkBit(A,B))
        {
            return A^(1<<B);
        }
        return A;
    }
    public static Boolean checkBit(int A,int B)
    {
        if((A & (1<<B))!=0)
            return true;
        return false;
    }
}
