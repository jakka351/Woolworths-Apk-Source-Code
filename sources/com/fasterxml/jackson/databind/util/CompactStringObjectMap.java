package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class CompactStringObjectMap implements Serializable {
    public static final CompactStringObjectMap g = new CompactStringObjectMap(1, 0, new Object[4]);
    public final int d;
    public final int e;
    public final Object[] f;

    public CompactStringObjectMap(int i, int i2, Object[] objArr) {
        this.d = i;
        this.e = i2;
        this.f = objArr;
    }

    public final Object a(String str) {
        int iHashCode = str.hashCode();
        int i = this.d;
        int i2 = iHashCode & i;
        int i3 = i2 << 1;
        Object[] objArr = this.f;
        Object obj = objArr[i3];
        if (obj == str || str.equals(obj)) {
            return objArr[i3 + 1];
        }
        if (obj == null) {
            return null;
        }
        int i4 = i + 1;
        int i5 = ((i2 >> 1) + i4) << 1;
        Object obj2 = objArr[i5];
        if (str.equals(obj2)) {
            return objArr[i5 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i6 = (i4 + (i4 >> 1)) << 1;
        int i7 = this.e + i6;
        while (i6 < i7) {
            Object obj3 = objArr[i6];
            if (obj3 == str || str.equals(obj3)) {
                return objArr[i6 + 1];
            }
            i6 += 2;
        }
        return null;
    }
}
