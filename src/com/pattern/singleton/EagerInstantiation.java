package com.pattern.singleton;

/**
 * <p>
 * 饿汉模式
 * </p>
 *
 * @since 2022/8/29
 */
public class EagerInstantiation {

    private static EagerInstantiation obj = new EagerInstantiation();

    public EagerInstantiation() {
    }

    // Eager Instantiation
    private static EagerInstantiation getInstance() {
        return obj;
    }
}
