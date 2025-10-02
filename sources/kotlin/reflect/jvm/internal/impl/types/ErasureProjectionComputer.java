package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* loaded from: classes.dex */
public class ErasureProjectionComputer {
    public TypeProjection a(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType) {
        Intrinsics.h(typeAttr, "typeAttr");
        Intrinsics.h(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        return new TypeProjectionImpl(kotlinType, Variance.h);
    }
}
