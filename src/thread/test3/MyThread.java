package thread.test3;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/15 23:26
 * @Description:return停止线程
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println(this.isInterrupted());
            if(this.isInterrupted()){
                System.out.println(this.isInterrupted());
                System.out.println(this.getName()+" 已停止");
                return;
            }
        }
    }
}
