package src.main.template;

/**
 * 高层组件
 *
 * @author :liuqi
 * @date :2018-06-11 16:00.
 */
public abstract class CaffeineBeverageWithHook {
    /**
     * 模板方法：抽出做茶和咖啡共通的方法
     */
    void prepareRecipe() {
        // 烧水
        boilWater();
        // 用沸水冲泡
        brew();
        // 倒进杯里
        pourIncup();
        // 如果顾客想要调料则添加调料
        if (customerWantsConfiments()) {
            // 添加调料
            addCondiments();
        }
    }

    /**
     * 用沸水冲泡（各子类实现不同）
     * <p>
     * 抽象方法
     */
    abstract void brew();

    /**
     * 加调料（各子类实现不同）
     * <p>
     * 抽象方法
     */
    abstract void addCondiments();

    /**
     * 烧水
     */
    void boilWater() {
        System.out.println("boiling water");
    }

    /**
     * 倒进杯里
     */
    void pourIncup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 顾客是否想要调料
     * hook 钩子，子类可以覆盖
     *
     * @return
     */
    boolean customerWantsConfiments() {
        return true;
    }
}
