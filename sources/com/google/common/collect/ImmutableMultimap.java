package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {
    public final transient ImmutableMap i;
    public final transient int j;

    /* renamed from: com.google.common.collect.ImmutableMultimap$1, reason: invalid class name */
    class AnonymousClass1 extends UnmodifiableIterator<Map.Entry<Object, Object>> {
        public final UnmodifiableIterator d;
        public Object e = null;
        public UnmodifiableIterator f = Iterators.ArrayItr.g;

        public AnonymousClass1(ImmutableMultimap immutableMultimap) {
            this.d = immutableMultimap.i.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f.hasNext()) {
                Map.Entry entry = (Map.Entry) this.d.next();
                this.e = entry.getKey();
                this.f = ((ImmutableCollection) entry.getValue()).iterator();
            }
            Object obj = this.e;
            Objects.requireNonNull(obj);
            return new ImmutableEntry(obj, this.f.next());
        }
    }

    @DoNotMock
    public static class Builder<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Map f14886a;
    }

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        public final ImmutableMultimap e;

        public EntryCollection(ImmutableMultimap immutableMultimap) {
            this.e = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.e.y1(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return this.e.i.i();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: k */
        public final UnmodifiableIterator iterator() {
            ImmutableMultimap immutableMultimap = this.e;
            immutableMultimap.getClass();
            return new AnonymousClass1(immutableMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.e.j;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static class FieldSettersHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f14887a = Serialization.a(ImmutableMultimap.class, "map");
        public static final Serialization.FieldSetter b = Serialization.a(ImmutableMultimap.class, "size");
    }

    public class Keys extends ImmutableMultiset<K> {
        public Keys() {
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return ImmutableMultimap.this.i.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public final int e2(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.i.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        /* renamed from: m */
        public final ImmutableSet c() {
            return ImmutableMultimap.this.i.keySet();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public final Multiset.Entry o(int i) {
            Map.Entry entry = (Map.Entry) ImmutableMultimap.this.i.entrySet().b().get(i);
            return new Multisets.ImmutableEntry(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ImmutableMultimap.this.j;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static final class KeysSerializedForm implements Serializable {
        public final ImmutableMultimap d;

        public KeysSerializedForm(ImmutableMultimap immutableMultimap) {
            this.d = immutableMultimap;
        }

        public Object readResolve() {
            return this.d.m();
        }
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {
        public final transient ImmutableMultimap e;

        public Values(ImmutableMultimap immutableMultimap) {
            this.e = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.e.containsValue(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection
        public final int d(int i, Object[] objArr) {
            UnmodifiableIterator it = this.e.i.values().iterator();
            while (it.hasNext()) {
                i = ((ImmutableCollection) it.next()).d(i, objArr);
            }
            return i;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: k */
        public final UnmodifiableIterator iterator() {
            ImmutableMultimap immutableMultimap = this.e;
            immutableMultimap.getClass();
            return new UnmodifiableIterator<Object>(immutableMultimap) { // from class: com.google.common.collect.ImmutableMultimap.2
                public final UnmodifiableIterator d;
                public UnmodifiableIterator e = Iterators.ArrayItr.g;

                {
                    this.d = immutableMultimap.i.values().iterator();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.e.hasNext() || this.d.hasNext();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Iterator
                public final Object next() {
                    if (!this.e.hasNext()) {
                        this.e = ((ImmutableCollection) this.d.next()).iterator();
                    }
                    return this.e.next();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.e.j;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ImmutableMultimap(ImmutableMap immutableMap, int i) {
        this.i = immutableMap;
        this.j = i;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Multiset F() {
        return (ImmutableMultiset) super.F();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection b(Object obj) {
        n();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection c() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.Multimap
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.i.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set d() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Multiset e() {
        return new Keys();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Collection f() {
        return new Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Iterator g() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ImmutableMap p1() {
        return this.i;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection l() {
        return (ImmutableCollection) super.l();
    }

    public final UnmodifiableIterator j() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection get(Object obj);

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set keySet() {
        return this.i.keySet();
    }

    public final ImmutableMultiset m() {
        return (ImmutableMultiset) super.F();
    }

    public ImmutableCollection n() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap
    public final int size() {
        return this.j;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection values() {
        return (ImmutableCollection) super.values();
    }
}
