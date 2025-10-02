package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.datasource.cache.SimpleCache;

@UnstableApi
/* loaded from: classes2.dex */
public final class CachedRegionTracker implements Cache.Listener {

    public static class Region implements Comparable<Region> {
        @Override // java.lang.Comparable
        public final int compareTo(Region region) {
            throw null;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public final void a(SimpleCache simpleCache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public final synchronized void b(SimpleCache simpleCache, CacheSpan cacheSpan) {
        throw null;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public final synchronized void c(CacheSpan cacheSpan) {
        long j = cacheSpan.e;
        throw null;
    }
}
