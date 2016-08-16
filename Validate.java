/* Copyright © 2016 Acquized <Acquized@users.noreply.github.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE.txt file for more details.
 */
package cc.acquized.utils;

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Collection;
import java.util.Map;

public class Validate {

    public static boolean isTrue(boolean b) {
        return b;
    }

    public static boolean isFalse(boolean b) {
        return !b;
    }

    public static boolean notNull(Object obj) {
        return obj != null;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isPositive(Number number) {
        return number.intValue() > 0;
    }

    public static boolean isNegative(Number number) {
        return number.intValue() < 0;
    }

    public static boolean isNeutral(Number number) {
        return number.intValue() == 0;
    }

    public static boolean notEmpty(Object[] array) {
        return array.length > 0;
    }

    public static boolean isEmpty(Object[] array) {
        return array.length <= 0;
    }

    public static boolean notEmpty(Map map) {
        return map.size() > 0;
    }

    public static boolean isEmpty(Map map) {
        return map.size() <= 0;
    }

    public static boolean notEmpty(Collection collection) {
        return collection.size() > 0;
    }

    public static boolean isEmpty(Collection collection) {
        return collection.size() <= 0;
    }

    @Deprecated // It is recommended to use Object#hashCode in case they defined a custom HashCode
    public static int hashCode(Object obj) {
        return new HashCodeBuilder().append(obj).toHashCode();
    }

}
