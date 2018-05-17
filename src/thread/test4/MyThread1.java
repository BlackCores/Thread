package thread.test4;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/15 23:31
 * @Description:
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread1 run priority="+this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}




































