package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* loaded from: classes7.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {
    public final TypeProjection e;
    public final CapturedTypeConstructorImpl f;
    public final boolean g;
    public final TypeAttributes h;

    public CapturedType(TypeProjection typeProjection, CapturedTypeConstructorImpl capturedTypeConstructorImpl, boolean z, TypeAttributes attributes) {
        Intrinsics.h(typeProjection, "typeProjection");
        Intrinsics.h(attributes, "attributes");
        this.e = typeProjection;
        this.f = capturedTypeConstructorImpl;
        this.g = z;
        this.h = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List H0() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes I0() {
        return this.h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor J0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final KotlinType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new CapturedType(this.e.c(kotlinTypeRefiner), this.f, this.g, this.h);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(boolean z) {
        if (z == this.g) {
            return this;
        }
        return new CapturedType(this.e, this.f, z, this.h);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: O0 */
    public final UnwrappedType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new CapturedType(this.e.c(kotlinTypeRefiner), this.f, this.g, this.h);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: Q0 */
    public final SimpleType N0(boolean z) {
        if (z == this.g) {
            return this;
        }
        return new CapturedType(this.e, this.f, z, this.h);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return new CapturedType(this.e, this.f, this.g, newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope s() {
        return ErrorUtils.a(ErrorScopeKind.e, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.e);
        sb.append(')');
        sb.append(this.g ? "?" : "");
        return sb.toString();
    }
}
