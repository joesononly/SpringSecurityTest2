package learn.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* Created by:zjh
* Created:20190703
* Comment:测试Lock线程锁
* */
public class TestThreadTask {
    private Lock lock = new ReentrantLock();

    public void print(){
        if(lock.tryLock()){
            System.out.println("获得了锁");
            try{
                for(int i = 0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"print log index :"+i);
                }
            }catch (Exception e){

            }finally {
                System.out.println("释放锁");
                lock.unlock();
            }
        }else{
            System.out.println("获取锁失败");
        }
    }
}
