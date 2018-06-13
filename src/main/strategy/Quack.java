package src.main.strategy;

/**
 * 会叫
 *
 * @author :liuqi
 * @date :2018-06-11 17:28.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
