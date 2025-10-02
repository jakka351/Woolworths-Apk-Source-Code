package kotlin.ranges;

import androidx.compose.ui.unit.Dp;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/ComparableRange;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/ranges/ClosedRange;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
class ComparableRange<T extends Comparable<? super T>> implements ClosedRange<T> {
    public final Dp d;
    public final Dp e;

    public ComparableRange(Dp dp, Dp dp2) {
        this.d = dp;
        this.e = dp2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComparableRange)) {
            return false;
        }
        if (ClosedRange.DefaultImpls.a(this) && ClosedRange.DefaultImpls.a((ComparableRange) obj)) {
            return true;
        }
        ComparableRange comparableRange = (ComparableRange) obj;
        return this.d.equals(comparableRange.d) && this.e.equals(comparableRange.e);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return this.e;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return this.d;
    }

    public final int hashCode() {
        if (ClosedRange.DefaultImpls.a(this)) {
            return -1;
        }
        return Float.hashCode(this.e.d) + (Float.hashCode(this.d.d) * 31);
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return ClosedRange.DefaultImpls.a(this);
    }

    public final String toString() {
        return this.d + ".." + this.e;
    }
}
