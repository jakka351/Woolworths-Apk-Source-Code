package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {

    @Nullable
    ArrayMap<K, V>.EntrySet mEntrySet;

    @Nullable
    ArrayMap<K, V>.KeySet mKeySet;

    @Nullable
    ArrayMap<K, V>.ValueCollection mValues;

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ArrayMap.this.getSize();
        }
    }

    public final class KeyIterator extends IndexBasedArrayIterator<K> {
        public KeyIterator() {
            super(ArrayMap.this.getSize());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object a(int i) {
            return ArrayMap.this.keyAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void b(int i) {
            ArrayMap.this.removeAt(i);
        }
    }

    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int d;
        public int e = -1;
        public boolean f;

        public MapIterator() {
            this.d = ArrayMap.this.getSize() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.e;
            ArrayMap arrayMap = ArrayMap.this;
            return Intrinsics.c(key, arrayMap.keyAt(i)) && Intrinsics.c(entry.getValue(), arrayMap.valueAt(this.e));
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            if (this.f) {
                return ArrayMap.this.keyAt(this.e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            if (this.f) {
                return ArrayMap.this.valueAt(this.e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e < this.d;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.e;
            ArrayMap arrayMap = ArrayMap.this;
            K kKeyAt = arrayMap.keyAt(i);
            V vValueAt = arrayMap.valueAt(this.e);
            return (kKeyAt == null ? 0 : kKeyAt.hashCode()) ^ (vValueAt != null ? vValueAt.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.e++;
            this.f = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f) {
                throw new IllegalStateException();
            }
            ArrayMap.this.removeAt(this.e);
            this.e--;
            this.d--;
            this.f = false;
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (this.f) {
                return ArrayMap.this.setValueAt(this.e, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes2.dex */
    public final class ValueIterator extends IndexBasedArrayIterator<V> {
        public ValueIterator() {
            super(ArrayMap.this.getSize());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final Object a(int i) {
            return ArrayMap.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public final void b(int i) {
            ArrayMap.this.removeAt(i);
        }
    }

    public ArrayMap() {
        super(0);
    }

    public static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return super.containsKey(obj);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        ArrayMap<K, V>.EntrySet entrySet = this.mEntrySet;
        if (entrySet != null) {
            return entrySet;
        }
        ArrayMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.mEntrySet = entrySet2;
        return entrySet2;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V get(@Nullable Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        ArrayMap<K, V>.KeySet keySet = this.mKeySet;
        if (keySet != null) {
            return keySet;
        }
        ArrayMap<K, V>.KeySet keySet2 = new KeySet();
        this.mKeySet = keySet2;
        return keySet2;
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        ensureCapacity(map.size() + getSize());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V remove(@Nullable Object obj) {
        return (V) super.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        return size != getSize();
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        ArrayMap<K, V>.ValueCollection valueCollection = this.mValues;
        if (valueCollection != null) {
            return valueCollection;
        }
        ArrayMap<K, V>.ValueCollection valueCollection2 = new ValueCollection();
        this.mValues = valueCollection2;
        return valueCollection2;
    }

    public final class KeySet implements Set<K> {
        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection collection) {
            return ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return ArrayMap.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            ArrayMap arrayMap = ArrayMap.this;
            int iHashCode = 0;
            for (int size = arrayMap.getSize() - 1; size >= 0; size--) {
                K kKeyAt = arrayMap.keyAt(size);
                iHashCode += kKeyAt == null ? 0 : kKeyAt.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int iIndexOfKey = arrayMap.indexOfKey(obj);
            if (iIndexOfKey < 0) {
                return false;
            }
            arrayMap.removeAt(iIndexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection collection) {
            return ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection collection) {
            return ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return ArrayMap.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i = 0; i < size; i++) {
                objArr[i] = arrayMap.keyAt(i);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = arrayMap.keyAt(i);
            }
            return objArr;
        }
    }

    public final class ValueCollection implements Collection<V> {
        public ValueCollection() {
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return ArrayMap.this.__restricted$indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            ArrayMap arrayMap = ArrayMap.this;
            int i__restricted$indexOfValue = arrayMap.__restricted$indexOfValue(obj);
            if (i__restricted$indexOfValue < 0) {
                return false;
            }
            arrayMap.removeAt(i__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (collection.contains(arrayMap.valueAt(i))) {
                    arrayMap.removeAt(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (!collection.contains(arrayMap.valueAt(i))) {
                    arrayMap.removeAt(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return ArrayMap.this.getSize();
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i = 0; i < size; i++) {
                objArr[i] = arrayMap.valueAt(i);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            ArrayMap arrayMap = ArrayMap.this;
            int size = arrayMap.getSize();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = arrayMap.valueAt(i);
            }
            return objArr;
        }
    }
}
