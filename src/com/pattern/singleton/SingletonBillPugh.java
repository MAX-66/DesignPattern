package com.pattern.singleton;

/**
 * <p>
 *  当 SingletonBillPugh 被加载时， 静态内部类 SingletonHelper 没有被加载进内存
 *  只有当调用 getInstance() 方法从而触发 SingletonHelper.INSTANCE 时 SingletonHelper 才会被加载，此时初始化 INSTANCE 实例， 并且 JVM 提供了对线程安全的支持
 *  这种方式不仅具有延迟初始化的好处， 而且由 JVM 提供了对线程安全的支持
 * </p>
 *
 * @since 2022/8/29
 */
public final class SingletonBillPugh {

    private static class SingletonHelper {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public SingletonBillPugh() {
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
