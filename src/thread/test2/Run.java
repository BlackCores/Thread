package thread.test2;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/15 23:09
 * @Description:沉睡中停止线程
 */
public class Run {
    /**
     * 先停止后sleep
     * @param args
     * @throws InterruptedException
     */
    /*public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }*/

    /**
     * sleep中停止
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(200);
        thread.interrupt();
        System.out.println("end!");
    }
}
