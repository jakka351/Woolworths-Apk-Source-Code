package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LongProgressionIterator extends LongIterator {
    public final long d;
    public final long e;
    public boolean f;
    public long g;

    public LongProgressionIterator(long j, long j2) {
        this.d = j2;
        this.e = j;
        boolean z = false;
        if (j2 <= 0 ? 1 >= j : 1 <= j) {
            z = true;
        }
        this.f = z;
        this.g = z ? 1L : j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // kotlin.collections.LongIterator
    public final long nextLong() {
        long j = this.g;
        if (j != this.e) {
            this.g = this.d + j;
            return j;
        }
        if (!this.f) {
            throw new NoSuchElementException();
        }
        this.f = false;
        return j;
    }
}
