package src.main.template;

/**
 * 做咖啡的方法类
 *
 * @author :liuqi
 * @date :2018-06-11 16:00.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    /**
     * 用沸水冲泡咖啡的方法
     */
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    /**
     * 添加咖啡所需要的调料
     */
    @Override
    void addCondiments() {
        System.out.println("adding suger and milk");
    }

    /**
     * 覆盖了hook
     *
     * @return
     */
    @Override
    public boolean customerWantsConfiments() {
        // 顾客想要不加任何调料的咖啡(这里写死)
        return false;
    }
}
