package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/ArrayLongIterator;", "Lkotlin/collections/LongIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ArrayLongIterator extends LongIterator {
    public final long[] d;
    public int e;

    public ArrayLongIterator(long[] array) {
        Intrinsics.h(array, "array");
        this.d = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.length;
    }

    @Override // kotlin.collections.LongIterator
    public final long nextLong() {
        try {
            long[] jArr = this.d;
            int i = this.e;
            this.e = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
