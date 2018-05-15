package thread.test1;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/3 22:53
 * @Description:线程停止控制
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(100);
            thread.interrupt();//停止线程
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
