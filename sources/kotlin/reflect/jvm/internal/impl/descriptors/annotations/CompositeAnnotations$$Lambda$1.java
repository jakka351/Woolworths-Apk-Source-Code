package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class CompositeAnnotations$$Lambda$1 implements Function1 {
    public static final CompositeAnnotations$$Lambda$1 d = new CompositeAnnotations$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Annotations it = (Annotations) obj;
        Intrinsics.h(it, "it");
        return CollectionsKt.n(it);
    }
}
