package main.strategy;

/**
 * 用火箭飞起来
 *
 * @author :liuqi
 * @date :2018-06-11 17:31.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
