package stack;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Created by bhuvanabellala on 4/10/16.
 */
public class stackList {

    LinkedList<Integer> myList;

    public stackList(){
        myList = new LinkedList<Integer>();
    }

    public void push(Integer x){
        myList.add(x);
    }


    public int pop(){
        try {
            int popped = myList.removeLast();
            return popped;
        }
        catch (NoSuchElementException e){
            return -1;
        }
    }

    public static void main(String[] args){
        stackList temp = new stackList();
        int myid = 9999;
        Random stkop = new Random(myid);
        Random values = new Random(myid);

        for(int i = 0; i < 500; i++){
            int action = stkop.nextInt(10);
            if(action < 7){
                int value = values.nextInt(1000);
                temp.push(value);
                System.out.println("psh " + value );
            }
            else{
                int popped = temp.pop();
                if(popped == -1){
                    System.out.println("pop failed");
                }else{
                    System.out.println("pop " + popped);
                }
            }
        }

    }
}
