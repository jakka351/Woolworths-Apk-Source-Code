package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class IndexedParametersSubstitution extends TypeSubstitution {
    public final TypeParameterDescriptor[] b;
    public final TypeProjection[] c;
    public final boolean d;

    public IndexedParametersSubstitution(TypeParameterDescriptor[] parameters, TypeProjection[] arguments, boolean z) {
        Intrinsics.h(parameters, "parameters");
        Intrinsics.h(arguments, "arguments");
        this.b = parameters;
        this.c = arguments;
        this.d = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean b() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection e(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorC instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorC : null;
        if (typeParameterDescriptor != null) {
            int index = typeParameterDescriptor.getIndex();
            TypeParameterDescriptor[] typeParameterDescriptorArr = this.b;
            if (index < typeParameterDescriptorArr.length && Intrinsics.c(typeParameterDescriptorArr[index].m(), typeParameterDescriptor.m())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean f() {
        return this.c.length == 0;
    }
}
