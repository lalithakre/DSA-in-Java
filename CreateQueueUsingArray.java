import java.util.Scanner;
public class CreateQueueUsingArray 
{
    public static int enque (int t,int r, int queue[]) {
        Scanner sc = new Scanner(System.in);
        if (t == 99) {
            System.out.println("Stack overflow");
        } else {
            System.out.println("Enter data for Stack");
            int data = sc.nextInt();
            queue[t]=data;s
            t++;
        }
        return t;
    }

    public static int deque(int t,int r,int queue[]) {
        t--;
        // Scanner sc = new Scanner(System.in);
        if (t == -1) {
            System.out.println("Stack underflow");
        } else { 
            System.out.println("Element poped:"+stack[t]);
            int temp=queue[t];
            // t--;           
        }
        return t;
    }
    public static void main(String args[]) {
        int queue[] = new int[100];
        int max= 99;
        int front=0;
        int rear=0;
        int choice;
        while(max<rear)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice to push or pop in Stack:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    front=enque(front,rear queue);
                    break;
                case 2:
                    front=deque(front,rear queue);
                    break;
                default:
                    System.out.println("choice not found");
    
            }
        }

    }

}

    
}
