package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ByteIterator;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/ArrayByteIterator;", "Lkotlin/collections/ByteIterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ArrayByteIterator extends ByteIterator {
    public int d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // kotlin.collections.ByteIterator
    public final byte nextByte() {
        try {
            this.d++;
            throw null;
        } catch (ArrayIndexOutOfBoundsException e) {
            this.d--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
