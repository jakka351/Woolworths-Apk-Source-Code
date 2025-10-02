package kotlin.reflect.jvm.internal;

import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClassifiers;

/* loaded from: classes.dex */
class CachesKt$$Lambda$2 implements Function1 {
    public static final CachesKt$$Lambda$2 d = new CachesKt$$Lambda$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class it = (Class) obj;
        CacheByClass cacheByClass = CachesKt.f24276a;
        Intrinsics.h(it, "it");
        KClassImpl kClassImplA = CachesKt.a(it);
        EmptyList emptyList = EmptyList.d;
        return KClassifiers.a(kClassImplA, emptyList, false, emptyList);
    }
}
