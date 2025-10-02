package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {
    public static final ImmutableSortedMap j;
    public final transient RegularImmutableSortedSet g;
    public final transient ImmutableList h;
    public final transient ImmutableSortedMap i;

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public transient Object[] d;
        public transient Object[] e;
        public final Comparator f;

        public Builder(Comparator comparator) {
            super(4);
            comparator.getClass();
            this.f = comparator;
            this.d = new Object[4];
            this.e = new Object[4];
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap b() {
            int i = this.b;
            Comparator comparator = this.f;
            if (i == 0) {
                return ImmutableSortedMap.q(comparator);
            }
            if (i == 1) {
                Object obj = this.d[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.e[0];
                Objects.requireNonNull(obj2);
                ImmutableList immutableListW = ImmutableList.w(obj);
                comparator.getClass();
                return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableListW, comparator), ImmutableList.w(obj2), null);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.d, i);
            Arrays.sort(objArrCopyOf, comparator);
            int i2 = this.b;
            Object[] objArr = new Object[i2];
            for (int i3 = 0; i3 < this.b; i3++) {
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    if (comparator.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i4] + " and " + objArrCopyOf[i3]);
                    }
                }
                Object obj3 = this.d[i3];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
                Object obj4 = this.e[i3];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.l(objArrCopyOf.length, objArrCopyOf), comparator), ImmutableList.l(i2, objArr), null);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder c(Object obj, Object obj2) {
            int i = this.b + 1;
            Object[] objArr = this.d;
            if (i > objArr.length) {
                int iB = ImmutableCollection.Builder.b(objArr.length, i);
                this.d = Arrays.copyOf(this.d, iB);
                this.e = Arrays.copyOf(this.e, iB);
            }
            CollectPreconditions.a(obj, obj2);
            Object[] objArr2 = this.d;
            int i2 = this.b;
            objArr2[i2] = obj;
            this.e[i2] = obj2;
            this.b = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder d(Iterable iterable) {
            super.d(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder e(Map map) {
            d(((ImmutableMap) map).entrySet());
            return this;
        }
    }

    @J2ktIncompatible
    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        public final Comparator f;

        public SerializedForm(ImmutableSortedMap immutableSortedMap) {
            super(immutableSortedMap);
            this.f = immutableSortedMap.g.g;
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public final ImmutableMap.Builder a(int i) {
            return new Builder(this.f);
        }
    }

    static {
        RegularImmutableSortedSet regularImmutableSortedSetE = ImmutableSortedSet.E(NaturalOrdering.f);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        j = new ImmutableSortedMap(regularImmutableSortedSetE, RegularImmutableList.h, null);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList, ImmutableSortedMap immutableSortedMap) {
        this.g = regularImmutableSortedSet;
        this.h = immutableList;
        this.i = immutableSortedMap;
    }

    public static ImmutableSortedMap q(Comparator comparator) {
        return NaturalOrdering.f.equals(comparator) ? j : new ImmutableSortedMap(ImmutableSortedSet.E(comparator), RegularImmutableList.h, null);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return Maps.g(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.g.g;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet d() {
        if (!isEmpty()) {
            return new ImmutableMapEntrySet<Object, Object>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                /* renamed from: k */
                public final UnmodifiableIterator iterator() {
                    return b().listIterator(0);
                }

                @Override // com.google.common.collect.ImmutableSet
                public final ImmutableList t() {
                    return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                        @Override // java.util.List
                        public final Object get(int i) {
                            C1EntrySet c1EntrySet = C1EntrySet.this;
                            return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.g.i.get(i), ImmutableSortedMap.this.h.get(i));
                        }

                        @Override // com.google.common.collect.ImmutableCollection
                        public final boolean j() {
                            return true;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public final int size() {
                            return ImmutableSortedMap.this.h.size();
                        }

                        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                        @J2ktIncompatible
                        @GwtIncompatible
                        public Object writeReplace() {
                            return super.writeReplace();
                        }
                    };
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                @GwtIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public final ImmutableMap z() {
                    return ImmutableSortedMap.this;
                }
            };
        }
        int i = ImmutableSet.f;
        return RegularImmutableSet.m;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.g.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.i;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        boolean zIsEmpty = isEmpty();
        RegularImmutableSortedSet regularImmutableSortedSet = this.g;
        return zIsEmpty ? q(Ordering.b(regularImmutableSortedSet.g).g()) : new ImmutableSortedMap((RegularImmutableSortedSet) regularImmutableSortedSet.descendingSet(), this.h.z(), this);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().b().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.g.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return Maps.g(floorEntry(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.common.collect.RegularImmutableSortedSet r0 = r3.g
            r0.getClass()
            r1 = -1
            if (r4 != 0) goto La
        L8:
            r4 = r1
            goto L14
        La:
            com.google.common.collect.ImmutableList r2 = r0.i     // Catch: java.lang.ClassCastException -> L8
            java.util.Comparator r0 = r0.g     // Catch: java.lang.ClassCastException -> L8
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L8
            if (r4 < 0) goto L8
        L14:
            if (r4 != r1) goto L18
            r4 = 0
            return r4
        L18:
            com.google.common.collect.ImmutableList r0 = r3.h
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return Maps.g(higherEntry(obj));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean i() {
        return this.g.i.j() || this.h.j();
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: k */
    public final ImmutableSet keySet() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set keySet() {
        return this.g;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().b().get(this.h.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.g.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return Maps.g(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: p */
    public final ImmutableCollection values() {
        return this.h;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final ImmutableSortedMap r(int i, int i2) {
        ImmutableList immutableList = this.h;
        if (i == 0 && i2 == immutableList.size()) {
            return this;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = this.g;
        return i == i2 ? q(regularImmutableSortedSet.g) : new ImmutableSortedMap(regularImmutableSortedSet.P(i, i2), immutableList.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap headMap(Object obj, boolean z) {
        obj.getClass();
        return r(0, this.g.Q(obj, z));
    }

    @Override // java.util.Map
    public final int size() {
        return this.h.size();
    }

    @Override // java.util.NavigableMap
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        Preconditions.h(this.g.g.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap tailMap(Object obj, boolean z) {
        obj.getClass();
        return r(this.g.S(obj, z), this.h.size());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public final Collection values() {
        return this.h;
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
