package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/MapBuilderEntries;", "K", "V", "Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapBuilderEntries<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {
    public final MapBuilder d;

    public MapBuilderEntries(MapBuilder mapBuilder) {
        this.d = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.h(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* renamed from: b */
    public final int getH() {
        return this.d.l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        return this.d.e(elements);
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public final boolean d(Map.Entry element) {
        Intrinsics.h(element, "element");
        return this.d.f(element);
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public final boolean g(Map.Entry element) {
        Intrinsics.h(element, "element");
        MapBuilder mapBuilder = this.d;
        mapBuilder.getClass();
        mapBuilder.c();
        int iH = mapBuilder.h(element.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = mapBuilder.e;
        Intrinsics.e(objArr);
        if (!Intrinsics.c(objArr[iH], element.getValue())) {
            return false;
        }
        mapBuilder.l(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.d;
        mapBuilder.getClass();
        return new MapBuilder.EntriesItr(mapBuilder);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        this.d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        this.d.c();
        return super.retainAll(elements);
    }
}
