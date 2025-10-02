package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap b() {
            return this.b == 0 ? RegularImmutableBiMap.l : new RegularImmutableBiMap(this.f14884a, this.b);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder c(Object obj, Object obj2) {
            super.c(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder d(Iterable iterable) {
            super.d(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public final ImmutableMap.Builder e(Map map) {
            d(((ImmutableMap) map).entrySet());
            return this;
        }
    }

    @J2ktIncompatible
    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public final ImmutableMap.Builder a(int i) {
            return new Builder(i);
        }
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: p */
    public final ImmutableCollection values() {
        return T0().keySet();
    }

    @Override // com.google.common.collect.BiMap
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableBiMap T0();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public final Collection values() {
        return T0().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public final Set values() {
        return T0().keySet();
    }
}
