package androidx.media3.datasource.cache;

import androidx.browser.trusted.a;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.TreeSet;

@UnstableApi
/* loaded from: classes2.dex */
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f2985a = new TreeSet(new a(4));
    public long b;

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public final void a(SimpleCache simpleCache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        c(cacheSpan);
        b(simpleCache, cacheSpan2);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public final void b(SimpleCache simpleCache, CacheSpan cacheSpan) {
        this.f2985a.add(cacheSpan);
        this.b += cacheSpan.f;
        TreeSet treeSet = this.f2985a;
        while (this.b > 10485760 && !treeSet.isEmpty()) {
            CacheSpan cacheSpan2 = (CacheSpan) treeSet.first();
            synchronized (simpleCache) {
                Assertions.f(!simpleCache.j);
                simpleCache.q(cacheSpan2);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public final void c(CacheSpan cacheSpan) {
        this.f2985a.remove(cacheSpan);
        this.b -= cacheSpan.f;
    }
}
