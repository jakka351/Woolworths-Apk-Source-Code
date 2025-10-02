package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class TypeParameterUtilsKt$$Lambda$1 implements Function1 {
    public static final TypeParameterUtilsKt$$Lambda$1 d = new TypeParameterUtilsKt$$Lambda$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeclarationDescriptor it = (DeclarationDescriptor) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(!(it instanceof ConstructorDescriptor));
    }
}
