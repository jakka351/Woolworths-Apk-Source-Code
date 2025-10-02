package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    public final ImmutableMap e;

    /* renamed from: com.google.common.collect.ImmutableMapValues$1, reason: invalid class name */
    class AnonymousClass1 extends UnmodifiableIterator<Object> {
        public final UnmodifiableIterator d;

        public AnonymousClass1(ImmutableMapValues immutableMapValues) {
            this.d = immutableMapValues.e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return ((Map.Entry) this.d.next()).getValue();
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    public static class SerializedForm<V> implements Serializable {
        public final ImmutableMap d;

        public SerializedForm(ImmutableMap immutableMap) {
            this.d = immutableMap;
        }

        public Object readResolve() {
            return this.d.values();
        }
    }

    public ImmutableMapValues(ImmutableMap immutableMap) {
        this.e = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        final ImmutableList immutableListB = this.e.entrySet().b();
        return new ImmutableList<Object>() { // from class: com.google.common.collect.ImmutableMapValues.2
            @Override // java.util.List
            public final Object get(int i) {
                return ((Map.Entry) immutableListB.get(i)).getValue();
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return immutableListB.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return obj != null && Iterators.d(new AnonymousClass1(this), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.e.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.e);
    }
}
