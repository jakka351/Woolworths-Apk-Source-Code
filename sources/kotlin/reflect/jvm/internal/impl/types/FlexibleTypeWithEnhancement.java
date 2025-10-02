package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes7.dex */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {
    public final FlexibleType g;
    public final KotlinType h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeWithEnhancement(FlexibleType origin, KotlinType enhancement) {
        super(origin.e, origin.f);
        Intrinsics.h(origin, "origin");
        Intrinsics.h(enhancement, "enhancement");
        this.g = origin;
        this.h = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeRefiner.a(this.g), kotlinTypeRefiner.a(this.h));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(boolean z) {
        return TypeWithEnhancementKt.d(this.g.N0(z), this.h.M0().N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: O0 */
    public final UnwrappedType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeRefiner.a(this.g), kotlinTypeRefiner.a(this.h));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return TypeWithEnhancementKt.d(this.g.P0(newAttributes), this.h);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final SimpleType Q0() {
        return this.g.Q0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String T0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl2.d;
        return ((Boolean) descriptorRendererOptionsImpl.m.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.Y[11])).booleanValue() ? descriptorRendererImpl.Z(this.h) : this.g.T0(descriptorRendererImpl, descriptorRendererImpl2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final UnwrappedType getOrigin() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final KotlinType n0() {
        return this.h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.h + ")] " + this.g;
    }
}
