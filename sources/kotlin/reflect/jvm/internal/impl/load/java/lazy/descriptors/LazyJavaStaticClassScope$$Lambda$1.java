package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes7.dex */
class LazyJavaStaticClassScope$$Lambda$1 implements Function1 {
    public static final LazyJavaStaticClassScope$$Lambda$1 d = new LazyJavaStaticClassScope$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MemberScope it = (MemberScope) obj;
        int i = LazyJavaStaticClassScope.p;
        Intrinsics.h(it, "it");
        return it.c();
    }
}
