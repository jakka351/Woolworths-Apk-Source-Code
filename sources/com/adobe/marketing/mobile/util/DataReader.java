package com.adobe.marketing.mobile.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DataReader {
    public static boolean a(Class cls, Number number) {
        if (Double.class.equals(cls)) {
            return false;
        }
        if (Float.class.equals(cls)) {
            if (!(number instanceof Double)) {
                return false;
            }
            double dDoubleValue = number.doubleValue();
            return dDoubleValue < 1.401298464324817E-45d || dDoubleValue > 3.4028234663852886E38d;
        }
        if (Long.class.equals(cls)) {
            if (!(number instanceof Double) && !(number instanceof Float)) {
                return false;
            }
            double dDoubleValue2 = number.doubleValue();
            return dDoubleValue2 < -9.223372036854776E18d || dDoubleValue2 > 9.223372036854776E18d;
        }
        if (Integer.class.equals(cls)) {
            if ((number instanceof Double) || (number instanceof Float)) {
                double dDoubleValue3 = number.doubleValue();
                return dDoubleValue3 < -2.147483648E9d || dDoubleValue3 > 2.147483647E9d;
            }
            long jLongValue = number.longValue();
            return jLongValue < -2147483648L || jLongValue > 2147483647L;
        }
        if (Short.class.equals(cls)) {
            if ((number instanceof Double) || (number instanceof Float)) {
                double dDoubleValue4 = number.doubleValue();
                return dDoubleValue4 < -32768.0d || dDoubleValue4 > 32767.0d;
            }
            long jLongValue2 = number.longValue();
            return jLongValue2 < -32768 || jLongValue2 > 32767;
        }
        if (!Byte.class.equals(cls)) {
            return false;
        }
        if ((number instanceof Double) || (number instanceof Float)) {
            double dDoubleValue5 = number.doubleValue();
            return dDoubleValue5 < -128.0d || dDoubleValue5 > 127.0d;
        }
        long jLongValue3 = number.longValue();
        return jLongValue3 < -128 || jLongValue3 > 127;
    }

    public static List b(Map map) throws DataReaderException {
        if (map == null) {
            throw new DataReaderException("Map or key is null");
        }
        Object obj = map.get("visitoridslist");
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            throw new DataReaderException("Value is not a list");
        }
        List list = (List) obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!Map.class.isInstance(it.next())) {
                throw new DataReaderException("List entry is not of expected type");
            }
        }
        return list;
    }

    public static Map c(Class cls, Map map, String str) throws DataReaderException {
        if (map == null) {
            throw new DataReaderException("Map or key is null");
        }
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Map)) {
            throw new DataReaderException("Value is not a map");
        }
        Map map2 = (Map) obj;
        for (Map.Entry entry : map2.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new DataReaderException("Map entry is not of expected type");
            }
            if (entry.getValue() != null && !cls.isInstance(entry.getValue())) {
                throw new DataReaderException("Map entry is not of expected type");
            }
        }
        return map2;
    }

    public static Object d(Class cls, Map map, String str) throws DataReaderException {
        if (map == null) {
            throw new DataReaderException("Map or key is null");
        }
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        try {
            if (!Number.class.isAssignableFrom(cls) || !(obj instanceof Number)) {
                return (String.class.equals(cls) && (obj instanceof String)) ? obj : cls.cast(obj);
            }
            Number number = (Number) obj;
            if (a(cls, number)) {
                throw new DataReaderException("Value overflows type " + cls);
            }
            if (Byte.class.equals(cls)) {
                return Byte.valueOf(number.byteValue());
            }
            if (Short.class.equals(cls)) {
                return Short.valueOf(number.shortValue());
            }
            if (Integer.class.equals(cls)) {
                return Integer.valueOf(number.intValue());
            }
            if (Long.class.equals(cls)) {
                return Long.valueOf(number.longValue());
            }
            if (Double.class.equals(cls)) {
                return Double.valueOf(number.doubleValue());
            }
            if (Float.class.equals(cls)) {
                return Float.valueOf(number.floatValue());
            }
            return null;
        } catch (ClassCastException e) {
            throw new DataReaderException(e);
        }
    }

    public static boolean e(String str, Map map) {
        Object objD;
        Object obj = Boolean.FALSE;
        try {
            objD = d(Boolean.class, map, str);
        } catch (DataReaderException unused) {
            objD = null;
        }
        if (objD != null) {
            obj = objD;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String f(String str, String str2, Map map) {
        String strD;
        try {
            strD = d(String.class, map, str);
        } catch (DataReaderException unused) {
            strD = null;
        }
        if (strD != null) {
            str2 = strD;
        }
        return str2;
    }
}
