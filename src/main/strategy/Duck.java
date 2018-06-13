package src.main.strategy;

/**
 * 鸭子抽象类
 *
 * @author :liuqi
 * @date :2018-06-11 17:10.
 */
public abstract class Duck {
    /**
     * 封装飞行行为
     */
    FlyBehavior flyBehavior;
    /**
     * 封装叫行为
     */
    QuackBehavior quackBehavior;

    /**
     * 构造器
     */
    public Duck() {

    }

    /**
     * 描述继承子类的方法
     */
    abstract void display();

    /**
     * 表演飞行
     */
    public void performFly() {
        // 委托给飞行行为类
        flyBehavior.fly();
    }

    /**
     * 表演叫
     */
    public void performQuack() {
        // 委托给叫行为类
        quackBehavior.quack();
    }

    /**
     * 游泳（所有鸭子都会游泳）
     */
    void swim() {
        System.out.println("All ducks float,even decoys!");
    }

    /**
     * 设置飞行行为（可随时改变行为）
     */
    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    /**
     * 设置叫行为（可随时改变行为）
     */
    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
