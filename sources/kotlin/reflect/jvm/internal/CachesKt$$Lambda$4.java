package kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
class CachesKt$$Lambda$4 implements Function1 {
    public static final CachesKt$$Lambda$4 d = new CachesKt$$Lambda$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class it = (Class) obj;
        CacheByClass cacheByClass = CachesKt.f24276a;
        Intrinsics.h(it, "it");
        return new ConcurrentHashMap();
    }
}
