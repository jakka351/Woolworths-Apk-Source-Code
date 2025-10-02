package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes7.dex */
class JavaAnnotationTargetMapper$$Lambda$0 implements Function1 {
    public static final JavaAnnotationTargetMapper$$Lambda$0 d = new JavaAnnotationTargetMapper$$Lambda$0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType type;
        ModuleDescriptor module = (ModuleDescriptor) obj;
        Object obj2 = JavaAnnotationTargetMapper.f24417a;
        Intrinsics.h(module, "module");
        ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(JavaAnnotationMapper.b, module.p().j(StandardNames.FqNames.t));
        return (valueParameterDescriptorB == null || (type = valueParameterDescriptorB.getType()) == null) ? ErrorUtils.c(ErrorTypeKind.F, new String[0]) : type;
    }
}
