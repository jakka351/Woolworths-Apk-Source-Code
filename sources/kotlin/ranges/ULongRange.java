package kotlin.ranges;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new ULongRange();
    }

    @Override // kotlin.ranges.OpenEndRange
    public final boolean contains(Comparable comparable) {
        throw null;
    }

    @Override // kotlin.ranges.ULongProgression
    public final boolean equals(Object obj) {
        if (obj instanceof ULongRange) {
            return (isEmpty() && ((ULongRange) obj).isEmpty()) || this.d == ((ULongRange) obj).d;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return new ULong(this.d);
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return new ULong(-1L);
    }

    @Override // kotlin.ranges.ULongProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.d;
        return (((int) (-4294967296L)) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return Long.compareUnsigned(-1L, this.d) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    public final String toString() {
        return ((Object) UnsignedKt.c(10, -1L)) + ".." + ((Object) UnsignedKt.c(10, this.d));
    }
}
