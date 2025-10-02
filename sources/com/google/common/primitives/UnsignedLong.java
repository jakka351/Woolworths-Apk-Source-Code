package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {
    public final long d;

    static {
        new UnsignedLong(0L);
        new UnsignedLong(1L);
        new UnsignedLong(-1L);
    }

    public UnsignedLong(long j) {
        this.d = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedLong unsignedLong) {
        UnsignedLong unsignedLong2 = unsignedLong;
        unsignedLong2.getClass();
        return UnsignedLongs.a(this.d, unsignedLong2.d);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.d;
        return j >= 0 ? j : ((j >>> 1) | (j & 1)) * 2.0d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UnsignedLong) && this.d == ((UnsignedLong) obj).d;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.d;
        return j >= 0 ? j : ((j >>> 1) | (j & 1)) * 2.0f;
    }

    public final int hashCode() {
        return Longs.a(this.d);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.d;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.d;
    }

    public final String toString() {
        long j = this.d;
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        char[] cArr = new char[64];
        long j2 = (j >>> 1) / 5;
        long j3 = 10;
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % j3), 10);
            j2 /= j3;
        }
        return new String(cArr, i, 64 - i);
    }
}
