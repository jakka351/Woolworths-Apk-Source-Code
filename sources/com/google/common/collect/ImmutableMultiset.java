package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {
    public static final /* synthetic */ int g = 0;
    public transient ImmutableList e;
    public transient ImmutableSet f;

    public static class Builder<E> extends ImmutableCollection.Builder<E> {

        /* renamed from: a, reason: collision with root package name */
        public ObjectCountHashMap f14888a;
        public boolean b = false;

        public Builder(int i) {
            this.f14888a = new ObjectCountHashMap(i, 0);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Builder a(Object obj) {
            return d(1, obj);
        }

        public Builder d(int i, Object obj) {
            Objects.requireNonNull(this.f14888a);
            if (i == 0) {
                return this;
            }
            if (this.b) {
                ObjectCountHashMap objectCountHashMap = this.f14888a;
                ObjectCountHashMap objectCountHashMap2 = new ObjectCountHashMap();
                objectCountHashMap2.h(objectCountHashMap.c);
                for (int iC = objectCountHashMap.c(); iC != -1; iC = objectCountHashMap.k(iC)) {
                    objectCountHashMap2.m(objectCountHashMap.f(iC), objectCountHashMap.e(iC));
                }
                this.f14888a = objectCountHashMap2;
            }
            this.b = false;
            obj.getClass();
            ObjectCountHashMap objectCountHashMap3 = this.f14888a;
            objectCountHashMap3.m(i + objectCountHashMap3.d(obj), obj);
            return this;
        }

        public ImmutableMultiset e() {
            Objects.requireNonNull(this.f14888a);
            if (this.f14888a.c == 0) {
                int i = ImmutableMultiset.g;
                return RegularImmutableMultiset.k;
            }
            this.b = true;
            return new RegularImmutableMultiset(this.f14888a);
        }
    }

    public final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        public EntrySet() {
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && ImmutableMultiset.this.e2(entry.a()) == entry.getCount();
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i) {
            return ImmutableMultiset.this.o(i);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return ImmutableMultiset.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ImmutableMultiset.this.c().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    public static class EntrySetSerializedForm<E> implements Serializable {
        public final ImmutableMultiset d;

        public EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
            this.d = immutableMultiset;
        }

        public Object readResolve() {
            return this.d.entrySet();
        }
    }

    public static ImmutableMultiset l(Collection collection) {
        if (collection instanceof ImmutableMultiset) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) collection;
            if (!immutableMultiset.j()) {
                return immutableMultiset;
            }
        }
        boolean z = collection instanceof Multiset;
        Builder builder = new Builder(z ? ((Multiset) collection).c().size() : 11);
        Objects.requireNonNull(builder.f14888a);
        if (z) {
            Multiset multiset = (Multiset) collection;
            ObjectCountHashMap objectCountHashMap = multiset instanceof RegularImmutableMultiset ? ((RegularImmutableMultiset) multiset).h : multiset instanceof AbstractMapBasedMultiset ? ((AbstractMapBasedMultiset) multiset).f : null;
            if (objectCountHashMap != null) {
                ObjectCountHashMap objectCountHashMap2 = builder.f14888a;
                objectCountHashMap2.b(Math.max(objectCountHashMap2.c, objectCountHashMap.c));
                for (int iC = objectCountHashMap.c(); iC >= 0; iC = objectCountHashMap.k(iC)) {
                    builder.d(objectCountHashMap.f(iC), objectCountHashMap.e(iC));
                }
            } else {
                Set setEntrySet = multiset.entrySet();
                ObjectCountHashMap objectCountHashMap3 = builder.f14888a;
                objectCountHashMap3.b(Math.max(objectCountHashMap3.c, setEntrySet.size()));
                for (Multiset.Entry entry : multiset.entrySet()) {
                    builder.d(entry.getCount(), entry.a());
                }
            }
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                builder.a(it.next());
            }
        }
        return builder.e();
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.Multiset
    public final boolean V1(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    public final int add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        ImmutableList immutableList = this.e;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListB = super.b();
        this.e = immutableListB;
        return immutableListB;
    }

    @Override // com.google.common.collect.Multiset
    public final int b0(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return e2(obj) > 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int d(int i, Object[] objArr) {
        UnmodifiableIterator it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            Arrays.fill(objArr, i, entry.getCount() + i, entry.a());
            i += entry.getCount();
        }
        return i;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.a(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return Sets.e(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        final UnmodifiableIterator it = entrySet().iterator();
        return new UnmodifiableIterator<Object>() { // from class: com.google.common.collect.ImmutableMultiset.1
            public int d;
            public Object e;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.d > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.d <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.e = entry.a();
                    this.d = entry.getCount();
                }
                this.d--;
                Object obj = this.e;
                Objects.requireNonNull(obj);
                return obj;
            }
        };
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet c();

    @Override // com.google.common.collect.Multiset
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet entrySet() {
        ImmutableSet entrySet = this.f;
        if (entrySet == null) {
            entrySet = isEmpty() ? RegularImmutableSet.m : new EntrySet();
            this.f = entrySet;
        }
        return entrySet;
    }

    public abstract Multiset.Entry o(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    public final int w2(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public abstract Object writeReplace();
}
