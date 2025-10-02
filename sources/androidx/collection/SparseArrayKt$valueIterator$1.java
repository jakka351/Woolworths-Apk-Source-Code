package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/SparseArrayKt$valueIterator$1", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SparseArrayKt$valueIterator$1 implements Iterator<Object>, KMappedMarker {
    public int d;
    public final /* synthetic */ SparseArrayCompat e;

    public SparseArrayKt$valueIterator$1(SparseArrayCompat sparseArrayCompat) {
        this.e = sparseArrayCompat;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 1;
        return this.e.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
