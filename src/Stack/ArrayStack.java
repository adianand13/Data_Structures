package Stack;

public class ArrayStack {
    private int[] Stack;
    private int N;
    private int TOS;

    public ArrayStack(int n) {
        N = n;
        Stack = new int[n];
        TOS = -1;
    }

    public boolean push(int n){
        System.out.println("N :" + n+" Tos :" + TOS);
        if (TOS +1 == N){
            System.out.println("Stack Overflow");
            return false;
        }else {
            Stack[++TOS] = n;
            return true;
        }
    }

    public boolean pop(){
        if (TOS == -1){
            System.out.println("Stack Empty");
            return false;
        }else {
            System.out.println(Stack[TOS]);
            Stack[TOS--] = 0;
            return true;
        }
    }

    //test code
    public static void main(String[] args) {
        ArrayStack arrayStack = new  ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
    }
}
