/* Copyright © 2016 Acquized <Acquized@users.noreply.github.com>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See the LICENSE.txt file for more details. 
 */
package cc.acquized.utils;

import lombok.NonNull;

public class Cast {

    public static int toInteger(@NonNull Object obj) {
        if(obj instanceof Integer) {
            return (Integer) obj;
        } else if(obj instanceof String) {
            try { return Integer.parseInt((String) obj); } catch (NumberFormatException ignored) {}
        } else if(obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new ClassCastException("Could not convert " + obj + " to Integer.");
    }

    public static double toDouble(@NonNull Object obj) {
        if(obj instanceof Double) {
            return (Double) obj;
        } else if(obj instanceof String) {
            try { return Double.parseDouble((String) obj); } catch (NumberFormatException ignored) {}
        } else if(obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        throw new ClassCastException("Could not convert " + obj + " to Double.");
    }

    public static short toShort(@NonNull Object obj) {
        if(obj instanceof Short) {
            return (Short) obj;
        } else if(obj instanceof String) {
            try { return Short.parseShort((String) obj); } catch (NumberFormatException ignored) {}
        } else if(obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        throw new ClassCastException("Could not convert " + obj + " to Short.");
    }

    public static float toFloat(@NonNull Object obj) {
        if(obj instanceof Float) {
            return (Float) obj;
        } else if(obj instanceof String) {
            try { return Float.parseFloat((String) obj); } catch (NumberFormatException ignored) {}
        } else if(obj instanceof Number) {
            ((Number) obj).floatValue();
        }
        throw new ClassCastException("Could not convert " + obj + " to Float.");
    }

    public static long toLong(@NonNull Object obj) {
        if(obj instanceof Long) {
            return (Long) obj;
        } else if(obj instanceof String) {
            try { return Long.parseLong((String) obj); } catch (NumberFormatException ignored) {}
        } else if(obj instanceof Number) {
            ((Number) obj).longValue();
        }
        throw new ClassCastException("Could not convert " + obj + " to Long.");
    }

    public static String toString(@NonNull Object obj) {
        if(obj instanceof String) {
            return (String) obj;
        } else if(obj instanceof Number) {
            return String.valueOf(obj);
        }
        throw new ClassCastException("Could not convert " + obj + " to String.");
    }

    public static boolean toBoolean(@NonNull Object obj) {
        if(obj instanceof Boolean) {
            return (Boolean) obj;
        } else if(obj instanceof String) {
            return Boolean.TRUE.toString().equalsIgnoreCase((String) obj);
        }
        throw new ClassCastException("Could not convert " + obj + " to Boolean.");
    }

    @SuppressWarnings("unchecked")
    public static <T> T unsafe(@NonNull Object obj) {
        return (T) obj;
    }

}
