import java.util.*;
class stak
{
    int top,max;
    int stack[];
    stak()
    {
         int max=5;
        stack=new int[max];
         
    }

    void push()
    {
        int n;

        Scanner sc=new Scanner(System.in);
        if(top==max-1)
        {
            System.out.println("overflow");
        }
        else
        {
            System.out.println("enter the no");
            n=sc.nextInt();
            stack[++top]=n;
        }
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("deleted"+" " +stack[top--]);

        }

    }

    void display()
    {
        if(top==-1)
            System.out.println("stack is empty");
        else
        {
            for(int i=top-1;i>=0;i--)
            {
                System.out.println(stack[i]);
            }

        }
    }
}

        