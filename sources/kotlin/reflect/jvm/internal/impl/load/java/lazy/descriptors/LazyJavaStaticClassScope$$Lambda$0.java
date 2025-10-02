package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* loaded from: classes7.dex */
class LazyJavaStaticClassScope$$Lambda$0 implements Function1 {
    public static final LazyJavaStaticClassScope$$Lambda$0 d = new LazyJavaStaticClassScope$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JavaMember it = (JavaMember) obj;
        int i = LazyJavaStaticClassScope.p;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(it.f());
    }
}
