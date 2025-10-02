package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class LRUMap<K, V> implements LookupCache<K, V>, Serializable {
    public final int d;
    public final int e;
    public final transient PrivateMaxEntriesMap f;

    public LRUMap(int i, int i2) {
        this.d = i;
        this.e = i2;
        PrivateMaxEntriesMap.Builder builder = new PrivateMaxEntriesMap.Builder();
        boolean z = i >= 0;
        int i3 = PrivateMaxEntriesMap.r;
        if (!z) {
            throw new IllegalArgumentException();
        }
        builder.b = i;
        long j = i2;
        if (!(j >= 0)) {
            throw new IllegalArgumentException();
        }
        builder.c = j;
        builder.f14342a = 4;
        if (!(j >= 0)) {
            throw new IllegalStateException();
        }
        this.f = new PrivateMaxEntriesMap(builder);
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public final Object a(Object obj, JavaType javaType) {
        return this.f.f(obj, javaType, true);
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public final Object get(Object obj) {
        return this.f.get(obj);
    }

    public Object readResolve() {
        return new LRUMap(this.d, this.e);
    }
}
