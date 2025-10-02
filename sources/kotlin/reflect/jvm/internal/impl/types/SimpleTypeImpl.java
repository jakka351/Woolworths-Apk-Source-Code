package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;

/* loaded from: classes.dex */
final class SimpleTypeImpl extends SimpleType {
    public final TypeConstructor e;
    public final List f;
    public final boolean g;
    public final MemberScope h;
    public final Function1 i;

    public SimpleTypeImpl(TypeConstructor constructor, List arguments, boolean z, MemberScope memberScope, Function1 function1) {
        Intrinsics.h(constructor, "constructor");
        Intrinsics.h(arguments, "arguments");
        Intrinsics.h(memberScope, "memberScope");
        this.e = constructor;
        this.f = arguments;
        this.g = z;
        this.h = memberScope;
        this.i = function1;
        if (!(memberScope instanceof ErrorScope) || (memberScope instanceof ThrowingScope)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List H0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes I0() {
        TypeAttributes.e.getClass();
        return TypeAttributes.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor J0() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType simpleType = (SimpleType) this.i.invoke(kotlinTypeRefiner);
        return simpleType == null ? this : simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: O0 */
    public final UnwrappedType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType simpleType = (SimpleType) this.i.invoke(kotlinTypeRefiner);
        return simpleType == null ? this : simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: Q0 */
    public final SimpleType N0(boolean z) {
        return z == this.g ? this : z ? new NullableSimpleType(this) : new NotNullSimpleType(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new SimpleTypeWithAttributes(this, newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope s() {
        return this.h;
    }
}
