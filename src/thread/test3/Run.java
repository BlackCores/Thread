package thread.test3;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/15 23:23
 * @Description:线程的停止
 */
public class Run {

    /**
     * 暴力停止 stop()不推荐
     * 推荐使用return 停止线程
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(200);
        thread.interrupt();
    }
}
