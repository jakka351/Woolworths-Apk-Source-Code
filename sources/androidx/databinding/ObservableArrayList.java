package androidx.databinding;

import androidx.databinding.ObservableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public class ObservableArrayList<T> extends ArrayList<T> implements ObservableList<T> {
    @Override // androidx.databinding.ObservableList
    public final void O0(ObservableList.OnListChangedCallback onListChangedCallback) {
        throw null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        super.add(obj);
        b(size() - 1, 1);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        int size = size();
        boolean zAddAll = super.addAll(collection);
        if (zAddAll) {
            b(size, size() - size);
        }
        return zAddAll;
    }

    public final void b(int i, int i2) {
        ListChangeRegistry.g(i, i2);
        throw null;
    }

    @Override // androidx.databinding.ObservableList
    public final void b1(ObservableList.OnListChangedCallback onListChangedCallback) {
        throw null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        super.clear();
        if (size == 0) {
            return;
        }
        ListChangeRegistry.g(0, size);
        throw null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        super.remove(i);
        ListChangeRegistry.g(i, 1);
        throw null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        ListChangeRegistry.g(i, i2 - i);
        throw null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        super.set(i, obj);
        ListChangeRegistry.g(i, 1);
        throw null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        super.add(i, obj);
        b(i, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        boolean zAddAll = super.addAll(i, collection);
        if (zAddAll) {
            b(i, collection.size());
        }
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
