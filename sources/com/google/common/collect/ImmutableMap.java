package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.DoNotMock;
import com.tealium.core.Tealium;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

@GwtCompatible
@DoNotMock
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public transient ImmutableSet d;
    public transient ImmutableSet e;
    public transient ImmutableCollection f;

    @DoNotMock
    public static class Builder<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f14884a;
        public int b = 0;
        public DuplicateKey c;

        /* loaded from: classes6.dex */
        public static final class DuplicateKey {

            /* renamed from: a, reason: collision with root package name */
            public final Object f14885a;
            public final Object b;
            public final Object c;

            public DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.f14885a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.f14885a;
                sb.append(obj);
                sb.append("=");
                sb.append(this.b);
                sb.append(" and ");
                sb.append(obj);
                sb.append("=");
                sb.append(this.c);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public Builder(int i) {
            this.f14884a = new Object[i * 2];
        }

        public final ImmutableMap a(boolean z) {
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (z && (duplicateKey2 = this.c) != null) {
                throw duplicateKey2.a();
            }
            RegularImmutableMap regularImmutableMapQ = RegularImmutableMap.q(this.b, this.f14884a, this);
            if (!z || (duplicateKey = this.c) == null) {
                return regularImmutableMapQ;
            }
            throw duplicateKey.a();
        }

        public ImmutableMap b() {
            return a(true);
        }

        public Builder c(Object obj, Object obj2) {
            int i = (this.b + 1) * 2;
            Object[] objArr = this.f14884a;
            if (i > objArr.length) {
                this.f14884a = Arrays.copyOf(objArr, ImmutableCollection.Builder.b(objArr.length, i));
            }
            CollectPreconditions.a(obj, obj2);
            Object[] objArr2 = this.f14884a;
            int i2 = this.b;
            int i3 = i2 * 2;
            objArr2[i3] = obj;
            objArr2[i3 + 1] = obj2;
            this.b = i2 + 1;
            return this;
        }

        public Builder d(Iterable iterable) {
            if (iterable instanceof Collection) {
                int size = (((Collection) iterable).size() + this.b) * 2;
                Object[] objArr = this.f14884a;
                if (size > objArr.length) {
                    this.f14884a = Arrays.copyOf(objArr, ImmutableCollection.Builder.b(objArr.length, size));
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder e(Map map) {
            return d(((ImmutableMap) map).entrySet());
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableSet d() {
            return new ImmutableMapEntrySet<Object, Object>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                public final Iterator iterator() {
                    return IteratorBasedImmutableMap.this.q();
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* renamed from: k */
                public final UnmodifiableIterator iterator() {
                    return IteratorBasedImmutableMap.this.q();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                @GwtIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public final ImmutableMap z() {
                    return IteratorBasedImmutableMap.this;
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet e() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableCollection f() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set keySet() {
            return keySet();
        }

        public abstract UnmodifiableIterator q();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }

        @Override // com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: classes6.dex */
    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1, reason: invalid class name */
        class AnonymousClass1 extends UnmodifiableIterator<Map.Entry<Object, ImmutableSet<Object>>> {

            /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1$1, reason: invalid class name and collision with other inner class name */
            class C03081 extends AbstractMapEntry<Object, ImmutableSet<Object>> {
                @Override // java.util.Map.Entry
                public final Object getKey() {
                    throw null;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
                    throw null;
                }
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw null;
            }
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final ImmutableSet e() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean h() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final UnmodifiableIterator q() {
            throw null;
        }

        @Override // java.util.Map
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @J2ktIncompatible
    /* loaded from: classes6.dex */
    public static class SerializedForm<K, V> implements Serializable {
        public final Object[] d;
        public final Object[] e;

        public SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i] = entry.getKey();
                objArr2[i] = entry.getValue();
                i++;
            }
            this.d = objArr;
            this.e = objArr2;
        }

        public Builder a(int i) {
            return new Builder(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.d;
            boolean z = objArr instanceof ImmutableSet;
            Object[] objArr2 = this.e;
            if (!z) {
                Builder builderA = a(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    builderA.c(objArr[i], objArr2[i]);
                }
                return builderA.b();
            }
            ImmutableSet immutableSet = (ImmutableSet) objArr;
            Builder builderA2 = a(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it2 = ((ImmutableCollection) objArr2).iterator();
            while (it.hasNext()) {
                builderA2.c(it.next(), it2.next());
            }
            return builderA2.b();
        }
    }

    public static Builder a() {
        return new Builder(4);
    }

    public static Builder b(int i) {
        CollectPreconditions.b(i, "expectedSize");
        return new Builder(i);
    }

    public static ImmutableMap c(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.i()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        Builder builder = new Builder(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        builder.d(setEntrySet);
        return builder.a(true);
    }

    public static ImmutableMap l() {
        return RegularImmutableMap.j;
    }

    public static ImmutableMap m(Tealium tealium, Tealium tealium2, Tealium tealium3) {
        CollectPreconditions.a("", tealium);
        CollectPreconditions.a("AU", tealium2);
        CollectPreconditions.a("NZ", tealium3);
        return RegularImmutableMap.q(3, new Object[]{"", tealium, "AU", tealium2, "NZ", tealium3}, null);
    }

    public static ImmutableMap n(String str, String str2, String str3, String str4) {
        CollectPreconditions.a("Purpose1", str);
        CollectPreconditions.a("Purpose3", str2);
        CollectPreconditions.a("Purpose4", str3);
        CollectPreconditions.a("Purpose7", str4);
        return RegularImmutableMap.q(4, new Object[]{"Purpose1", str, "Purpose3", str2, "Purpose4", str3, "Purpose7", str4}, null);
    }

    public static ImmutableMap o(String str, String str2, String str3, String str4, String str5) {
        return RegularImmutableMap.q(5, new Object[]{"AuthorizePurpose1", str, "AuthorizePurpose3", str2, "AuthorizePurpose4", str3, "AuthorizePurpose7", str4, "PurposeDiagnostics", str5}, null);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet d();

    public abstract ImmutableSet e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.d(obj, this);
    }

    public abstract ImmutableCollection f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.d;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetD = d();
        this.d = immutableSetD;
        return immutableSetD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.e(entrySet());
    }

    public abstract boolean i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public UnmodifiableIterator j() {
        final UnmodifiableIterator it = entrySet().iterator();
        return new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return ((Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.e;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetE = e();
        this.e = immutableSetE;
        return immutableSetE;
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.f;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection immutableCollectionF = f();
        this.f = immutableCollectionF;
        return immutableCollectionF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return Maps.i(this);
    }

    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
