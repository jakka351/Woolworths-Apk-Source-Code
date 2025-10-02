package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/memory/EmptyStrongMemoryCache;", "Lcoil3/memory/StrongMemoryCache;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmptyStrongMemoryCache implements StrongMemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public final RealWeakMemoryCache f13111a;

    public EmptyStrongMemoryCache(RealWeakMemoryCache realWeakMemoryCache) {
        this.f13111a = realWeakMemoryCache;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void a(long j) {
    }

    @Override // coil3.memory.StrongMemoryCache
    public final MemoryCache.Value b(MemoryCache.Key key) {
        return null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void c(MemoryCache.Key key, Image image, Map map, long j) {
        this.f13111a.b(key, image, map, j);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void clear() {
    }

    @Override // coil3.memory.StrongMemoryCache
    public final boolean d(MemoryCache.Key key) {
        return false;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getSize() {
        return 0L;
    }
}
