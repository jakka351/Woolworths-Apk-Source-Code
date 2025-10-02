package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes7.dex */
public final class DynamicType extends FlexibleType implements DynamicTypeMarker {
    public final TypeAttributes g;

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicType(KotlinBuiltIns kotlinBuiltIns, TypeAttributes attributes) {
        Intrinsics.h(attributes, "attributes");
        SimpleType simpleTypeO = kotlinBuiltIns.o();
        Intrinsics.g(simpleTypeO, "getNothingType(...)");
        SimpleType simpleTypeP = kotlinBuiltIns.p();
        Intrinsics.g(simpleTypeP, "getNullableAnyType(...)");
        super(simpleTypeO, simpleTypeP);
        this.g = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes I0() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: L0 */
    public final KotlinType O0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(boolean z) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType O0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return new DynamicType(TypeUtilsKt.h(this.f), newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final SimpleType Q0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String T0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2) {
        return "dynamic";
    }
}
