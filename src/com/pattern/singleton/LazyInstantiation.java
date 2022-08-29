package com.pattern.singleton;

/**
 * <p>
 * 懒汉模式实现
 * </p>
 *
 * @since 2022/8/29
 */
public class LazyInstantiation {

    private static LazyInstantiation obj;

    private static volatile  LazyInstantiation volatileObj;

    public LazyInstantiation() {
    }

    // Classic Implementation
    public static LazyInstantiation getInstance() {
        if (obj == null) {
            obj = new LazyInstantiation();
        }
        return obj;
    }

    // mark getInstance() synchronized
    public static synchronized LazyInstantiation getInstanceSync() {
        if (obj == null) {
            obj = new LazyInstantiation();
        }
        return obj;
    }


    // Double-Checked Locking
    public static LazyInstantiation getInstanceDoubleCheck() {
        if (volatileObj == null) {
            synchronized (LazyInstantiation.class) {
                if (volatileObj == null) {
                    volatileObj = new LazyInstantiation();
                }
            }

        }
        return volatileObj;
    }
}
