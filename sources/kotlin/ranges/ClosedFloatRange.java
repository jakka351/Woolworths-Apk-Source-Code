package kotlin.ranges;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClosedFloatRange implements ClosedFloatingPointRange<Float> {
    public final float d;
    public final float e;

    public ClosedFloatRange(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final boolean contains(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.d && fFloatValue <= this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClosedFloatRange)) {
            return false;
        }
        if (isEmpty() && ((ClosedFloatRange) obj).isEmpty()) {
            return true;
        }
        ClosedFloatRange closedFloatRange = (ClosedFloatRange) obj;
        return this.d == closedFloatRange.d && this.e == closedFloatRange.e;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return Float.valueOf(this.e);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return Float.valueOf(this.d);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    public final String toString() {
        return this.d + ".." + this.e;
    }
}
