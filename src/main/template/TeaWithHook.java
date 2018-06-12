package main.template;

/**
 * 做茶的方法类
 *
 * @author :liuqi
 * @date :2018-06-11 16:09.
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    /**
     * 用沸水冲泡茶的方法
     */
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    /**
     * 添加茶所需要的调料
     */
    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
