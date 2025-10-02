package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class ImmutableAsList<E> extends ImmutableList<E> {

    @J2ktIncompatible
    @GwtIncompatible
    public static class SerializedForm implements Serializable {
        public final ImmutableCollection d;

        public SerializedForm(ImmutableCollection immutableCollection) {
            this.d = immutableCollection;
        }

        public Object readResolve() {
            return this.d.b();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ImmutableCollection D();

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return D().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        ((RegularContiguousSet) D()).getClass();
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        ((RegularContiguousSet) D()).getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return D().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(D());
    }
}
