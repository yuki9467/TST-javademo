package main;

/**
 * @author :liuqi
 * @date :2018-06-12 14:38.
 */
public class Example {

    /**
     * 私有构造方法
     */
    private Example() {
    }

    /**
     * 创建内部类
     */
    private static class ExampleChild {
        // 放心这里只初始化一次, 因为是静态的不会在次创建对象了
        private static final Example newInstance = new Example();
    }

    /**
     * 提供公有访问函数
     *
     * @return Example
     */
    public static Example getInstance() {
        // 调用内部类 进行初始化对象操作
        return ExampleChild.newInstance;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        // 循环测试对象内存地址
        for (int i = 0; i < 100; i++) {
            // 匿名内部类new Thread(父类构造器)
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Example.getInstance());
                }
            }).start();
        }
    }

}
