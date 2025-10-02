package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* loaded from: classes.dex */
public class DiskLruCacheFactory implements DiskCache.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final long f13831a;
    public final CacheDirectoryGetter b;

    /* renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements CacheDirectoryGetter {
        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public final File a() {
            return new File((String) null);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 implements CacheDirectoryGetter {
        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public final File a() {
            return new File((String) null, (String) null);
        }
    }

    public interface CacheDirectoryGetter {
        File a();
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter, long j) {
        this.f13831a = j;
        this.b = cacheDirectoryGetter;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
    public final DiskCache build() {
        File fileA = this.b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return DiskLruCacheWrapper.c(fileA, this.f13831a);
        }
        return null;
    }
}
