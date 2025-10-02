package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ReadOnlyClassToSerializerMap {

    /* renamed from: a, reason: collision with root package name */
    public final Bucket[] f14315a;
    public final int b;

    public static final class Bucket {

        /* renamed from: a, reason: collision with root package name */
        public final JsonSerializer f14316a;
        public final Bucket b;
        public final Class c;
        public final JavaType d;
        public final boolean e;

        public Bucket(Bucket bucket, TypeKey typeKey, JsonSerializer jsonSerializer) {
            this.b = bucket;
            this.f14316a = jsonSerializer;
            this.e = typeKey.d;
            this.c = typeKey.b;
            this.d = typeKey.c;
        }
    }

    public ReadOnlyClassToSerializerMap(LRUMap lRUMap) {
        int size = lRUMap.f.d.size();
        int i = 8;
        while (i < (size <= 64 ? size + size : size + (size >> 2))) {
            i += i;
        }
        this.b = i - 1;
        Bucket[] bucketArr = new Bucket[i];
        for (Map.Entry entry : lRUMap.f.entrySet()) {
            TypeKey typeKey = (TypeKey) entry.getKey();
            JsonSerializer jsonSerializer = (JsonSerializer) entry.getValue();
            int i2 = typeKey.f14341a & this.b;
            bucketArr[i2] = new Bucket(bucketArr[i2], typeKey, jsonSerializer);
        }
        this.f14315a = bucketArr;
    }

    public final JsonSerializer a(Class cls) {
        Bucket bucket = this.f14315a[(cls.getName().hashCode() + 1) & this.b];
        if (bucket == null) {
            return null;
        }
        if (bucket.c == cls && bucket.e) {
            return bucket.f14316a;
        }
        while (true) {
            bucket = bucket.b;
            if (bucket == null) {
                return null;
            }
            if (bucket.c == cls && bucket.e) {
                return bucket.f14316a;
            }
        }
    }

    public final JsonSerializer b(JavaType javaType) {
        Bucket bucket = this.f14315a[(javaType.e - 1) & this.b];
        if (bucket == null) {
            return null;
        }
        if (!bucket.e && javaType.equals(bucket.d)) {
            return bucket.f14316a;
        }
        while (true) {
            bucket = bucket.b;
            if (bucket == null) {
                return null;
            }
            if (!bucket.e && javaType.equals(bucket.d)) {
                return bucket.f14316a;
            }
        }
    }

    public final JsonSerializer c(Class cls) {
        Bucket bucket = this.f14315a[cls.getName().hashCode() & this.b];
        if (bucket == null) {
            return null;
        }
        if (bucket.c == cls && !bucket.e) {
            return bucket.f14316a;
        }
        while (true) {
            bucket = bucket.b;
            if (bucket == null) {
                return null;
            }
            if (bucket.c == cls && !bucket.e) {
                return bucket.f14316a;
            }
        }
    }
}
