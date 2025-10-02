package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    public final int d;

    static {
        new UnsignedInteger(0);
        new UnsignedInteger(1);
        new UnsignedInteger(-1);
    }

    public UnsignedInteger(int i) {
        this.d = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedInteger unsignedInteger) {
        UnsignedInteger unsignedInteger2 = unsignedInteger;
        unsignedInteger2.getClass();
        return Integer.compare(this.d ^ Integer.MIN_VALUE, unsignedInteger2.d ^ Integer.MIN_VALUE);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UnsignedInteger) && this.d == ((UnsignedInteger) obj).d;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return longValue();
    }

    public final int hashCode() {
        return this.d;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.d;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.d & 4294967295L;
    }

    public final String toString() {
        return Long.toString(this.d & 4294967295L, 10);
    }
}
