package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Cut;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.lang.Comparable;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {
    public static final Range f = new Range(Cut.BelowAll.e, Cut.AboveAll.e);
    public final Cut d;
    public final Cut e;

    /* renamed from: com.google.common.collect.Range$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14903a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f14903a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14903a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {
        public static final Ordering d = new RangeLexOrdering();

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return ComparisonChain.f14880a.b(range.d, range2.d).b(range.e, range2.e).f();
        }
    }

    public Range(Cut cut, Cut cut2) {
        cut.getClass();
        this.d = cut;
        cut2.getClass();
        this.e = cut2;
        if (cut.compareTo(cut2) > 0 || cut == Cut.AboveAll.e || cut2 == Cut.BelowAll.e) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            cut.c(sb2);
            sb2.append("..");
            cut2.d(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Range b(Comparable comparable, BoundType boundType) {
        int iOrdinal = boundType.ordinal();
        Cut.AboveAll aboveAll = Cut.AboveAll.e;
        if (iOrdinal == 0) {
            return new Range(new Cut.AboveValue(comparable), aboveAll);
        }
        if (iOrdinal == 1) {
            return new Range(Cut.a(comparable), aboveAll);
        }
        throw new AssertionError();
    }

    public static Range g(Comparable comparable, BoundType boundType, Comparable comparable2, BoundType boundType2) {
        BoundType boundType3 = BoundType.d;
        return new Range(boundType == boundType3 ? new Cut.AboveValue(comparable) : Cut.a(comparable), boundType2 == boundType3 ? Cut.a(comparable2) : new Cut.AboveValue(comparable2));
    }

    public static Range h(Comparable comparable, BoundType boundType) {
        int iOrdinal = boundType.ordinal();
        Cut.BelowAll belowAll = Cut.BelowAll.e;
        if (iOrdinal == 0) {
            return new Range(belowAll, Cut.a(comparable));
        }
        if (iOrdinal == 1) {
            return new Range(belowAll, new Cut.AboveValue(comparable));
        }
        throw new AssertionError();
    }

    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.d.l(comparable) && !this.e.l(comparable);
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return a((Comparable) obj);
    }

    public final boolean c() {
        return this.e != Cut.AboveAll.e;
    }

    public final Range d(Range range) {
        Cut cut = range.d;
        Cut cut2 = this.d;
        int iCompareTo = cut2.compareTo(cut);
        Cut cut3 = range.e;
        Cut cut4 = this.e;
        int iCompareTo2 = cut4.compareTo(cut3);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        if (iCompareTo < 0) {
            cut2 = range.d;
        }
        if (iCompareTo2 <= 0) {
            cut3 = cut4;
        }
        Preconditions.h(cut2.compareTo(cut3) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return new Range(cut2, cut3);
    }

    public final boolean e(Range range) {
        return this.d.compareTo(range.e) <= 0 && range.d.compareTo(this.e) <= 0;
    }

    @Override // com.google.common.base.Predicate
    public final boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.d.equals(range.d) && this.e.equals(range.e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.d.equals(this.e);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.e.hashCode();
    }

    public Object readResolve() {
        Range range = f;
        return equals(range) ? range : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.d.c(sb);
        sb.append("..");
        this.e.d(sb);
        return sb.toString();
    }
}
