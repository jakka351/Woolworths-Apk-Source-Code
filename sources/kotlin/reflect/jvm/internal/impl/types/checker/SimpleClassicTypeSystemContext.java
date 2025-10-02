package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* loaded from: classes7.dex */
public final class SimpleClassicTypeSystemContext implements ClassicTypeSystemContext {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleClassicTypeSystemContext f24629a = new SimpleClassicTypeSystemContext();

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeConstructor A(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        SimpleType simpleTypeH = ClassicTypeSystemContext.DefaultImpls.h(kotlinTypeMarker);
        if (simpleTypeH == null) {
            simpleTypeH = M(kotlinTypeMarker);
        }
        return ClassicTypeSystemContext.DefaultImpls.X(simpleTypeH);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean B(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.B(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final ClassicTypeSystemContext$substitutionSupertypePolicy$2 C(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.V(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean D(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        SimpleType simpleTypeH = ClassicTypeSystemContext.DefaultImpls.h(kotlinTypeMarker);
        return (simpleTypeH != null ? ClassicTypeSystemContext.DefaultImpls.e(simpleTypeH) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean E(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.E(ClassicTypeSystemContext.DefaultImpls.X(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final FlexibleType F(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.g(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeConstructor G(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.X(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CaptureStatus H(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.k(capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeProjection I(CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.U(capturedTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final UnwrappedType J(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Q(capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean K(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.z(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean L(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.F(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType M(KotlinTypeMarker kotlinTypeMarker) {
        SimpleType simpleTypeP;
        Intrinsics.h(kotlinTypeMarker, "<this>");
        FlexibleType flexibleTypeG = ClassicTypeSystemContext.DefaultImpls.g(kotlinTypeMarker);
        if (flexibleTypeG != null && (simpleTypeP = ClassicTypeSystemContext.DefaultImpls.P(flexibleTypeG)) != null) {
            return simpleTypeP;
        }
        SimpleType simpleTypeH = ClassicTypeSystemContext.DefaultImpls.h(kotlinTypeMarker);
        Intrinsics.e(simpleTypeH);
        return simpleTypeH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeVariance N(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.t(typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final UnwrappedType O(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.q(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean P(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.K(capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType Q(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.h(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean R(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.w(typeParameterMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentListMarker S(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.c(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeParameterMarker T(TypeConstructorMarker typeConstructorMarker, int i) {
        return ClassicTypeSystemContext.DefaultImpls.o(typeConstructorMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean U(KotlinTypeMarker receiver) {
        Intrinsics.h(receiver, "$receiver");
        return receiver instanceof NotNullTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeVariance V(TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.u(typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int W(TypeArgumentListMarker typeArgumentListMarker) {
        Intrinsics.h(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof RigidTypeMarker) {
            return ClassicTypeSystemContext.DefaultImpls.b((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.f24268a.b(typeArgumentListMarker.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final List X(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.n(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType Y(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.a0(rigidTypeMarker, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeProjectionImpl Z(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.i(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int a(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.b(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final NewCapturedTypeConstructor a0(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Y(capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean b(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        return !Intrinsics.c(ClassicTypeSystemContext.DefaultImpls.X(M(kotlinTypeMarker)), ClassicTypeSystemContext.DefaultImpls.X(i(kotlinTypeMarker)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker b0(KotlinTypeMarker kotlinTypeMarker, int i) {
        return ClassicTypeSystemContext.DefaultImpls.m(kotlinTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean c(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.h(rigidTypeMarker, "<this>");
        return ClassicTypeSystemContext.DefaultImpls.e(rigidTypeMarker) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public final boolean c0(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.x(rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker d(RigidTypeMarker rigidTypeMarker, int i) {
        Intrinsics.h(rigidTypeMarker, "<this>");
        if (i < 0 || i >= ClassicTypeSystemContext.DefaultImpls.b(rigidTypeMarker)) {
            return null;
        }
        return ClassicTypeSystemContext.DefaultImpls.m(rigidTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public final SimpleType d0(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.P(flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker e(TypeArgumentListMarker typeArgumentListMarker, int i) {
        Intrinsics.h(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return ClassicTypeSystemContext.DefaultImpls.m((KotlinTypeMarker) typeArgumentListMarker, i);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i);
            Intrinsics.g(typeArgumentMarker, "get(...)");
            return typeArgumentMarker;
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.f24268a.b(typeArgumentListMarker.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int e0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.S(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public final UnwrappedType f(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.l(this, simpleTypeMarker, simpleTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final Collection f0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.W(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean g(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.M(typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean g0(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        return ClassicTypeSystemContext.DefaultImpls.G(M(kotlinTypeMarker)) != ClassicTypeSystemContext.DefaultImpls.G(i(kotlinTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean h(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.L(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final UnwrappedType h0(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.R(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType i(KotlinTypeMarker kotlinTypeMarker) {
        SimpleType simpleTypeZ;
        Intrinsics.h(kotlinTypeMarker, "<this>");
        FlexibleType flexibleTypeG = ClassicTypeSystemContext.DefaultImpls.g(kotlinTypeMarker);
        if (flexibleTypeG != null && (simpleTypeZ = ClassicTypeSystemContext.DefaultImpls.Z(flexibleTypeG)) != null) {
            return simpleTypeZ;
        }
        SimpleType simpleTypeH = ClassicTypeSystemContext.DefaultImpls.h(kotlinTypeMarker);
        Intrinsics.e(simpleTypeH);
        return simpleTypeH;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CapturedTypeMarker i0(SimpleType simpleType) {
        return ClassicTypeSystemContext.DefaultImpls.d(this, simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public final SimpleType j(KotlinType kotlinType) {
        return ClassicTypeSystemContext.DefaultImpls.h(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final void j0(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean k(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.C(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public final SimpleType k0(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.a0(rigidTypeMarker, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final UnwrappedType l(ArrayList arrayList) {
        return IntersectionTypeKt.a(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType l0(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Z(flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType m(RigidTypeMarker rigidTypeMarker) {
        CaptureStatus captureStatus = CaptureStatus.d;
        return ClassicTypeSystemContext.DefaultImpls.j(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final List m0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.p(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean n(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.N(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public final SimpleType n0(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Z(flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean o(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.O(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeParameterDescriptor o0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.r(typeVariableTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean p(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.y(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean p0(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.G(kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean q(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.E(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean q0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.A(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean r(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.h(rigidTypeMarker, "<this>");
        return ClassicTypeSystemContext.DefaultImpls.z(ClassicTypeSystemContext.DefaultImpls.X(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean r0(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.h(rigidTypeMarker, "<this>");
        SimpleType simpleTypeH = ClassicTypeSystemContext.DefaultImpls.h(rigidTypeMarker);
        return (simpleTypeH != null ? t(simpleTypeH) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean s(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.h(rigidTypeMarker, "<this>");
        return ClassicTypeSystemContext.DefaultImpls.H(A(rigidTypeMarker)) && !ClassicTypeSystemContext.DefaultImpls.I(rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean s0(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.a(typeConstructorMarker, typeConstructorMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CapturedTypeMarker t(RigidTypeMarker rigidTypeMarker) {
        SimpleTypeMarker simpleTypeMarker;
        Intrinsics.h(rigidTypeMarker, "<this>");
        Intrinsics.h(rigidTypeMarker, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeE = ClassicTypeSystemContext.DefaultImpls.e(rigidTypeMarker);
        if (definitelyNotNullTypeE == null || (simpleTypeMarker = definitelyNotNullTypeE.e) == null) {
            simpleTypeMarker = (SimpleTypeMarker) rigidTypeMarker;
        }
        return ClassicTypeSystemContext.DefaultImpls.d(this, simpleTypeMarker);
    }

    public final KotlinTypeMarker t0(KotlinTypeMarker kotlinTypeMarker) {
        SimpleType simpleTypeA0;
        Intrinsics.h(kotlinTypeMarker, "<this>");
        SimpleType simpleTypeH = ClassicTypeSystemContext.DefaultImpls.h(kotlinTypeMarker);
        return (simpleTypeH == null || (simpleTypeA0 = ClassicTypeSystemContext.DefaultImpls.a0(simpleTypeH, true)) == null) ? kotlinTypeMarker : simpleTypeA0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker u(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.b0(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean v(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.H(typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final Collection w(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.T(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean x(CapturedTypeMarker capturedTypeMarker) {
        return capturedTypeMarker instanceof CapturedType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleType y(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.P(flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean z(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.h(kotlinTypeMarker, "<this>");
        FlexibleType flexibleTypeG = ClassicTypeSystemContext.DefaultImpls.g(kotlinTypeMarker);
        return (flexibleTypeG != null ? ClassicTypeSystemContext.DefaultImpls.f(flexibleTypeG) : null) != null;
    }
}
