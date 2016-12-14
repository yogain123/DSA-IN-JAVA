//Java program to find the element occurring odd number of times
import java.util.*;
class OddOccurance
{
    public static void main(String... args)
    {
        int a[] ={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int res = 0;
        for(int i=0;i<a.length;i++)
            res = res ^ a[i];
        System.out.println(res);

    }
}