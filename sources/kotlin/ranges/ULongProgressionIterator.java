package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {
    public final long d;
    public boolean e;
    public final long f;
    public long g;

    public ULongProgressionIterator(long j, long j2) {
        this.d = j;
        boolean z = false;
        if (j2 <= 0 ? Long.compareUnsigned(-1L, j) >= 0 : Long.compareUnsigned(-1L, j) <= 0) {
            z = true;
        }
        this.e = z;
        this.f = j2;
        this.g = z ? -1L : j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e;
    }

    @Override // java.util.Iterator
    public final ULong next() {
        long j = this.g;
        if (j != this.d) {
            this.g = this.f + j;
        } else {
            if (!this.e) {
                throw new NoSuchElementException();
            }
            this.e = false;
        }
        return new ULong(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
