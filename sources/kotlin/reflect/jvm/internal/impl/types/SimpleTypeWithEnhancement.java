package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes7.dex */
public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {
    public final SimpleType e;
    public final KotlinType f;

    public SimpleTypeWithEnhancement(SimpleType delegate, KotlinType enhancement) {
        Intrinsics.h(delegate, "delegate");
        Intrinsics.h(enhancement, "enhancement");
        this.e = delegate;
        this.f = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: Q0 */
    public final SimpleType N0(boolean z) {
        UnwrappedType unwrappedTypeD = TypeWithEnhancementKt.d(this.e.N0(z), this.f.M0().N0(z));
        Intrinsics.f(unwrappedTypeD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType) unwrappedTypeD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        UnwrappedType unwrappedTypeD = TypeWithEnhancementKt.d(this.e.P0(newAttributes), this.f);
        Intrinsics.f(unwrappedTypeD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType) unwrappedTypeD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType S0() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType U0(SimpleType simpleType) {
        return new SimpleTypeWithEnhancement(simpleType, this.f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final SimpleTypeWithEnhancement L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new SimpleTypeWithEnhancement((SimpleType) kotlinTypeRefiner.a(this.e), kotlinTypeRefiner.a(this.f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final UnwrappedType getOrigin() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final KotlinType n0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f + ")] " + this.e;
    }
}
