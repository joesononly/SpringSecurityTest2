package learn.thread;

public class ConsumerThread {

    public void startThread(){
        /*
        * 输出的值如下所示：
        *   index of this Thread-1 is 1
        *   index of this Thread-0 is 1
        *   index of this Thread-3 is 1
        *   index of this Thread-2 is 2
        * */

        /*使用不同的ConsumerThread对象*/
        Thread t1 = new Thread(new ConsumerRunnable());
        Thread t2 = new Thread(new ConsumerRunnable());
        t1.start();
        t2.start();

        /*使用相同的ConsumerThread对象，由于对象传递的是引用，因此再一个线程中修改对象的内容，其他线程将会一并修改*/
        ConsumerRunnable consumerRunnable = new ConsumerRunnable();
        Thread t3 = new Thread(consumerRunnable);
        Thread t4 = new Thread(consumerRunnable);

        t3.start();
        t4.start();
    }

    public static void main(String[] args){
        ConsumerThread t = new ConsumerThread();
        t.startThread();
    }

    private class  ConsumerRunnable implements Runnable{

        private Integer index = 0;

        /*内部线程处理接口*/
        public void run(){
            index ++;
            System.out.println("index of this "+Thread.currentThread().getName()+" is "+index);
        }
    }

}
