package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class KeylineList implements List<Keyline>, KMappedMarker {
    public static final KeylineList j = new KeylineList(EmptyList.d);
    public final /* synthetic */ Object d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList$Companion;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public KeylineList(List list) {
        int iNextIndex;
        int iNextIndex2;
        this.d = list;
        Iterator it = iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((Keyline) it.next()).f) {
                break;
            } else {
                i2++;
            }
        }
        this.e = i2;
        Iterator it2 = iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            } else if (!((Keyline) it2.next()).e) {
                break;
            } else {
                i3++;
            }
        }
        this.f = i3;
        ListIterator<Keyline> listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            } else if (!listIterator.previous().e) {
                iNextIndex2 = listIterator.nextIndex();
                break;
            }
        }
        this.g = iNextIndex2;
        Iterator it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            } else if (((Keyline) it3.next()).d) {
                break;
            } else {
                i++;
            }
        }
        this.h = i;
        ListIterator<Keyline> listIterator2 = listIterator(size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (listIterator2.previous().d) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        this.i = iNextIndex;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Keyline get(int i) {
        return (Keyline) this.d.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Keyline)) {
            return false;
        }
        return this.d.contains((Keyline) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.d.containsAll(collection);
    }

    public final Keyline d() {
        Keyline keyline = (Keyline) CollectionsKt.J(this.i, this);
        if (keyline != null) {
            return keyline;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeylineList) {
            ?? r0 = this.d;
            KeylineList keylineList = (KeylineList) obj;
            if (r0.size() == keylineList.d.size()) {
                int size = r0.size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.c(get(i), keylineList.get(i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += get(i).hashCode() * 31;
        }
        return iHashCode;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Keyline)) {
            return -1;
        }
        return this.d.indexOf((Keyline) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.d.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Keyline)) {
            return -1;
        }
        return this.d.lastIndexOf((Keyline) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final ListIterator<Keyline> listIterator() {
        return this.d.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Keyline remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Keyline set(int i, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final List<Keyline> subList(int i, int i2) {
        return this.d.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final ListIterator<Keyline> listIterator(int i) {
        return this.d.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
