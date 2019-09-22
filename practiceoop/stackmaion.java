import java.util.*;
class stackmaion
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        
        /*System.out.println("enter the size of array");
        int n=sc.nextInt();*/
        stak st=new stak();
        while(true)
        {
            System.out.println("enter 1 for push");
            System.out.println("enter 2 for pop");
            System.out.println("enter 3 for display");
            System.out.println("enter 4 for exit");
            System.out.println("enter your choice");
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                st.push();
                break;

                case 2:
                st.pop();
                break;

                case 3:
                st.display();
                break;

                case 4:
                System.exit(2);
            }

        }
    }
}
