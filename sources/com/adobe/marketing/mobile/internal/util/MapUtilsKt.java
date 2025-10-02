package com.adobe.marketing.mobile.internal.util;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class MapUtilsKt {
    public static final long a(Map map, String[] strArr) {
        Object obj;
        if (map == null) {
            return -1L;
        }
        LinkedHashMap linkedHashMapA = MapExtensionsKt.a("", map);
        StringBuilder sb = new StringBuilder();
        Unit unit = null;
        if (strArr != null && strArr.length == 0) {
            strArr = null;
        }
        int i = 0;
        if (strArr != null) {
            String[] strArr2 = strArr;
            if (strArr2.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr2, strArr2.length);
                Intrinsics.g(objArrCopyOf, "copyOf(...)");
                strArr2 = (Comparable[]) objArrCopyOf;
                if (strArr2.length > 1) {
                    Arrays.sort(strArr2);
                }
            }
            for (Object obj2 : strArr2) {
                String str = (String) obj2;
                if (str.length() > 0 && (obj = linkedHashMapA.get(str)) != null && (!(obj instanceof String) || ((CharSequence) obj).length() != 0)) {
                    sb.append(str);
                    sb.append(":");
                    sb.append(String.valueOf(linkedHashMapA.get(str)));
                }
            }
            unit = Unit.f24250a;
        }
        if (unit == null) {
            for (Map.Entry entry : new TreeMap(linkedHashMapA).entrySet()) {
                Object value = entry.getValue();
                if (value != null && (!(value instanceof String) || ((CharSequence) value).length() != 0)) {
                    sb.append((String) entry.getKey());
                    sb.append(":");
                    sb.append(String.valueOf(entry.getValue()));
                }
            }
        }
        String string = sb.toString();
        if (string != null) {
            int i2 = StringsKt.k0(string).toString().length() == 0 ? 0 : -2128831035;
            byte[] bytes = string.getBytes(Charsets.f24671a);
            Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            while (i < length) {
                i2 = (i2 ^ (bytes[i] & 255)) * 16777619;
                i++;
            }
            i = i2;
        }
        return i & 4294967295L;
    }
}
