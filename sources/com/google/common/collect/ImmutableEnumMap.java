package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

    @J2ktIncompatible
    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
        public Object readResolve() {
            throw null;
        }
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final boolean containsKey(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final UnmodifiableIterator j() {
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
    public Object writeReplace() {
        throw null;
    }
}
