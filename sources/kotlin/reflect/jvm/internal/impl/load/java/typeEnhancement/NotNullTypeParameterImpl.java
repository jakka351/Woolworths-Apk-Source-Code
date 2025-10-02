package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes7.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {
    public final SimpleType e;

    public NotNullTypeParameterImpl(SimpleType delegate) {
        Intrinsics.h(delegate, "delegate");
        this.e = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean E0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(this.e.P0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: Q0 */
    public final SimpleType N0(boolean z) {
        return z ? this.e.N0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(this.e.P0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType S0() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType U0(SimpleType simpleType) {
        return new NotNullTypeParameterImpl(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final UnwrappedType o0(KotlinType replacement) {
        Intrinsics.h(replacement, "replacement");
        UnwrappedType unwrappedTypeM0 = replacement.M0();
        if (!TypeUtils.g(unwrappedTypeM0) && !TypeUtils.f(unwrappedTypeM0)) {
            return unwrappedTypeM0;
        }
        if (unwrappedTypeM0 instanceof SimpleType) {
            SimpleType simpleType = (SimpleType) unwrappedTypeM0;
            SimpleType simpleTypeN0 = simpleType.N0(false);
            return !TypeUtils.g(simpleType) ? simpleTypeN0 : new NotNullTypeParameterImpl(simpleTypeN0);
        }
        if (!(unwrappedTypeM0 instanceof FlexibleType)) {
            throw new NoWhenBranchMatchedException();
        }
        FlexibleType flexibleType = (FlexibleType) unwrappedTypeM0;
        SimpleType simpleType2 = flexibleType.e;
        SimpleType simpleTypeN02 = simpleType2.N0(false);
        if (TypeUtils.g(simpleType2)) {
            simpleTypeN02 = new NotNullTypeParameterImpl(simpleTypeN02);
        }
        SimpleType simpleType3 = flexibleType.f;
        SimpleType simpleTypeN03 = simpleType3.N0(false);
        if (TypeUtils.g(simpleType3)) {
            simpleTypeN03 = new NotNullTypeParameterImpl(simpleTypeN03);
        }
        return TypeWithEnhancementKt.d(KotlinTypeFactory.a(simpleTypeN02, simpleTypeN03), TypeWithEnhancementKt.a(unwrappedTypeM0));
    }
}
