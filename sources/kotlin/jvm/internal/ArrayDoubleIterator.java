package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.DoubleIterator;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/ArrayDoubleIterator;", "Lkotlin/collections/DoubleIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ArrayDoubleIterator extends DoubleIterator {
    public final double[] d;
    public int e;

    public ArrayDoubleIterator(double[] array) {
        Intrinsics.h(array, "array");
        this.d = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.length;
    }

    @Override // kotlin.collections.DoubleIterator
    public final double nextDouble() {
        try {
            double[] dArr = this.d;
            int i = this.e;
            this.e = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
