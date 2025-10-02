package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;

/* loaded from: classes7.dex */
public abstract class AbstractStubType extends SimpleType {

    public static final class Companion {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List H0() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes I0() {
        TypeAttributes.e.getClass();
        return TypeAttributes.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType O0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: Q0 */
    public final SimpleType N0(boolean z) {
        return !z ? this : T0(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return this;
    }

    public final NewTypeVariableConstructor S0() {
        throw null;
    }

    public abstract StubTypeForBuilderInference T0(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope s() {
        return null;
    }
}
