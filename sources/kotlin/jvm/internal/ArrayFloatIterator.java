package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.FloatIterator;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/ArrayFloatIterator;", "Lkotlin/collections/FloatIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ArrayFloatIterator extends FloatIterator {
    public final float[] d;
    public int e;

    public ArrayFloatIterator(float[] array) {
        Intrinsics.h(array, "array");
        this.d = array;
    }

    @Override // kotlin.collections.FloatIterator
    public final float a() {
        try {
            float[] fArr = this.d;
            int i = this.e;
            this.e = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.length;
    }
}
