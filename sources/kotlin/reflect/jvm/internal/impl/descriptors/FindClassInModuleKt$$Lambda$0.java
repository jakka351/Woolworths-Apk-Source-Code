package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes7.dex */
class FindClassInModuleKt$$Lambda$0 implements Function1 {
    public static final FindClassInModuleKt$$Lambda$0 d = new FindClassInModuleKt$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassId it = (ClassId) obj;
        Intrinsics.h(it, "it");
        return 0;
    }
}
