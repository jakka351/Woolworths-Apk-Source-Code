package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcoil3/memory/StrongMemoryCache;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StrongMemoryCache {
    void a(long j);

    MemoryCache.Value b(MemoryCache.Key key);

    void c(MemoryCache.Key key, Image image, Map map, long j);

    void clear();

    boolean d(MemoryCache.Key key);

    long getSize();
}
