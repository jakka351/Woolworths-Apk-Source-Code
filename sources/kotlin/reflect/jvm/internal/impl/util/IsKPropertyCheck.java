package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes7.dex */
final class IsKPropertyCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    public static final IsKPropertyCheck f24641a = new IsKPropertyCheck();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
        SimpleType simpleTypeC;
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) javaMethodDescriptor.h().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.d;
        Intrinsics.e(valueParameterDescriptor);
        ModuleDescriptor moduleDescriptorJ = DescriptorUtilsKt.j(valueParameterDescriptor);
        companion.getClass();
        ClassDescriptor classDescriptorA = FindClassInModuleKt.a(moduleDescriptorJ, StandardNames.FqNames.R);
        if (classDescriptorA == null) {
            simpleTypeC = null;
        } else {
            TypeAttributes.e.getClass();
            TypeAttributes typeAttributes = TypeAttributes.f;
            List parameters = classDescriptorA.m().getParameters();
            Intrinsics.g(parameters, "getParameters(...)");
            Object objN0 = CollectionsKt.n0(parameters);
            Intrinsics.g(objN0, "single(...)");
            simpleTypeC = KotlinTypeFactory.c(typeAttributes, classDescriptorA, CollectionsKt.Q(new StarProjectionImpl((TypeParameterDescriptor) objN0)));
        }
        if (simpleTypeC == null) {
            return false;
        }
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.g(type, "getType(...)");
        return TypeUtilsKt.l(simpleTypeC, TypeUtils.h(type, false));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
