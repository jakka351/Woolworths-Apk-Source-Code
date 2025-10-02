package coil3.memory;

import coil3.Image;
import coil3.memory.MemoryCache;
import coil3.memory.RealWeakMemoryCache;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/memory/RealMemoryCache;", "Lcoil3/memory/MemoryCache;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealMemoryCache implements MemoryCache {

    /* renamed from: a, reason: collision with root package name */
    public final StrongMemoryCache f13116a;
    public final RealWeakMemoryCache b;
    public final Object c = new Object();

    public RealMemoryCache(StrongMemoryCache strongMemoryCache, RealWeakMemoryCache realWeakMemoryCache) {
        this.f13116a = strongMemoryCache;
        this.b = realWeakMemoryCache;
    }

    @Override // coil3.memory.MemoryCache
    public final void a(long j) {
        synchronized (this.c) {
            this.f13116a.a(j);
        }
    }

    @Override // coil3.memory.MemoryCache
    public final MemoryCache.Value b(MemoryCache.Key key) {
        MemoryCache.Value valueB;
        synchronized (this.c) {
            try {
                valueB = this.f13116a.b(key);
                if (valueB == null) {
                    RealWeakMemoryCache realWeakMemoryCache = this.b;
                    ArrayList arrayList = (ArrayList) realWeakMemoryCache.f13119a.get(key);
                    MemoryCache.Value value = null;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            RealWeakMemoryCache.InternalValue internalValue = (RealWeakMemoryCache.InternalValue) arrayList.get(i);
                            Image image = (Image) internalValue.f13120a.get();
                            MemoryCache.Value value2 = image != null ? new MemoryCache.Value(image, internalValue.b) : null;
                            if (value2 != null) {
                                value = value2;
                                break;
                            }
                            i++;
                        }
                        realWeakMemoryCache.a();
                    }
                    valueB = value;
                }
                if (valueB != null && !valueB.f13114a.a()) {
                    synchronized (this.c) {
                        this.f13116a.d(key);
                        if (this.b.f13119a.remove(key) != null) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return valueB;
    }

    @Override // coil3.memory.MemoryCache
    public final void c(MemoryCache.Key key, MemoryCache.Value value) {
        synchronized (this.c) {
            long size = value.f13114a.getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.f13116a.c(key, value.f13114a, value.b, size);
        }
    }

    @Override // coil3.memory.MemoryCache
    public final void clear() {
        synchronized (this.c) {
            this.f13116a.clear();
            RealWeakMemoryCache realWeakMemoryCache = this.b;
            realWeakMemoryCache.b = 0;
            realWeakMemoryCache.f13119a.clear();
        }
    }

    @Override // coil3.memory.MemoryCache
    public final long getSize() {
        long size;
        synchronized (this.c) {
            size = this.f13116a.getSize();
        }
        return size;
    }
}
