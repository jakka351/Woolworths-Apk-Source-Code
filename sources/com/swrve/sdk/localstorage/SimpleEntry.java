package com.swrve.sdk.localstorage;

import java.util.Map;

/* loaded from: classes6.dex */
public class SimpleEntry<K, V> implements Map.Entry<K, V> {
    public Object d;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.d = obj;
        return obj;
    }
}
