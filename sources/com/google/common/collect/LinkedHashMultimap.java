package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    public transient ValueEntry k;

    /* renamed from: com.google.common.collect.LinkedHashMultimap$1, reason: invalid class name */
    class AnonymousClass1 implements Iterator<Map.Entry<Object, Object>> {
        public ValueEntry d;
        public ValueEntry e;

        public AnonymousClass1() {
            ValueEntry valueEntry = LinkedHashMultimap.this.k.k;
            Objects.requireNonNull(valueEntry);
            this.d = valueEntry;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != LinkedHashMultimap.this.k;
        }

        @Override // java.util.Iterator
        public final Map.Entry<Object, Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ValueEntry valueEntry = this.d;
            this.e = valueEntry;
            ValueEntry valueEntry2 = valueEntry.k;
            Objects.requireNonNull(valueEntry2);
            this.d = valueEntry2;
            return valueEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Preconditions.q("no calls to next() since the last call to remove()", this.e != null);
            ValueEntry valueEntry = this.e;
            LinkedHashMultimap.this.remove(valueEntry.d, valueEntry.e);
            this.e = null;
        }
    }

    @VisibleForTesting
    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements ValueSetLink<K, V> {
        public final int f;
        public ValueEntry g;
        public ValueSetLink h;
        public ValueSetLink i;
        public ValueEntry j;
        public ValueEntry k;

        public ValueEntry(Object obj, Object obj2, int i, ValueEntry valueEntry) {
            super(obj, obj2);
            this.f = i;
            this.g = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void b(ValueSetLink valueSetLink) {
            this.i = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void d(ValueSetLink valueSetLink) {
            this.h = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final ValueSetLink g() {
            ValueSetLink valueSetLink = this.i;
            Objects.requireNonNull(valueSetLink);
            return valueSetLink;
        }
    }

    @VisibleForTesting
    public final class ValueSet extends Sets.ImprovedAbstractSet<V> implements ValueSetLink<K, V> {
        public final Object d;
        public int f = 0;
        public int g = 0;
        public ValueSetLink h = this;
        public ValueSetLink i = this;
        public ValueEntry[] e = new ValueEntry[Hashing.a(1.0d, 2)];

        public ValueSet(Object obj) {
            this.d = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [com.google.common.collect.LinkedHashMultimap$ValueSet, com.google.common.collect.LinkedHashMultimap$ValueSetLink] */
        /* JADX WARN: Type inference failed for: r1v5, types: [com.google.common.collect.LinkedHashMultimap$ValueSetLink] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.e;
            int length = (valueEntryArr.length - 1) & iC;
            ValueEntry valueEntry = valueEntryArr[length];
            for (ValueEntry valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.g) {
                if (valueEntry2.f == iC && com.google.common.base.Objects.a(valueEntry2.e, obj)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.d, obj, iC, valueEntry);
            ValueSetLink valueSetLink = this.i;
            valueSetLink.b(valueEntry3);
            valueEntry3.d(valueSetLink);
            valueEntry3.b(this);
            d(valueEntry3);
            LinkedHashMultimap linkedHashMultimap = LinkedHashMultimap.this;
            ValueEntry valueEntry4 = linkedHashMultimap.k.j;
            Objects.requireNonNull(valueEntry4);
            valueEntry4.k = valueEntry3;
            valueEntry3.j = valueEntry4;
            ValueEntry valueEntry5 = linkedHashMultimap.k;
            valueEntry3.k = valueEntry5;
            valueEntry5.j = valueEntry3;
            ValueEntry[] valueEntryArr2 = this.e;
            valueEntryArr2[length] = valueEntry3;
            int i = this.f + 1;
            this.f = i;
            this.g++;
            int length2 = valueEntryArr2.length;
            if (i > 1.0d * length2 && length2 < 1073741824) {
                int length3 = valueEntryArr2.length * 2;
                ValueEntry[] valueEntryArr3 = new ValueEntry[length3];
                this.e = valueEntryArr3;
                int i2 = length3 - 1;
                for (ValueEntry valueEntryG = this.h; valueEntryG != this; valueEntryG = valueEntryG.g()) {
                    ValueEntry valueEntry6 = valueEntryG;
                    int i3 = valueEntry6.f & i2;
                    valueEntry6.g = valueEntryArr3[i3];
                    valueEntryArr3[i3] = valueEntry6;
                }
            }
            return true;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void b(ValueSetLink valueSetLink) {
            this.h = valueSetLink;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Arrays.fill(this.e, (Object) null);
            this.f = 0;
            for (ValueSetLink valueSetLinkG = this.h; valueSetLinkG != this; valueSetLinkG = valueSetLinkG.g()) {
                ValueEntry valueEntry = (ValueEntry) valueSetLinkG;
                ValueEntry valueEntry2 = valueEntry.j;
                Objects.requireNonNull(valueEntry2);
                ValueEntry valueEntry3 = valueEntry.k;
                Objects.requireNonNull(valueEntry3);
                valueEntry2.k = valueEntry3;
                valueEntry3.j = valueEntry2;
            }
            b(this);
            d(this);
            this.g++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.e;
            for (ValueEntry valueEntry = valueEntryArr[(valueEntryArr.length - 1) & iC]; valueEntry != null; valueEntry = valueEntry.g) {
                if (valueEntry.f == iC && com.google.common.base.Objects.a(valueEntry.e, obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final void d(ValueSetLink valueSetLink) {
            this.i = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public final ValueSetLink g() {
            return this.h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Iterator<Object>() { // from class: com.google.common.collect.LinkedHashMultimap.ValueSet.1
                public ValueSetLink d;
                public ValueEntry e;
                public int f;

                {
                    this.d = ValueSet.this.h;
                    this.f = ValueSet.this.g;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    ValueSet valueSet = ValueSet.this;
                    if (valueSet.g == this.f) {
                        return this.d != valueSet;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    ValueEntry valueEntry = (ValueEntry) this.d;
                    Object obj = valueEntry.e;
                    this.e = valueEntry;
                    this.d = valueEntry.g();
                    return obj;
                }

                @Override // java.util.Iterator
                public final void remove() {
                    ValueSet valueSet = ValueSet.this;
                    if (valueSet.g != this.f) {
                        throw new ConcurrentModificationException();
                    }
                    Preconditions.q("no calls to next() since the last call to remove()", this.e != null);
                    valueSet.remove(this.e.e);
                    this.f = valueSet.g;
                    this.e = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int iC = Hashing.c(obj);
            ValueEntry[] valueEntryArr = this.e;
            int length = (valueEntryArr.length - 1) & iC;
            ValueEntry valueEntry = null;
            for (ValueEntry valueEntry2 = valueEntryArr[length]; valueEntry2 != null; valueEntry2 = valueEntry2.g) {
                if (valueEntry2.f == iC && com.google.common.base.Objects.a(valueEntry2.e, obj)) {
                    if (valueEntry == null) {
                        this.e[length] = valueEntry2.g;
                    } else {
                        valueEntry.g = valueEntry2.g;
                    }
                    ValueSetLink valueSetLink = valueEntry2.h;
                    Objects.requireNonNull(valueSetLink);
                    ValueSetLink valueSetLinkG = valueEntry2.g();
                    valueSetLink.b(valueSetLinkG);
                    valueSetLinkG.d(valueSetLink);
                    ValueEntry valueEntry3 = valueEntry2.j;
                    Objects.requireNonNull(valueEntry3);
                    ValueEntry valueEntry4 = valueEntry2.k;
                    Objects.requireNonNull(valueEntry4);
                    valueEntry3.k = valueEntry4;
                    valueEntry4.j = valueEntry3;
                    this.f--;
                    this.g++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f;
        }
    }

    public interface ValueSetLink<K, V> {
        void b(ValueSetLink valueSetLink);

        void d(ValueSetLink valueSetLink);

        ValueSetLink g();
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry valueEntry = new ValueEntry(null, null, 0, null);
        this.k = valueEntry;
        valueEntry.k = valueEntry;
        valueEntry.j = valueEntry;
        int i = objectInputStream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            compactLinkedHashMap.put(object, new ValueSet(object));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) compactLinkedHashMap.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        n(compactLinkedHashMap);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        Iterator it = super.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(this.j);
        for (Map.Entry entry : super.l()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final void clear() {
        super.clear();
        ValueEntry valueEntry = this.k;
        valueEntry.k = valueEntry;
        valueEntry.j = valueEntry;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final boolean containsKey(Object obj) {
        return this.i.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    public final Iterator g() {
        return new AnonymousClass1();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection h() {
        return new CompactLinkedHashSet(2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection i(Object obj) {
        return new ValueSet(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection l() {
        return super.l();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Iterator p() {
        return new Maps.AnonymousClass2(new AnonymousClass1());
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: r */
    public final Set h() {
        return new CompactLinkedHashSet(2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final int size() {
        return this.j;
    }
}
