package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
    public transient AbstractMap d;
    public transient AbstractBiMap e;
    public transient Set f;
    public transient Set g;
    public transient Set h;

    public class BiMapEntry extends ForwardingMapEntry<K, V> {
        public final Map.Entry d;

        public BiMapEntry(Map.Entry entry) {
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public final Object setValue(Object obj) {
            AbstractBiMap abstractBiMap = AbstractBiMap.this;
            abstractBiMap.b2(obj);
            Preconditions.q("entry no longer in map", abstractBiMap.entrySet().contains(this));
            if (Objects.a(obj, getValue())) {
                return obj;
            }
            Preconditions.e("value already present: %s", obj, !abstractBiMap.containsValue(obj));
            Object value = this.d.setValue(obj);
            Preconditions.q("entry no longer in map", Objects.a(obj, abstractBiMap.get(getKey())));
            Object key = getKey();
            abstractBiMap.e.d.remove(value);
            abstractBiMap.e.d.put(obj, key);
            return value;
        }
    }

    public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
        public final Set d;

        public EntrySet() {
            this.d = AbstractBiMap.this.d.entrySet();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSet
        /* renamed from: b2 */
        public final Set P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            return this.d.contains(new Maps.AnonymousClass7((Map.Entry) obj));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            final AbstractBiMap abstractBiMap = AbstractBiMap.this;
            final Iterator<Map.Entry<K, V>> it = abstractBiMap.d.entrySet().iterator();
            return new Iterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.AbstractBiMap.1
                public Map.Entry d;

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Map.Entry<Object, Object> next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.d = entry;
                    return new BiMapEntry(entry);
                }

                @Override // java.util.Iterator
                public final void remove() {
                    Map.Entry entry = this.d;
                    if (entry == null) {
                        throw new IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    Object value = entry.getValue();
                    it.remove();
                    abstractBiMap.e.d.remove(value);
                    this.d = null;
                }
            };
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Set set = this.d;
            if (!set.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractBiMap.this.e.d.remove(entry.getValue());
            set.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.g(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            Iterator it = iterator();
            collection.getClass();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return U1();
        }
    }

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            java.util.Objects.requireNonNull(object);
            this.e = (AbstractBiMap) object;
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.e);
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.AbstractBiMap
        public final Object Y1(Object obj) {
            return this.e.b2(obj);
        }

        @Override // com.google.common.collect.AbstractBiMap
        public final Object b2(Object obj) {
            return this.e.Y1(obj);
        }

        @J2ktIncompatible
        @GwtIncompatible
        public Object readResolve() {
            return this.e.T0();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    public class KeySet extends ForwardingSet<K> {
        public KeySet() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: b2 */
        public final Set P1() {
            return AbstractBiMap.this.d.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Maps.AnonymousClass1(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap abstractBiMap = AbstractBiMap.this;
            abstractBiMap.e.d.remove(abstractBiMap.d.remove(obj));
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            return Sets.g(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            Iterator it = iterator();
            collection.getClass();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    public class ValueSet extends ForwardingSet<V> {
        public final Set d;

        public ValueSet() {
            this.d = AbstractBiMap.this.e.keySet();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingSet
        /* renamed from: b2 */
        public final Set P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Maps.AnonymousClass2(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return Y1();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return U1();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Object P1() {
        return this.d;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: R1 */
    public final Map P1() {
        return this.d;
    }

    @Override // com.google.common.collect.BiMap
    public BiMap T0() {
        return this.e;
    }

    public Object Y1(Object obj) {
        return obj;
    }

    public Object b2(Object obj) {
        return obj;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.d.clear();
        this.e.d.clear();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.e.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set entrySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.h = entrySet;
        return entrySet;
    }

    public final void f2(EnumMap enumMap, AbstractMap abstractMap) {
        Preconditions.r(this.d == null);
        Preconditions.r(this.e == null);
        Preconditions.g(enumMap.isEmpty());
        Preconditions.g(abstractMap.isEmpty());
        Preconditions.g(enumMap != abstractMap);
        this.d = enumMap;
        Inverse inverse = new Inverse();
        inverse.d = abstractMap;
        inverse.e = this;
        this.e = inverse;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set keySet() {
        Set set = this.f;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f = keySet;
        return keySet;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Y1(obj);
        b2(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && Objects.a(obj2, get(obj))) {
            return obj2;
        }
        Preconditions.e("value already present: %s", obj2, !containsValue(obj2));
        Object objPut = this.d.put(obj, obj2);
        if (zContainsKey) {
            this.e.d.remove(objPut);
        }
        this.e.d.put(obj2, obj);
        return objPut;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Object remove(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        Object objRemove = this.d.remove(obj);
        this.e.d.remove(objRemove);
        return objRemove;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public Set values() {
        Set set = this.g;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.g = valueSet;
        return valueSet;
    }
}
