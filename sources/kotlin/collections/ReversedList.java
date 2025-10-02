package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/ReversedList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/collections/AbstractMutableList;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ReversedList<T> extends AbstractMutableList<T> {
    public final ArrayList d;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010+\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.collections.ReversedList$listIterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements ListIterator<Object>, KMutableListIterator {
        public final ListIterator d;

        public AnonymousClass1(int i) {
            this.d = ReversedList.this.d.listIterator(CollectionsKt__ReversedViewsKt.e(i, ReversedList.this));
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            ListIterator listIterator = this.d;
            listIterator.add(obj);
            listIterator.previous();
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
            return CollectionsKt.I(ReversedList.this) - this.d.previousIndex();
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            return this.d.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return CollectionsKt.I(ReversedList.this) - this.d.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.d.remove();
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.d.set(obj);
        }
    }

    public ReversedList(ArrayList arrayList) {
        this.d = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.d.add(CollectionsKt__ReversedViewsKt.e(i, this), obj);
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b */
    public final int getK() {
        return this.d.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.d.clear();
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object d(int i) {
        return this.d.remove(CollectionsKt__ReversedViewsKt.d(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.d.get(CollectionsKt__ReversedViewsKt.d(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new AnonymousClass1(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new AnonymousClass1(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.d.set(CollectionsKt__ReversedViewsKt.d(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new AnonymousClass1(i);
    }
}
