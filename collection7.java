import java.util.Scanner;

/**
 * Created by root on 22/6/17.
 */
public class collection7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int size=4;
        SpecialStack obj=new SpecialStack(size);
        int c=0;
        // Stack st=new Stack();
        do {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to find the stack isempty");
            System.out.println("Enter 4 to find the stack is full");
            System.out.println("Enter 5 to find minimum in the stack");
            System.out.println("Enter 6 to exit");
            System.out.println("Enter your choice");
            c=sc.nextInt();


            switch(c){
                case 1:System.out.println("Enter a number to push");
                    obj.push(sc.nextInt());
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    obj.isEmpty();
                    break;


                case 4:
                    obj.isFull();
                    break;

                case 5:
                    obj.getMin();
                    break;

                case 6:
                    System.out.println("exit");
                    break;

                default:
                    System.out.println("Exit");
            }

        } while(c!=6);
    }
}


class SpecialStack{
    int top;
    int size;
    int[] stack ;
    int min=0;

    public SpecialStack(int arraySize){
        size=arraySize;
        stack= new int[size];
        top=-1;
    }

    public void isFull(){
        if(top==size-1)
            System.out.println("full");
        else
            System.out.println("not full");
    }
    public void isEmpty(){
        if(top==-1)
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");
    }

    public void push(int value){
        if(top==size-1){
            System.out.println("Stack is full, can't push a value");
        }
        else{

            top=top+1;
            stack[top]=value;
            if(min==0){
                min=stack[top];
            }
            else if(stack[top] < min)
                min=stack[top];
        }
    }

    public void pop(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }

    public void getMin(){
        System.out.println("Minimum value is: " +min);
    }
}

