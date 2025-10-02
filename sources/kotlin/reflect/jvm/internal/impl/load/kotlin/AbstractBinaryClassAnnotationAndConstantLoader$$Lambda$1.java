package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1 implements Function2 {
    public static final AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1 d = new AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AnnotationsContainerWithConstants loadConstantFromProperty = (AnnotationsContainerWithConstants) obj;
        MemberSignature it = (MemberSignature) obj2;
        Intrinsics.h(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.h(it, "it");
        return loadConstantFromProperty.c.get(it);
    }
}
