package thread.test5;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/17 23:09
 * @Description:守护线程
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        Thread.sleep(5000);
        System.out.println("结束");
    }

}
