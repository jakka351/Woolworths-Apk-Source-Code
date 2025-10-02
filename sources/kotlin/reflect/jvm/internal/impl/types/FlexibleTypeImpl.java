package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeParameter {

    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.h(lowerBound, "lowerBound");
        Intrinsics.h(upperBound, "upperBound");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean E0() {
        SimpleType simpleType = this.e;
        return (simpleType.J0().c() instanceof TypeParameterDescriptor) && Intrinsics.c(simpleType.J0(), this.f.J0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(boolean z) {
        return KotlinTypeFactory.a(this.e.N0(z), this.f.N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return KotlinTypeFactory.a(this.e.P0(newAttributes), this.f.P0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final SimpleType Q0() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String T0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2) {
        boolean zQ = descriptorRendererImpl2.d.q();
        SimpleType simpleType = this.f;
        SimpleType simpleType2 = this.e;
        if (!zQ) {
            return descriptorRendererImpl.G(descriptorRendererImpl.Z(simpleType2), descriptorRendererImpl.Z(simpleType), TypeUtilsKt.h(this));
        }
        return "(" + descriptorRendererImpl.Z(simpleType2) + ".." + descriptorRendererImpl.Z(simpleType) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final FlexibleType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new FlexibleTypeImpl((SimpleType) kotlinTypeRefiner.a(this.e), (SimpleType) kotlinTypeRefiner.a(this.f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final UnwrappedType o0(KotlinType replacement) {
        UnwrappedType unwrappedTypeA;
        Intrinsics.h(replacement, "replacement");
        UnwrappedType unwrappedTypeM0 = replacement.M0();
        if (unwrappedTypeM0 instanceof FlexibleType) {
            unwrappedTypeA = unwrappedTypeM0;
        } else {
            if (!(unwrappedTypeM0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeM0;
            unwrappedTypeA = KotlinTypeFactory.a(simpleType, simpleType.N0(true));
        }
        return TypeWithEnhancementKt.b(unwrappedTypeA, unwrappedTypeM0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String toString() {
        return "(" + this.e + ".." + this.f + ')';
    }
}
