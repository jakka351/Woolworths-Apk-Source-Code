package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/EmptyWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmptyWeakMemoryCache implements WeakMemoryCache {
    @Override // coil.memory.WeakMemoryCache
    public final void a(int i) {
    }

    @Override // coil.memory.WeakMemoryCache
    public final MemoryCache.Value b(MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.WeakMemoryCache
    public final void c(MemoryCache.Key key, Bitmap bitmap, Map map, int i) {
    }
}
