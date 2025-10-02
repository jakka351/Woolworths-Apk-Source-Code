package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes7.dex */
public final class AbbreviatedType extends DelegatingSimpleType {
    public final SimpleType e;
    public final SimpleType f;

    public AbbreviatedType(SimpleType delegate, SimpleType abbreviation) {
        Intrinsics.h(delegate, "delegate");
        Intrinsics.h(abbreviation, "abbreviation");
        this.e = delegate;
        this.f = abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return new AbbreviatedType(this.e.P0(newAttributes), this.f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType S0() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType U0(SimpleType simpleType) {
        return new AbbreviatedType(simpleType, this.f);
    }

    public final SimpleType V0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final AbbreviatedType N0(boolean z) {
        return new AbbreviatedType(this.e.N0(z), this.f.N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final AbbreviatedType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new AbbreviatedType((SimpleType) kotlinTypeRefiner.a(this.e), (SimpleType) kotlinTypeRefiner.a(this.f));
    }

    public final SimpleType Z() {
        return this.e;
    }
}
