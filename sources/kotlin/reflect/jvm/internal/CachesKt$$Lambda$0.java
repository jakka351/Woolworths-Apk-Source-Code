package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
class CachesKt$$Lambda$0 implements Function1 {
    public static final CachesKt$$Lambda$0 d = new CachesKt$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class it = (Class) obj;
        CacheByClass cacheByClass = CachesKt.f24276a;
        Intrinsics.h(it, "it");
        return new KClassImpl(it);
    }
}
