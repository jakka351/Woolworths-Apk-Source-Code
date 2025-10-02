package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/collections/IndexingIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {
    public final Iterator d;
    public int e;

    public IndexingIterator(Iterator iterator) {
        Intrinsics.h(iterator, "iterator");
        this.d = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        this.e = i + 1;
        if (i >= 0) {
            return new IndexedValue(i, this.d.next());
        }
        CollectionsKt.z0();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
