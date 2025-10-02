package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;

/* loaded from: classes7.dex */
public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {
    public final SimpleType e;
    public final SimpleType f;

    public FlexibleType(SimpleType lowerBound, SimpleType upperBound) {
        Intrinsics.h(lowerBound, "lowerBound");
        Intrinsics.h(upperBound, "upperBound");
        this.e = lowerBound;
        this.f = upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List H0() {
        return Q0().H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes I0() {
        return Q0().I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor J0() {
        return Q0().J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean K0() {
        return Q0().K0();
    }

    public abstract SimpleType Q0();

    public final SimpleType R0() {
        return this.e;
    }

    public final SimpleType S0() {
        return this.f;
    }

    public abstract String T0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope s() {
        return Q0().s();
    }

    public String toString() {
        return DescriptorRenderer.c.Z(this);
    }
}
