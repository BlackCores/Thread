package thread.test5;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/17 23:16
 * @Description:
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try {
            while (true){
                System.out.println("i="+(++i));
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
