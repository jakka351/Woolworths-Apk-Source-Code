package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

@GwtIncompatible
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingSet<Object> {
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSet
        /* renamed from: b2 */
        public final Set P1() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.g(this, collection);
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractIterator<Multiset.Entry<Object>> {
        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$3, reason: invalid class name */
    class AnonymousClass3 extends ForwardingIterator<Multiset.Entry<Object>> {
        public Multiset.Entry d;

        @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
        public final Object P1() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingIterator
        /* renamed from: R1 */
        public final Iterator P1() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public final Object next() {
            Multiset.Entry entry = (Multiset.Entry) super.next();
            this.d = entry;
            return entry;
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public final void remove() {
            Preconditions.q("no calls to next() since the last call to remove()", this.d != null);
            throw null;
        }
    }

    public static class FieldSettersHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f14881a = Serialization.a(ConcurrentHashMultiset.class, "countMap");
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        FieldSettersHolder.f14881a.a(this, (ConcurrentMap) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(null);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean V1(int i, Object obj) {
        obj.getClass();
        CollectPreconditions.b(i, "oldCount");
        CollectPreconditions.b(0, "newCount");
        Maps.h(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i, Object obj) {
        obj.getClass();
        if (i == 0) {
            Maps.h(obj, null);
            throw null;
        }
        CollectPreconditions.c(i, "occurrences");
        Maps.h(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set b() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int b0(int i, Object obj) {
        if (i == 0) {
            Maps.h(obj, null);
            throw null;
        }
        CollectPreconditions.c(i, "occurrences");
        Maps.h(obj, null);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set d() {
        return new EntrySet();
    }

    @Override // com.google.common.collect.Multiset
    public final int e2(Object obj) {
        Maps.h(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int g() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator h() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator i() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int w2(Object obj) {
        obj.getClass();
        CollectPreconditions.b(0, "count");
        Maps.h(obj, null);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw null;
    }

    public class EntrySet extends AbstractMultiset<E>.EntrySet {
        public EntrySet() {
            super();
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public final Multiset h() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            AbstractMultiset abstractMultiset = AbstractMultiset.this;
            ArrayList arrayList = new ArrayList(Lists.a(abstractMultiset.g()));
            Iterators.a(arrayList, abstractMultiset.i());
            return arrayList.toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            AbstractMultiset abstractMultiset = AbstractMultiset.this;
            ArrayList arrayList = new ArrayList(Lists.a(abstractMultiset.g()));
            Iterators.a(arrayList, abstractMultiset.i());
            return arrayList.toArray(objArr);
        }
    }
}
