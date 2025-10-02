package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes7.dex */
class TypeUtilsKt$$Lambda$2 implements Function1 {
    public static final TypeUtilsKt$$Lambda$2 d = new TypeUtilsKt$$Lambda$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType it = (UnwrappedType) obj;
        Intrinsics.h(it, "it");
        ClassifierDescriptor classifierDescriptorC = it.J0().c();
        return Boolean.valueOf(classifierDescriptorC != null && (classifierDescriptorC instanceof TypeParameterDescriptor) && (((TypeParameterDescriptor) classifierDescriptorC).e() instanceof TypeAliasDescriptor));
    }
}
