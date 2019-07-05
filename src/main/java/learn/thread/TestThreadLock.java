package learn.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* Created by:zjh
* Created:20190703
* Comment:测试Lock对象同步进程
* */
public class TestThreadLock {

    private TestThreadTask task = new TestThreadTask();

    public void start(){
        //定义两个线程对象，并传递内部类LockRunnable对象实现Lock锁
        Thread t1 = new Thread(new LockRunnable());
        Thread t2 = new Thread(new LockRunnable());

        t1.start();
        t2.start();
    }

    public static void main(String[] args){
        TestThreadLock t = new TestThreadLock();
        t.start();
    }

    public class LockRunnable implements  Runnable{

        public void run(){
            task.print();
        }
    }
}
