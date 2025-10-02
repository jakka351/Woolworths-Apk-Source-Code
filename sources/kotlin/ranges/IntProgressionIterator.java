package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntProgressionIterator extends IntIterator {
    public final int d;
    public final int e;
    public boolean f;
    public int g;

    public IntProgressionIterator(int i, int i2, int i3) {
        this.d = i3;
        this.e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f = z;
        this.g = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // kotlin.collections.IntIterator
    public final int nextInt() {
        int i = this.g;
        if (i != this.e) {
            this.g = this.d + i;
            return i;
        }
        if (!this.f) {
            throw new NoSuchElementException();
        }
        this.f = false;
        return i;
    }
}
