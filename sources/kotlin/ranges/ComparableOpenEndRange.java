package kotlin.ranges;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/ComparableOpenEndRange;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/ranges/OpenEndRange;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {
    public final Comparable d;
    public final Comparable e;

    public ComparableOpenEndRange(Comparable start, Comparable endExclusive) {
        Intrinsics.h(start, "start");
        Intrinsics.h(endExclusive, "endExclusive");
        this.d = start;
        this.e = endExclusive;
    }

    @Override // kotlin.ranges.OpenEndRange
    public final boolean contains(Comparable comparable) {
        return comparable.compareTo(this.d) >= 0 && comparable.compareTo(this.e) < 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComparableOpenEndRange)) {
            return false;
        }
        Comparable comparable = this.d;
        Comparable comparable2 = this.e;
        if (comparable.compareTo(comparable2) >= 0) {
            ComparableOpenEndRange comparableOpenEndRange = (ComparableOpenEndRange) obj;
            if (comparableOpenEndRange.d.compareTo(comparableOpenEndRange.e) >= 0) {
                return true;
            }
        }
        ComparableOpenEndRange comparableOpenEndRange2 = (ComparableOpenEndRange) obj;
        return Intrinsics.c(comparable, comparableOpenEndRange2.d) && Intrinsics.c(comparable2, comparableOpenEndRange2.e);
    }

    public final int hashCode() {
        Comparable comparable = this.d;
        Comparable comparable2 = this.e;
        if (comparable.compareTo(comparable2) >= 0) {
            return -1;
        }
        return comparable2.hashCode() + (comparable.hashCode() * 31);
    }

    public final String toString() {
        return this.d + "..<" + this.e;
    }
}
