package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public abstract class WrappedType extends KotlinType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List H0() {
        return N0().H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes I0() {
        return N0().I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor J0() {
        return N0().J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return N0().K0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType M0() {
        KotlinType kotlinTypeN0 = N0();
        while (kotlinTypeN0 instanceof WrappedType) {
            kotlinTypeN0 = ((WrappedType) kotlinTypeN0).N0();
        }
        Intrinsics.f(kotlinTypeN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (UnwrappedType) kotlinTypeN0;
    }

    public abstract KotlinType N0();

    public boolean O0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope s() {
        return N0().s();
    }

    public final String toString() {
        return O0() ? N0().toString() : "<Not computed yet>";
    }
}
