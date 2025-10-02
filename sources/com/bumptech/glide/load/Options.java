package com.bumptech.glide.load;

import com.bumptech.glide.load.Option;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class Options implements Key {

    /* renamed from: a, reason: collision with root package name */
    public final CachedHashCodeArrayMap f13783a = new CachedHashCodeArrayMap(0);

    public final Object b(Option option) {
        CachedHashCodeArrayMap cachedHashCodeArrayMap = this.f13783a;
        return cachedHashCodeArrayMap.containsKey(option) ? cachedHashCodeArrayMap.get(option) : option.f13782a;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.f13783a.equals(((Options) obj).f13783a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f13783a.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f13783a + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.f13783a.getSize(); i++) {
            Option option = (Option) this.f13783a.keyAt(i);
            Object objValueAt = this.f13783a.valueAt(i);
            Option.CacheKeyUpdater cacheKeyUpdater = option.b;
            if (option.d == null) {
                option.d = option.c.getBytes(Key.b);
            }
            cacheKeyUpdater.a(option.d, objValueAt, messageDigest);
        }
    }
}
