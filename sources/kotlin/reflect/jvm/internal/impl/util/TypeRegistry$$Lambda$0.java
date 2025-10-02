package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class TypeRegistry$$Lambda$0 implements Function1 {
    public final TypeRegistry d;

    public TypeRegistry$$Lambda$0(TypeRegistry typeRegistry) {
        this.d = typeRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.h(it, "it");
        return Integer.valueOf(this.d.b.getAndIncrement());
    }
}
