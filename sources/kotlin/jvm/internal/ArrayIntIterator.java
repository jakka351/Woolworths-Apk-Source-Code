package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/ArrayIntIterator;", "Lkotlin/collections/IntIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ArrayIntIterator extends IntIterator {
    public final int[] d;
    public int e;

    public ArrayIntIterator(int[] array) {
        Intrinsics.h(array, "array");
        this.d = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.length;
    }

    @Override // kotlin.collections.IntIterator
    public final int nextInt() {
        try {
            int[] iArr = this.d;
            int i = this.e;
            this.e = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
