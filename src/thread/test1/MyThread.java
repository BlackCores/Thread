package thread.test1;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/3 22:52
 * @Description:线程状态判断
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 50000; i++) {
            //判断当前线程是否停止
            if(this.isInterrupted()){
                System.out.println("线程已停止");
                break;
            }
            System.out.println("i="+(i+1));
        }


    }
}
