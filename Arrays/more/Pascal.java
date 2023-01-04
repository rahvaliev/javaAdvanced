package Arrays.more;

import java.util.Arrays;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] previous=new int[n];
        int []pascalFirst={1};
        System.out.println(pascalFirst[0]);
        for (int i = 2; i <=n ; i++) {
            int[] pascalNext=new int[i];

            pascalNext[0]=1;
            pascalNext[pascalNext.length-1]=1;
            if(pascalNext.length-2>0){
                for (int j = 1; j <=pascalNext.length-2 ; j++) {
                    pascalNext[j]=previous[j]+previous[j-1];

                }
            }
            ;
            previous=pascalNext;

            for (int pN:pascalNext) {
                System.out.print(pN+" ");
            }
            System.out.println();
        }
    }
}
