package main.template;

/**
 * 测试类
 *
 * @author :liuqi
 * @date :2018-06-11 16:13.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();
        System.out.println("making tea~~~~~");
        tea.prepareRecipe();
        System.out.println("making coffee~~~~~");
        coffee.prepareRecipe();
    }
}
