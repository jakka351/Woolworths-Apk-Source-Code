package com.scandit.datacapture.core;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1162x1 extends ConcurrentHashMap {
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1162x1) && hashCode() == ((C1162x1) obj).hashCode();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Set<Map.Entry> entries = entrySet();
        Intrinsics.g(entries, "entries");
        int iHashCode = 0;
        for (Map.Entry entry : entries) {
            Intrinsics.g(entry, "(key, value)");
            Object key = entry.getKey();
            Object value = entry.getValue();
            iHashCode = (((iHashCode * 31) + (key != null ? key.hashCode() : 0)) * 31) + (value instanceof Object[] ? Arrays.deepHashCode((Object[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value != null ? value.hashCode() : 0);
        }
        return iHashCode;
    }
}
