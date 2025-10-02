package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class IntersectionTypeConstructor$$Lambda$1 implements Function1 {
    public static final IntersectionTypeConstructor$$Lambda$1 d = new IntersectionTypeConstructor$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.h(it, "it");
        return it.toString();
    }
}
