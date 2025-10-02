package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/memory/RealStrongMemoryCache;", "Lcoil3/memory/StrongMemoryCache;", "InternalValue", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealStrongMemoryCache implements StrongMemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public final RealWeakMemoryCache f13117a;
    public final RealStrongMemoryCache$cache$1 b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/memory/RealStrongMemoryCache$InternalValue;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InternalValue {

        /* renamed from: a, reason: collision with root package name */
        public final Image f13118a;
        public final Map b;
        public final long c;

        public InternalValue(Image image, Map map, long j) {
            this.f13118a = image;
            this.b = map;
            this.c = j;
        }
    }

    public RealStrongMemoryCache(long j, RealWeakMemoryCache realWeakMemoryCache) {
        this.f13117a = realWeakMemoryCache;
        this.b = new RealStrongMemoryCache$cache$1(j, this);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void a(long j) {
        this.b.e(j);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final MemoryCache.Value b(MemoryCache.Key key) {
        InternalValue internalValue = (InternalValue) this.b.b.get(key);
        if (internalValue != null) {
            return new MemoryCache.Value(internalValue.f13118a, internalValue.b);
        }
        return null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void c(MemoryCache.Key key, Image image, Map map, long j) {
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.b;
        long j2 = realStrongMemoryCache$cache$1.f13153a;
        LinkedHashMap linkedHashMap = realStrongMemoryCache$cache$1.b;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(key);
            if (objRemove != null) {
                realStrongMemoryCache$cache$1.c = realStrongMemoryCache$cache$1.b() - realStrongMemoryCache$cache$1.c(key, objRemove);
                realStrongMemoryCache$cache$1.a(key, objRemove, null);
            }
            this.f13117a.b(key, image, map, j);
            return;
        }
        InternalValue internalValue = new InternalValue(image, map, j);
        Object objPut = linkedHashMap.put(key, internalValue);
        realStrongMemoryCache$cache$1.c = realStrongMemoryCache$cache$1.c(key, internalValue) + realStrongMemoryCache$cache$1.b();
        if (objPut != null) {
            realStrongMemoryCache$cache$1.c = realStrongMemoryCache$cache$1.b() - realStrongMemoryCache$cache$1.c(key, objPut);
            realStrongMemoryCache$cache$1.a(key, objPut, internalValue);
        }
        realStrongMemoryCache$cache$1.e(realStrongMemoryCache$cache$1.f13153a);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final void clear() {
        this.b.e(-1L);
    }

    @Override // coil3.memory.StrongMemoryCache
    public final boolean d(MemoryCache.Key key) {
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = this.b;
        Object objRemove = realStrongMemoryCache$cache$1.b.remove(key);
        if (objRemove != null) {
            realStrongMemoryCache$cache$1.c = realStrongMemoryCache$cache$1.b() - realStrongMemoryCache$cache$1.c(key, objRemove);
            realStrongMemoryCache$cache$1.a(key, objRemove, null);
        }
        return objRemove != null;
    }

    @Override // coil3.memory.StrongMemoryCache
    public final long getSize() {
        return this.b.b();
    }
}
