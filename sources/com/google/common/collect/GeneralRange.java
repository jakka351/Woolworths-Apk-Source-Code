package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class GeneralRange<T> implements Serializable {
    public final Comparator d;
    public final boolean e;
    public final Object f;
    public final BoundType g;
    public final boolean h;
    public final Object i;
    public final BoundType j;

    public GeneralRange(Comparator comparator, boolean z, Object obj, BoundType boundType, boolean z2, Object obj2, BoundType boundType2) {
        comparator.getClass();
        this.d = comparator;
        this.e = z;
        this.h = z2;
        this.f = obj;
        boundType.getClass();
        this.g = boundType;
        this.i = obj2;
        boundType2.getClass();
        this.j = boundType2;
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(obj, obj2);
            Preconditions.h(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.d;
                Preconditions.g((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public final boolean a(Object obj) {
        return (d(obj) || c(obj)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GeneralRange b(GeneralRange generalRange) {
        boolean z;
        int iCompare;
        boolean z2;
        int iCompare2;
        BoundType boundType;
        Object obj;
        int iCompare3;
        boolean z3 = generalRange.h;
        boolean z4 = generalRange.e;
        BoundType boundType2 = generalRange.j;
        Object obj2 = generalRange.i;
        BoundType boundType3 = generalRange.g;
        Object obj3 = generalRange.f;
        Comparator comparator = generalRange.d;
        Comparator comparator2 = this.d;
        Preconditions.g(comparator2.equals(comparator));
        BoundType boundType4 = BoundType.d;
        boolean z5 = this.e;
        if (z5) {
            Object obj4 = this.f;
            if (!z4 || ((iCompare = comparator2.compare(obj4, obj3)) >= 0 && !(iCompare == 0 && boundType3 == boundType4))) {
                boundType3 = this.g;
                z = z5;
                obj3 = obj4;
            } else {
                z = z5;
            }
        } else {
            z = z4;
        }
        boolean z6 = this.h;
        if (z6) {
            Object obj5 = this.i;
            if (!z3 || ((iCompare2 = comparator2.compare(obj5, obj2)) <= 0 && !(iCompare2 == 0 && boundType2 == boundType4))) {
                boundType2 = this.j;
                z2 = z6;
                obj2 = obj5;
            } else {
                z2 = z6;
            }
        } else {
            z2 = z3;
        }
        if (z && z2 && ((iCompare3 = comparator2.compare(obj3, obj2)) > 0 || (iCompare3 == 0 && boundType3 == boundType4 && boundType2 == boundType4))) {
            boundType2 = BoundType.e;
            boundType = boundType4;
            obj = obj2;
        } else {
            boundType = boundType3;
            obj = obj3;
        }
        return new GeneralRange(this.d, z, obj, boundType, z2, obj2, boundType2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(Object obj) {
        if (!this.h) {
            return false;
        }
        int iCompare = this.d.compare(obj, this.i);
        return ((iCompare == 0) & (this.j == BoundType.d)) | (iCompare > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(Object obj) {
        if (!this.e) {
            return false;
        }
        int iCompare = this.d.compare(obj, this.f);
        return ((iCompare == 0) & (this.g == BoundType.d)) | (iCompare < 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.d.equals(generalRange.d) && this.e == generalRange.e && this.h == generalRange.h && this.g.equals(generalRange.g) && this.j.equals(generalRange.j) && Objects.a(this.f, generalRange.f) && Objects.a(this.i, generalRange.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.f, this.g, this.i, this.j});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(":");
        BoundType boundType = this.g;
        BoundType boundType2 = BoundType.e;
        sb.append(boundType == boundType2 ? '[' : '(');
        sb.append(this.e ? this.f : "-∞");
        sb.append(',');
        sb.append(this.h ? this.i : "∞");
        sb.append(this.j == boundType2 ? ']' : ')');
        return sb.toString();
    }
}
