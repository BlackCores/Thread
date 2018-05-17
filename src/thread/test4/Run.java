package thread.test4;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/15 23:31
 * @Description:线程的优先级以及优先级的继承特性
 */
public class Run {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.setPriority(6);
        thread1.start();
    }


}
