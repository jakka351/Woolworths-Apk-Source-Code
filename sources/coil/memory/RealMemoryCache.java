package coil.memory;

import coil.memory.MemoryCache;
import coil.util.Collections;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/RealMemoryCache;", "Lcoil/memory/MemoryCache;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealMemoryCache implements MemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public final StrongMemoryCache f13004a;
    public final WeakMemoryCache b;

    public RealMemoryCache(StrongMemoryCache strongMemoryCache, WeakMemoryCache weakMemoryCache) {
        this.f13004a = strongMemoryCache;
        this.b = weakMemoryCache;
    }

    @Override // coil.memory.MemoryCache
    public final void a(int i) {
        this.f13004a.a(i);
        this.b.a(i);
    }

    @Override // coil.memory.MemoryCache
    public final MemoryCache.Value b(MemoryCache.Key key) {
        MemoryCache.Value valueB = this.f13004a.b(key);
        return valueB == null ? this.b.b(key) : valueB;
    }

    @Override // coil.memory.MemoryCache
    public final void c(MemoryCache.Key key, MemoryCache.Value value) {
        this.f13004a.c(new MemoryCache.Key(key.d, Collections.b(key.e)), value.f13002a, Collections.b(value.b));
    }
}
