/**
 * Created by flux
 */

public class TestQueue {

    public static void main(String[] args){
        Integer size = 30;
        Queue queue = new Queue(size);
        System.out.println(queue.isEmpty());
        for (int i = 0; i < size; i++) {
            queue.push(i);
        }



        queue.popElementByIndex(4);
//        queue.findPopElementByValue(80);
        System.out.println(queue.isEmpty());


//        for (int i = 0; i < size; i++) {
//            queue.pop();
//        }
    }


}
