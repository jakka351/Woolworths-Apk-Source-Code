package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.MapperFeature;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class EnumResolver implements Serializable {
    public final Class d;
    public final Enum[] e;
    public final HashMap f;
    public final Enum g;
    public final boolean h;
    public final boolean i;

    public EnumResolver(Class cls, Enum[] enumArr, HashMap map, Enum r4, boolean z, boolean z2) {
        this.d = cls;
        this.e = enumArr;
        this.f = map;
        this.g = r4;
        this.h = z;
        this.i = z2;
    }

    public static Enum[] a(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class ".concat(cls.getName()));
    }

    public static EnumResolver c(DeserializationConfig deserializationConfig, Class cls) {
        AnnotationIntrospector annotationIntrospectorD = deserializationConfig.d();
        boolean zM = deserializationConfig.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum[] enumArrA = a(cls);
        HashMap map = new HashMap();
        String[][] strArr = new String[enumArrA.length][];
        annotationIntrospectorD.k(cls, enumArrA, strArr);
        int length = enumArrA.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(cls, enumArrA, map, annotationIntrospectorD.g(cls), zM, false);
            }
            Enum r2 = enumArrA[length];
            map.put(r2.toString(), r2);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!map.containsKey(str)) {
                        map.put(str, r2);
                    }
                }
            }
        }
    }

    public final CompactStringObjectMap b() {
        int i;
        HashMap map = this.f;
        if (map.isEmpty()) {
            return CompactStringObjectMap.g;
        }
        int size = map.size();
        if (size <= 5) {
            i = 8;
        } else if (size <= 12) {
            i = 16;
        } else {
            int i2 = 32;
            while (i2 < size + (size >> 2)) {
                i2 += i2;
            }
            i = i2;
        }
        int i3 = i - 1;
        int i4 = (i >> 1) + i;
        Object[] objArrCopyOf = new Object[i4 * 2];
        int i5 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                int iHashCode = str.hashCode() & i3;
                int i6 = iHashCode + iHashCode;
                if (objArrCopyOf[i6] != null) {
                    i6 = ((iHashCode >> 1) + i) << 1;
                    if (objArrCopyOf[i6] != null) {
                        i6 = (i4 << 1) + i5;
                        i5 += 2;
                        if (i6 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i6] = str;
                objArrCopyOf[i6 + 1] = entry.getValue();
            }
        }
        return new CompactStringObjectMap(i3, i5, objArrCopyOf);
    }
}
