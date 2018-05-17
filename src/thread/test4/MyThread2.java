package thread.test4;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/17 22:57
 * @Description:
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread2 run priority="+this.getPriority());
    }
}
