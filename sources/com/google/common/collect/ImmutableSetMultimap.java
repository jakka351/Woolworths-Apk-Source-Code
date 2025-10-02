package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Serialization;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {
    public final transient ImmutableSet k;
    public transient ImmutableSet l;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    }

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableSetMultimap g;

        public EntrySet(ImmutableSetMultimap immutableSetMultimap) {
            this.g = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.g.y1(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return this.g.j();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: k */
        public final UnmodifiableIterator iterator() {
            return this.g.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.g.j;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static final class SetFieldSettersHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final Serialization.FieldSetter f14891a = Serialization.a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap() {
        super(RegularImmutableMap.j, 0);
        int i = ImmutableSet.f;
        this.k = RegularImmutableSet.m;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        Object objE;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(YU.a.d(i, "Invalid key count "));
        }
        ImmutableMap.Builder builderA = ImmutableMap.a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(YU.a.d(i4, "Invalid value count "));
            }
            ImmutableSet.Builder builder = comparator == null ? new ImmutableSet.Builder(4) : new ImmutableSortedSet.Builder(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builder.a(object2);
            }
            ImmutableSet immutableSetK = builder.k();
            if (immutableSetK.size() != i4) {
                throw new InvalidObjectException(androidx.camera.core.impl.b.m(object, "Duplicate key-value pairs exist for key "));
            }
            builderA.c(object, immutableSetK);
            i2 += i4;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.f14887a.a(this, builderA.a(true));
            Serialization.FieldSetter fieldSetter = ImmutableMultimap.FieldSettersHolder.b;
            fieldSetter.getClass();
            try {
                fieldSetter.f14904a.set(this, Integer.valueOf(i2));
                Serialization.FieldSetter fieldSetter2 = SetFieldSettersHolder.f14891a;
                if (comparator == null) {
                    int i6 = ImmutableSet.f;
                    objE = RegularImmutableSet.m;
                } else {
                    objE = ImmutableSortedSet.E(comparator);
                }
                fieldSetter2.a(this, objE);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ImmutableSet immutableSet = this.k;
        objectOutputStream.writeObject(immutableSet instanceof ImmutableSortedSet ? ((ImmutableSortedSet) immutableSet).g : null);
        Serialization.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Collection get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.i.get(obj), this.k);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: i */
    public final ImmutableCollection l() {
        ImmutableSet immutableSet = this.l;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.l = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: k */
    public final ImmutableCollection get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.i.get(obj), this.k);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Collection l() {
        ImmutableSet immutableSet = this.l;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.l = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection n() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Set get(Object obj) {
        return (ImmutableSet) MoreObjects.a((ImmutableSet) this.i.get(obj), this.k);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final Set l() {
        ImmutableSet immutableSet = this.l;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.l = entrySet;
        return entrySet;
    }
}
