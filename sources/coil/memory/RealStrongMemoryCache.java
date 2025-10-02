package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import coil.memory.RealStrongMemoryCache;
import coil.util.Bitmaps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "InternalValue", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RealStrongMemoryCache implements StrongMemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public final WeakMemoryCache f13005a;
    public final RealStrongMemoryCache$cache$1 b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/RealStrongMemoryCache$InternalValue;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InternalValue {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f13006a;
        public final Map b;
        public final int c;

        public InternalValue(Bitmap bitmap, Map map, int i) {
            this.f13006a = bitmap;
            this.b = map;
            this.c = i;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [coil.memory.RealStrongMemoryCache$cache$1] */
    public RealStrongMemoryCache(final int i, WeakMemoryCache weakMemoryCache) {
        this.f13005a = weakMemoryCache;
        this.b = new LruCache<MemoryCache.Key, InternalValue>(i) { // from class: coil.memory.RealStrongMemoryCache$cache$1
            @Override // androidx.collection.LruCache
            public final void entryRemoved(boolean z, MemoryCache.Key key, RealStrongMemoryCache.InternalValue internalValue, RealStrongMemoryCache.InternalValue internalValue2) {
                RealStrongMemoryCache.InternalValue internalValue3 = internalValue;
                this.f13005a.c(key, internalValue3.f13006a, internalValue3.b, internalValue3.c);
            }

            @Override // androidx.collection.LruCache
            public final int sizeOf(MemoryCache.Key key, RealStrongMemoryCache.InternalValue internalValue) {
                return internalValue.c;
            }
        };
    }

    @Override // coil.memory.StrongMemoryCache
    public final void a(int i) {
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.b;
        if (i >= 40) {
            realStrongMemoryCache$cache$1.evictAll();
        } else {
            if (10 > i || i >= 20) {
                return;
            }
            realStrongMemoryCache$cache$1.trimToSize(realStrongMemoryCache$cache$1.size() / 2);
        }
    }

    @Override // coil.memory.StrongMemoryCache
    public final MemoryCache.Value b(MemoryCache.Key key) {
        InternalValue internalValue = get(key);
        if (internalValue != null) {
            return new MemoryCache.Value(internalValue.f13006a, internalValue.b);
        }
        return null;
    }

    @Override // coil.memory.StrongMemoryCache
    public final void c(MemoryCache.Key key, Bitmap bitmap, Map map) {
        int iA = Bitmaps.a(bitmap);
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.b;
        if (iA <= realStrongMemoryCache$cache$1.maxSize()) {
            realStrongMemoryCache$cache$1.put(key, new InternalValue(bitmap, map, iA));
        } else {
            realStrongMemoryCache$cache$1.remove(key);
            this.f13005a.c(key, bitmap, map, iA);
        }
    }
}
