package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
final class ResourceCacheKey implements Key {
    public static final LruCache j = new LruCache(50);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayPool f13815a;
    public final Key c;
    public final Key d;
    public final int e;
    public final int f;
    public final Class g;
    public final Options h;
    public final Transformation i;

    public ResourceCacheKey(ArrayPool arrayPool, Key key, Key key2, int i, int i2, Transformation transformation, Class cls, Options options) {
        this.f13815a = arrayPool;
        this.c = key;
        this.d = key2;
        this.e = i;
        this.f = i2;
        this.i = transformation;
        this.g = cls;
        this.h = options;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof ResourceCacheKey) {
            ResourceCacheKey resourceCacheKey = (ResourceCacheKey) obj;
            if (this.f == resourceCacheKey.f && this.e == resourceCacheKey.e && Util.b(this.i, resourceCacheKey.i) && this.g.equals(resourceCacheKey.g) && this.c.equals(resourceCacheKey.c) && this.d.equals(resourceCacheKey.d) && this.h.equals(resourceCacheKey.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        Transformation transformation = this.i;
        if (transformation != null) {
            iHashCode = (iHashCode * 31) + transformation.hashCode();
        }
        return this.h.f13783a.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        ArrayPool arrayPool = this.f13815a;
        byte[] bArr = (byte[]) arrayPool.d();
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.updateDiskCacheKey(messageDigest);
        this.c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        Transformation transformation = this.i;
        if (transformation != null) {
            transformation.updateDiskCacheKey(messageDigest);
        }
        this.h.updateDiskCacheKey(messageDigest);
        LruCache lruCache = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) lruCache.g(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(Key.b);
            lruCache.j(cls, bytes);
        }
        messageDigest.update(bytes);
        arrayPool.put(bArr);
    }
}
