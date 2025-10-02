package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
final class DataCacheKey implements Key {

    /* renamed from: a, reason: collision with root package name */
    public final Key f13795a;
    public final Key c;

    public DataCacheKey(Key key, Key key2) {
        this.f13795a = key;
        this.c = key2;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof DataCacheKey) {
            DataCacheKey dataCacheKey = (DataCacheKey) obj;
            if (this.f13795a.equals(dataCacheKey.f13795a) && this.c.equals(dataCacheKey.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.c.hashCode() + (this.f13795a.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f13795a + ", signature=" + this.c + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f13795a.updateDiskCacheKey(messageDigest);
        this.c.updateDiskCacheKey(messageDigest);
    }
}
