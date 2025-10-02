package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes4.dex */
class EngineKey implements Key {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13812a;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final Key g;
    public final Map h;
    public final Options i;
    public int j;

    public EngineKey(Object obj, Key key, int i, int i2, Map map, Class cls, Class cls2, Options options) {
        Preconditions.c(obj, "Argument must not be null");
        this.f13812a = obj;
        this.g = key;
        this.c = i;
        this.d = i2;
        Preconditions.c(map, "Argument must not be null");
        this.h = map;
        Preconditions.c(cls, "Resource class must not be null");
        this.e = cls;
        Preconditions.c(cls2, "Transcode class must not be null");
        this.f = cls2;
        Preconditions.c(options, "Argument must not be null");
        this.i = options;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof EngineKey) {
            EngineKey engineKey = (EngineKey) obj;
            if (this.f13812a.equals(engineKey.f13812a) && this.g.equals(engineKey.g) && this.d == engineKey.d && this.c == engineKey.c && this.h.equals(engineKey.h) && this.e.equals(engineKey.e) && this.f.equals(engineKey.f) && this.i.equals(engineKey.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.f13812a.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.f13783a.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f13812a + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
