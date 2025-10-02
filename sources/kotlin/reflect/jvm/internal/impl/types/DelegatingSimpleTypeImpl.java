package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {
    public final SimpleType e;

    public DelegatingSimpleTypeImpl(SimpleType simpleType) {
        this.e = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: Q0 */
    public final SimpleType N0(boolean z) {
        return z == K0() ? this : this.e.N0(z).P0(I0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return newAttributes != I0() ? new SimpleTypeWithAttributes(this, newAttributes) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType S0() {
        return this.e;
    }
}
