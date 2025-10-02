package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import coil.util.Bitmaps;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/EmptyStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmptyStrongMemoryCache implements StrongMemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public final WeakMemoryCache f13000a;

    public EmptyStrongMemoryCache(WeakMemoryCache weakMemoryCache) {
        this.f13000a = weakMemoryCache;
    }

    @Override // coil.memory.StrongMemoryCache
    public final void a(int i) {
    }

    @Override // coil.memory.StrongMemoryCache
    public final MemoryCache.Value b(MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.StrongMemoryCache
    public final void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        this.f13000a.c(key, bitmap, map, Bitmaps.a(bitmap));
    }
}
