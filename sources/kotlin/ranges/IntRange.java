package kotlin.ranges;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntRange extends IntProgression implements ClosedRange<Integer>, OpenEndRange<Integer> {
    public static final IntRange g = new IntRange(1, 0, 1);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // kotlin.ranges.OpenEndRange
    public final /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        throw null;
    }

    @Override // kotlin.ranges.IntProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.d == intRange.d && this.e == intRange.e;
    }

    public final boolean g(int i) {
        return this.d <= i && i <= this.e;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.e);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return Integer.valueOf(this.d);
    }

    @Override // kotlin.ranges.IntProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.d * 31) + this.e;
    }

    @Override // kotlin.ranges.IntProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    @Override // kotlin.ranges.IntProgression
    public final String toString() {
        return this.d + ".." + this.e;
    }
}
