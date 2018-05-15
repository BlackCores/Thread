package thread.test2;

/**
 * @author <a href="mailto:18335553083@163.com">Mr_He</a>
 * @Copyright (c)</ b> HeC<br/>
 * @createTime 2018/5/15 23:09
 * @Description:先停止，后sleep或者sleep中停止
 */
public class MyThread extends Thread {

    /**
     * 先停止后sleep
     */
    /*@Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10000; i++) {
                System.out.println("i="+(i+1));
            }
            System.out.println("run begin");
            Thread.sleep(10000);
            System.out.println("run end");
        }catch (Exception e){
            System.out.println(this.isInterrupted());
            e.printStackTrace();
        }
    }*/

    /**
     * sleep中停止
     */
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(10000);
            System.out.println("run end");
        }catch (Exception e){
            System.out.println(this.isInterrupted());
            e.printStackTrace();
        }
    }
}
