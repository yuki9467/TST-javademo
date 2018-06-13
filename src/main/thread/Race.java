package src.main.thread;

import java.util.concurrent.Callable;

/**
 * 实现callable类
 *
 * @author :liuqi
 * @date :2018-06-13 10:13.
 */
public class Race implements Callable<Integer> {
    private String name;
    private long time;
    private boolean flag = true;
    // 步数
    private int step = 0;
    public Race(){
    }
    public Race(String name,int time){
        super();
        this.name = name;
        this.time = time;
    }
    @Override
    public Integer call() throws Exception {
        while(flag){
            Thread.sleep(time);
            step++;
        }
        return step;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
