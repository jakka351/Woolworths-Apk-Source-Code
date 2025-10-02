package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
final class TypeArgument {

    /* renamed from: a, reason: collision with root package name */
    public final TypeParameterDescriptor f24637a;
    public final KotlinType b;
    public final KotlinType c;

    public TypeArgument(TypeParameterDescriptor typeParameter, KotlinType inProjection, KotlinType outProjection) {
        Intrinsics.h(typeParameter, "typeParameter");
        Intrinsics.h(inProjection, "inProjection");
        Intrinsics.h(outProjection, "outProjection");
        this.f24637a = typeParameter;
        this.b = inProjection;
        this.c = outProjection;
    }
}
