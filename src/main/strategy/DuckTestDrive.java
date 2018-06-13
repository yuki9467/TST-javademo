package src.main.strategy;

/**
 * 测试类
 *
 * @author :liuqi
 * @date :2018-06-11 17:29.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        // 模型鸭子
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
