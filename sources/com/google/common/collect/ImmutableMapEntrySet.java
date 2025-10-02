package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @GwtIncompatible
    @J2ktIncompatible
    public static class EntrySetSerializedForm<K, V> implements Serializable {
        public final ImmutableMap d;

        public EntrySetSerializedForm(ImmutableMap immutableMap) {
            this.d = immutableMap;
        }

        public Object readResolve() {
            return this.d.entrySet();
        }
    }

    public static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {
        @Override // com.google.common.collect.ImmutableCollection
        public final int d(int i, Object[] objArr) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: k */
        public final UnmodifiableIterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList t() {
            return null;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        public final ImmutableMap z() {
            return null;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = z().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return z().hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return z().i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return z().size();
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean u() {
        return z().h();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new EntrySetSerializedForm(z());
    }

    public abstract ImmutableMap z();
}
