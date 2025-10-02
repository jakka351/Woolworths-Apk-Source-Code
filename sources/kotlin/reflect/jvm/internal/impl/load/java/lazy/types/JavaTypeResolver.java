package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JavaTypeResolver {

    /* renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f24440a;
    public final TypeParameterResolver b;
    public final RawProjectionComputer c;
    public final TypeParameterUpperBoundEraser d;

    public JavaTypeResolver(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver) {
        Intrinsics.h(typeParameterResolver, "typeParameterResolver");
        this.f24440a = lazyJavaResolverContext;
        this.b = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.c = rawProjectionComputer;
        this.d = new TypeParameterUpperBoundEraser(rawProjectionComputer);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType a(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r18, final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r19, kotlin.reflect.jvm.internal.impl.types.SimpleType r20) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.a(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.SimpleType):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    public final TypeConstructor b(JavaClassifierType javaClassifierType) {
        javaClassifierType.r();
        throw null;
    }

    public final UnwrappedType c(JavaArrayType arrayType, JavaTypeAttributes javaTypeAttributes, boolean z) {
        LazyJavaResolverContext lazyJavaResolverContext = this.f24440a;
        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f24425a;
        Intrinsics.h(arrayType, "arrayType");
        JavaType javaTypeA = arrayType.A();
        JavaPrimitiveType javaPrimitiveType = javaTypeA instanceof JavaPrimitiveType ? (JavaPrimitiveType) javaTypeA : null;
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(lazyJavaResolverContext, arrayType, true);
        if (type == null) {
            KotlinType kotlinTypeD = d(javaTypeA, JavaTypeAttributesKt.a(TypeUsage.e, javaTypeAttributes.g(), null, 6));
            if (javaTypeAttributes.g()) {
                return javaResolverComponents.o.p().i(z ? Variance.h : Variance.f, kotlinTypeD, lazyJavaAnnotations);
            }
            return KotlinTypeFactory.a(javaResolverComponents.o.p().i(Variance.f, kotlinTypeD, lazyJavaAnnotations), javaResolverComponents.o.p().i(Variance.h, kotlinTypeD, lazyJavaAnnotations).N0(true));
        }
        SimpleType simpleTypeR = javaResolverComponents.o.p().r(type);
        KotlinType kotlinTypeO = TypeUtilsKt.o(simpleTypeR, new CompositeAnnotations(simpleTypeR.getAnnotations(), lazyJavaAnnotations));
        Intrinsics.f(kotlinTypeO, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        SimpleType simpleType = (SimpleType) kotlinTypeO;
        return javaTypeAttributes.g() ? simpleType : KotlinTypeFactory.a(simpleType, simpleType.N0(true));
    }

    public final KotlinType d(JavaType javaType, JavaTypeAttributes javaTypeAttributes) {
        SimpleType simpleTypeA;
        JavaResolverComponents javaResolverComponents = this.f24440a.f24425a;
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            SimpleType simpleTypeT = type != null ? javaResolverComponents.o.p().t(type) : javaResolverComponents.o.p().x();
            Intrinsics.e(simpleTypeT);
            return simpleTypeT;
        }
        boolean z = false;
        if (!(javaType instanceof JavaClassifierType)) {
            if (javaType instanceof JavaArrayType) {
                return c((JavaArrayType) javaType, javaTypeAttributes, false);
            }
            if (javaType instanceof JavaWildcardType) {
                ReflectJavaType reflectJavaTypeW = ((JavaWildcardType) javaType).w();
                return reflectJavaTypeW != null ? d(reflectJavaTypeW, javaTypeAttributes) : javaResolverComponents.o.p().n();
            }
            if (javaType == null) {
                return javaResolverComponents.o.p().n();
            }
            throw new UnsupportedOperationException("Unsupported type: " + javaType);
        }
        JavaClassifierType javaClassifierType = (JavaClassifierType) javaType;
        if (!javaTypeAttributes.g() && javaTypeAttributes.b() != TypeUsage.d) {
            z = true;
        }
        boolean zX = javaClassifierType.x();
        if (!zX && !z) {
            SimpleType simpleTypeA2 = a(javaClassifierType, javaTypeAttributes, null);
            return simpleTypeA2 != null ? simpleTypeA2 : ErrorUtils.c(ErrorTypeKind.f, javaClassifierType.q());
        }
        SimpleType simpleTypeA3 = a(javaClassifierType, javaTypeAttributes.j(JavaTypeFlexibility.f), null);
        if (simpleTypeA3 != null && (simpleTypeA = a(javaClassifierType, javaTypeAttributes.j(JavaTypeFlexibility.e), simpleTypeA3)) != null) {
            return zX ? new RawTypeImpl(simpleTypeA3, simpleTypeA) : KotlinTypeFactory.a(simpleTypeA3, simpleTypeA);
        }
        return ErrorUtils.c(ErrorTypeKind.f, javaClassifierType.q());
    }
}
