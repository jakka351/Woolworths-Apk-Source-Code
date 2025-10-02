package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
public abstract class DelegatingSimpleType extends SimpleType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List H0() {
        return S0().H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes I0() {
        return S0().I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor J0() {
        return S0().J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean K0() {
        return S0().K0();
    }

    public abstract SimpleType S0();

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleType O0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return U0((SimpleType) kotlinTypeRefiner.a(S0()));
    }

    public abstract DelegatingSimpleType U0(SimpleType simpleType);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope s() {
        return S0().s();
    }
}
