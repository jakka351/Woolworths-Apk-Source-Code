package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
public final class ErrorType extends SimpleType {
    public final TypeConstructor e;
    public final ErrorScope f;
    public final ErrorTypeKind g;
    public final List h;
    public final boolean i;
    public final String[] j;
    public final String k;

    public ErrorType(TypeConstructor typeConstructor, ErrorScope errorScope, ErrorTypeKind kind, List arguments, boolean z, String... formatParams) {
        Intrinsics.h(kind, "kind");
        Intrinsics.h(arguments, "arguments");
        Intrinsics.h(formatParams, "formatParams");
        this.e = typeConstructor;
        this.f = errorScope;
        this.g = kind;
        this.h = arguments;
        this.i = z;
        this.j = formatParams;
        String str = kind.d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.k = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List H0() {
        return this.h;
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
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: L0 */
    public final KotlinType O0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: O0 */
    public final UnwrappedType L0(KotlinTypeRefiner kotlinTypeRefiner) {
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
        String[] strArr = this.j;
        return new ErrorType(this.e, this.f, this.g, this.h, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope s() {
        return this.f;
    }
}
