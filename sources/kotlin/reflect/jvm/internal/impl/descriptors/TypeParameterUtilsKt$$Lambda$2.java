package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
class TypeParameterUtilsKt$$Lambda$2 implements Function1 {
    public static final TypeParameterUtilsKt$$Lambda$2 d = new TypeParameterUtilsKt$$Lambda$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeclarationDescriptor it = (DeclarationDescriptor) obj;
        Intrinsics.h(it, "it");
        List typeParameters = ((CallableDescriptor) it).getTypeParameters();
        Intrinsics.g(typeParameters, "getTypeParameters(...)");
        return CollectionsKt.n(typeParameters);
    }
}
