package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {
    public static final /* synthetic */ int i = 0;
    public final transient EnumSet g;
    public transient int h;

    @J2ktIncompatible
    public static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
        public final EnumSet d;

        public EnumSerializedForm(EnumSet enumSet) {
            this.d = enumSet;
        }

        public Object readResolve() {
            return new ImmutableEnumSet(this.d.clone());
        }
    }

    public ImmutableEnumSet(EnumSet enumSet) {
        this.g = enumSet;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof ImmutableEnumSet) {
            collection = ((ImmutableEnumSet) collection).g;
        }
        return this.g.containsAll(collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            obj = ((ImmutableEnumSet) obj).g;
        }
        return this.g.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i2 = this.h;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.g.hashCode();
        this.h = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.g.isEmpty();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return Iterators.n(this.g.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.g.toString();
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean u() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new EnumSerializedForm(this.g);
    }
}
