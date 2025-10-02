package androidx.databinding;

import androidx.collection.ArrayMap;
import androidx.databinding.ObservableMap;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ObservableArrayMap<K, V> extends ArrayMap<K, V> implements ObservableMap<K, V> {
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        throw null;
    }

    @Override // androidx.databinding.ObservableMap
    public final void i0(ObservableMap.OnMapChangedCallback onMapChangedCallback) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        super.put(obj, obj2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.ArrayMap
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int iIndexOfKey = indexOfKey(it.next());
            if (iIndexOfKey >= 0) {
                removeAt(iIndexOfKey);
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object removeAt(int i) {
        keyAt(i);
        Object objRemoveAt = super.removeAt(i);
        if (objRemoveAt == null) {
            return objRemoveAt;
        }
        throw null;
    }

    @Override // androidx.collection.ArrayMap
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (!collection.contains(keyAt(size))) {
                removeAt(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap
    public final Object setValueAt(int i, Object obj) {
        keyAt(i);
        super.setValueAt(i, obj);
        throw null;
    }

    @Override // androidx.databinding.ObservableMap
    public final void x1(ObservableMap.OnMapChangedCallback onMapChangedCallback) {
        throw null;
    }
}
