package com.github.drools.checker;

/**
 * @author : hongqiangren.
 * @since: 2018/8/8 00:07
 */
public final class PointChecker {
    public static boolean checkNotNull(Object ...objects) {
        for (Object obj : objects) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }
}
