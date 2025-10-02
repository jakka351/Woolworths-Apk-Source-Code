package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
    public final int d;
    public boolean e;
    public final int f;
    public int g;

    public UIntProgressionIterator(int i, int i2) {
        this.d = i;
        boolean z = false;
        int iCompareUnsigned = Integer.compareUnsigned(-1, i);
        if (i2 <= 0 ? iCompareUnsigned >= 0 : iCompareUnsigned <= 0) {
            z = true;
        }
        this.e = z;
        this.f = i2;
        this.g = z ? -1 : i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e;
    }

    @Override // java.util.Iterator
    public final UInt next() {
        int i = this.g;
        if (i != this.d) {
            this.g = this.f + i;
        } else {
            if (!this.e) {
                throw new NoSuchElementException();
            }
            this.e = false;
        }
        return new UInt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
