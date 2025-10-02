package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* loaded from: classes7.dex */
class LazyJavaClassMemberScope$$Lambda$5 implements Function1 {
    public static final LazyJavaClassMemberScope$$Lambda$5 d = new LazyJavaClassMemberScope$$Lambda$5();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JavaMember it = (JavaMember) obj;
        int i = LazyJavaClassMemberScope.v;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(!it.f());
    }
}
