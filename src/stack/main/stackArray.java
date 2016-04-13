package stack;
import java.util.Random;

/**
 * Created by bhuvanabellala on 4/10/16.
 */
public class stackArray {

    int[] myArray;
    int index;

    public stackArray(){
        myArray = new int[2];
        index = 0;
    }

    public void push(int x){
        if(index >= myArray.length){
            System.out.println("doubled");
            myArray = this.doubleArr();
        }
        myArray[index++] = x;
    }

    private int[] doubleArr(){
        int[] array = new int[myArray.length *2];
        for(int i = 0; i<myArray.length; i++){
            array[i] = myArray[i];
        }

        return array;
    }

    public int pop(){
        if(index <= 0){
            return -1;
        }else{
            int tempo = myArray[--index];
            myArray[index] = 0;
            return tempo;
        }
    }


    public static void main(String[] args){
        stackArray temp = new stackArray();
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
