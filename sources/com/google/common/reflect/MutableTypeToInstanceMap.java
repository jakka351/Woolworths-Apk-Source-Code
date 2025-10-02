package com.google.common.reflect;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.ObjectArrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class MutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    public static final class UnmodifiableEntry<K, V> extends ForwardingMapEntry<K, V> {
        public final Map.Entry d;

        public UnmodifiableEntry(Map.Entry entry) {
            entry.getClass();
            this.d = entry;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingMapEntry
        /* renamed from: R1 */
        public final Map.Entry P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final /* bridge */ /* synthetic */ Object P1() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: R1 */
    public final Map P1() {
        return null;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Set entrySet() {
        final Set setEntrySet = super.entrySet();
        return new ForwardingSet<Map.Entry<Object, Object>>() { // from class: com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.1
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public final Object P1() {
                return setEntrySet;
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            /* renamed from: R1 */
            public final Collection P1() {
                return setEntrySet;
            }

            @Override // com.google.common.collect.ForwardingSet
            /* renamed from: b2 */
            public final Set P1() {
                return setEntrySet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return Iterators.m(super.iterator(), new a());
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public final Object[] toArray() {
                return U1();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public final Object[] toArray(Object[] objArr) {
                return ObjectArrays.c(this, objArr);
            }
        };
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }
}
