package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {
    public int d;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.d = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.d == 0) {
            this.d = super.hashCode();
        }
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = 0;
        return super.put(obj, obj2);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(SimpleArrayMap simpleArrayMap) {
        this.d = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object removeAt(int i) {
        this.d = 0;
        return super.removeAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap
    public final Object setValueAt(int i, Object obj) {
        this.d = 0;
        return super.setValueAt(i, obj);
    }
}
