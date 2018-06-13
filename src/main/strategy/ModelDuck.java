package src.main.strategy;

/**
 * 模型鸭子：会叫不会飞
 *
 * @author :liuqi
 * @date :2018-06-11 17:24.
 */
public class ModelDuck extends Duck{
    /**
     * 构造器
     */
    public ModelDuck(){
       flyBehavior = new FlyNoway();
       quackBehavior = new Quack();
    }

    /**
     * 描述方法
     */
    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
