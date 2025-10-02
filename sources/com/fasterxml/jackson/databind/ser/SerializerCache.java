package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class SerializerCache {

    /* renamed from: a, reason: collision with root package name */
    public final LRUMap f14306a = new LRUMap(Math.min(64, 1000), 4000);
    public final AtomicReference b = new AtomicReference();

    public final JsonSerializer a(JavaType javaType) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            LRUMap lRUMap = this.f14306a;
            jsonSerializer = (JsonSerializer) lRUMap.f.get(new TypeKey(javaType, false));
        }
        return jsonSerializer;
    }

    public final JsonSerializer b(Class cls) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            LRUMap lRUMap = this.f14306a;
            jsonSerializer = (JsonSerializer) lRUMap.f.get(new TypeKey(cls, false));
        }
        return jsonSerializer;
    }
}
