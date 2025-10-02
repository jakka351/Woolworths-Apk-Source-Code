package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/ReversedListReadOnly;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/collections/AbstractList;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
class ReversedListReadOnly<T> extends AbstractList<T> {
    public final List d;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010*\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/ReversedListReadOnly$listIterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.collections.ReversedListReadOnly$listIterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements ListIterator<Object>, KMappedMarker {
        public final ListIterator d;

        public AnonymousClass1(int i) {
            this.d = ReversedListReadOnly.this.d.listIterator(CollectionsKt__ReversedViewsKt.e(i, ReversedListReadOnly.this));
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.d.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return CollectionsKt.I(ReversedListReadOnly.this) - this.d.previousIndex();
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            return this.d.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return CollectionsKt.I(ReversedListReadOnly.this) - this.d.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ReversedListReadOnly(List list) {
        this.d = list;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public final int getF() {
        return this.d.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        return this.d.get(CollectionsKt__ReversedViewsKt.d(i, this));
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new AnonymousClass1(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new AnonymousClass1(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new AnonymousClass1(i);
    }
}
