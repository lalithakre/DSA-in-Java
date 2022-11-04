import java.util.Scanner;
// import java.util.zip.CRC32;

public class StackUsingArray {
    public static int push (int t, int stack[]) {
        Scanner sc = new Scanner(System.in);
        if (t == 99) {
            System.out.println("Stack overflow");
        } else {
            System.out.println("Enter data for Stack");
            int data = sc.nextInt();
            stack[t]=data;
            t++;
        }
        return t;
    }

    public static int pop(int t,int stack[]) {
        t--;
        // Scanner sc = new Scanner(System.in);
        if (t == -1) {
            System.out.println("Stack underflow");
        } else { 
            System.out.println("Element poped:"+stack[t]);
            int temp=stack[t];
            // t--;           
        }
        return t;
    }
    public static void main(String args[]) {
        int stack[] = new int[100];
        int max = 99;
        int top = 0;
        int choice;
        while(top<max)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice to push or pop in Stack:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    top=push(top, stack);
                    break;
                case 2:
                    top=pop(top, stack);
                    break;
                default:
                    System.out.println("choice not found");
    
            }
        }

    }

}
