package src.main.thread;

/**
 * 测试类：一般方式之实现runnable接口创建线程
 *
 * @author :liuqi
 * @date :2018-06-12 17:44.
 */
public class Demo03 {
    public static void main(String[] args) {
        // 创建真实角色
        Programer pro = new Programer();
        // 创建代理角色+真实角色引用
        Thread proxy = new Thread(pro);
        // 调用start方法启动线程
        proxy.start();
        for (int i = 0; i < 7; i++) {
            System.out.println("一边聊QQ");
        }
    }
}
