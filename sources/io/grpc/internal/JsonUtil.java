package io.grpc.internal;

import com.google.common.math.LongMath;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class JsonUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final long f24034a = TimeUnit.SECONDS.toNanos(1);

    public static void a(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static Boolean b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List c(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List d(String str, Map map) {
        List listC = c(str, map);
        if (listC == null) {
            return null;
        }
        for (int i = 0; i < listC.size(); i++) {
            if (!(listC.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listC.get(i), Integer.valueOf(i), listC));
            }
        }
        return listC;
    }

    public static Double e(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer f(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d);
    }

    public static Map g(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String h(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long i(String str, Map map) {
        String strH = h(str, map);
        if (strH == null) {
            return null;
        }
        try {
            return Long.valueOf(k(strH));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static long j(int i, long j) {
        long j2 = i;
        long j3 = f24034a;
        if (j2 <= (-j3) || j2 >= j3) {
            j = LongMath.a(j, j2 / j3);
            i = (int) (j2 % j3);
        }
        if (j > 0 && i < 0) {
            i = (int) (i + j3);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (i - j3);
            j++;
        }
        if (j >= -315576000000L && j <= 315576000000L) {
            long j4 = i;
            if (j4 >= -999999999 && j4 < j3 && ((j >= 0 && i >= 0) || (j <= 0 && i <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j);
                long j5 = i;
                long j6 = nanos + j5;
                return (((j5 ^ nanos) > 0L ? 1 : ((j5 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j6) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long k(String str) throws NumberFormatException, ParseException {
        boolean z;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strH = androidx.compose.ui.input.pointer.a.h(1, 0, str);
        int iIndexOf = strH.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strH.substring(iIndexOf + 1);
            strH = strH.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j = Long.parseLong(strH);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (j < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            j = -j;
            iCharAt = -iCharAt;
        }
        try {
            return j(iCharAt, j);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}
