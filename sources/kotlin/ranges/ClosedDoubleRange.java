package kotlin.ranges;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
    public final double d;
    public final double e;

    public ClosedDoubleRange(double d, double d2) {
        this.d = d;
        this.e = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final boolean contains(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= this.d && dDoubleValue <= this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClosedDoubleRange)) {
            return false;
        }
        if (isEmpty() && ((ClosedDoubleRange) obj).isEmpty()) {
            return true;
        }
        ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) obj;
        return this.d == closedDoubleRange.d && this.e == closedDoubleRange.e;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return Double.valueOf(this.e);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return Double.valueOf(this.d);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Double.hashCode(this.e) + (Double.hashCode(this.d) * 31);
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    public final String toString() {
        return this.d + ".." + this.e;
    }
}
