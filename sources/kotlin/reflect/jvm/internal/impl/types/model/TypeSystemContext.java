package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* loaded from: classes7.dex */
public interface TypeSystemContext extends TypeSystemOptimizationContext {
    TypeConstructor A(KotlinTypeMarker kotlinTypeMarker);

    boolean B(TypeConstructorMarker typeConstructorMarker);

    ClassicTypeSystemContext$substitutionSupertypePolicy$2 C(RigidTypeMarker rigidTypeMarker);

    boolean D(KotlinTypeMarker kotlinTypeMarker);

    boolean E(RigidTypeMarker rigidTypeMarker);

    FlexibleType F(KotlinTypeMarker kotlinTypeMarker);

    TypeConstructor G(RigidTypeMarker rigidTypeMarker);

    CaptureStatus H(CapturedTypeMarker capturedTypeMarker);

    TypeProjection I(CapturedTypeConstructorMarker capturedTypeConstructorMarker);

    UnwrappedType J(CapturedTypeMarker capturedTypeMarker);

    boolean K(TypeConstructorMarker typeConstructorMarker);

    boolean L(TypeConstructorMarker typeConstructorMarker);

    SimpleType M(KotlinTypeMarker kotlinTypeMarker);

    TypeVariance N(TypeArgumentMarker typeArgumentMarker);

    UnwrappedType O(TypeArgumentMarker typeArgumentMarker);

    boolean P(CapturedTypeMarker capturedTypeMarker);

    SimpleType Q(KotlinTypeMarker kotlinTypeMarker);

    boolean R(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker);

    TypeArgumentListMarker S(RigidTypeMarker rigidTypeMarker);

    TypeParameterMarker T(TypeConstructorMarker typeConstructorMarker, int i);

    boolean U(KotlinTypeMarker kotlinTypeMarker);

    TypeVariance V(TypeParameterMarker typeParameterMarker);

    int W(TypeArgumentListMarker typeArgumentListMarker);

    List X(KotlinTypeMarker kotlinTypeMarker);

    SimpleType Y(RigidTypeMarker rigidTypeMarker);

    TypeProjectionImpl Z(KotlinTypeMarker kotlinTypeMarker);

    int a(KotlinTypeMarker kotlinTypeMarker);

    NewCapturedTypeConstructor a0(CapturedTypeMarker capturedTypeMarker);

    boolean b(KotlinTypeMarker kotlinTypeMarker);

    TypeArgumentMarker b0(KotlinTypeMarker kotlinTypeMarker, int i);

    boolean c(RigidTypeMarker rigidTypeMarker);

    TypeArgumentMarker d(RigidTypeMarker rigidTypeMarker, int i);

    TypeArgumentMarker e(TypeArgumentListMarker typeArgumentListMarker, int i);

    int e0(TypeConstructorMarker typeConstructorMarker);

    Collection f0(TypeConstructorMarker typeConstructorMarker);

    boolean g(TypeArgumentMarker typeArgumentMarker);

    boolean g0(KotlinTypeMarker kotlinTypeMarker);

    boolean h(KotlinTypeMarker kotlinTypeMarker);

    UnwrappedType h0(KotlinTypeMarker kotlinTypeMarker);

    SimpleType i(KotlinTypeMarker kotlinTypeMarker);

    CapturedTypeMarker i0(SimpleType simpleType);

    void j0(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker);

    boolean k(KotlinTypeMarker kotlinTypeMarker);

    UnwrappedType l(ArrayList arrayList);

    SimpleType l0(FlexibleTypeMarker flexibleTypeMarker);

    SimpleType m(RigidTypeMarker rigidTypeMarker);

    List m0(TypeConstructorMarker typeConstructorMarker);

    boolean n(RigidTypeMarker rigidTypeMarker);

    boolean o(RigidTypeMarker rigidTypeMarker);

    TypeParameterDescriptor o0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker);

    boolean p(TypeConstructorMarker typeConstructorMarker);

    boolean p0(KotlinTypeMarker kotlinTypeMarker);

    boolean q(TypeConstructorMarker typeConstructorMarker);

    boolean q0(TypeConstructorMarker typeConstructorMarker);

    boolean r(RigidTypeMarker rigidTypeMarker);

    boolean r0(RigidTypeMarker rigidTypeMarker);

    boolean s(RigidTypeMarker rigidTypeMarker);

    boolean s0(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2);

    CapturedTypeMarker t(RigidTypeMarker rigidTypeMarker);

    KotlinTypeMarker u(KotlinTypeMarker kotlinTypeMarker);

    boolean v(TypeConstructorMarker typeConstructorMarker);

    Collection w(RigidTypeMarker rigidTypeMarker);

    boolean x(CapturedTypeMarker capturedTypeMarker);

    SimpleType y(FlexibleTypeMarker flexibleTypeMarker);

    boolean z(KotlinTypeMarker kotlinTypeMarker);
}
