import java.util.Arrays;
class swap
{
    public static void main(String[] args)
    {
        int[] a_num={20,30,40,10};
                      
        int x=a_num[0];
        a_num[1]=a_num[a_num.length-1];
        a_num[a_num.length-1]=x;
        System.out.println(Arrays.toString(a_num));
    }
}
