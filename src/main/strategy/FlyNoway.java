package src.main.strategy;

/**
 * 不会飞
 *
 * @author :liuqi
 * @date :2018-06-11 17:27.
 */
public class FlyNoway implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
