package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes7.dex */
public final class CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2 extends DelegatedTypeSubstitution {
    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection e(KotlinType kotlinType) {
        TypeProjection typeProjectionE = this.b.e(kotlinType);
        if (typeProjectionE == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        return CapturedTypeConstructorKt.a(typeProjectionE, classifierDescriptorC instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorC : null);
    }
}
