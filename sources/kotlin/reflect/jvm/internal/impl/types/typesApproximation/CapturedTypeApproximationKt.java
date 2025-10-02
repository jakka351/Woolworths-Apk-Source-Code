package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CapturedTypeApproximationKt {

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Variance variance = Variance.f;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Variance variance2 = Variance.f;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final ApproximationBounds a(KotlinType type) {
        Object objC;
        TypeArgument typeArgument;
        Intrinsics.h(type, "type");
        if (FlexibleTypesKt.b(type)) {
            ApproximationBounds approximationBoundsA = a(FlexibleTypesKt.c(type));
            ApproximationBounds approximationBoundsA2 = a(FlexibleTypesKt.d(type));
            return new ApproximationBounds(TypeWithEnhancementKt.b(KotlinTypeFactory.a(FlexibleTypesKt.c((KotlinType) approximationBoundsA.f24636a), FlexibleTypesKt.d((KotlinType) approximationBoundsA2.f24636a)), type), TypeWithEnhancementKt.b(KotlinTypeFactory.a(FlexibleTypesKt.c((KotlinType) approximationBoundsA.b), FlexibleTypesKt.d((KotlinType) approximationBoundsA2.b)), type));
        }
        TypeConstructor typeConstructorJ0 = type.J0();
        boolean z = true;
        if (type.J0() instanceof CapturedTypeConstructor) {
            Intrinsics.f(typeConstructorJ0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection projection = ((CapturedTypeConstructor) typeConstructorJ0).getProjection();
            KotlinType type2 = projection.getType();
            Intrinsics.g(type2, "getType(...)");
            KotlinType kotlinTypeI = TypeUtils.i(type2, type.K0());
            int iOrdinal = projection.b().ordinal();
            if (iOrdinal == 1) {
                return new ApproximationBounds(kotlinTypeI, TypeUtilsKt.h(type).p());
            }
            if (iOrdinal == 2) {
                SimpleType simpleTypeO = TypeUtilsKt.h(type).o();
                Intrinsics.g(simpleTypeO, "getNothingType(...)");
                return new ApproximationBounds(TypeUtils.i(simpleTypeO, type.K0()), kotlinTypeI);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
        }
        if (type.H0().isEmpty() || type.H0().size() != typeConstructorJ0.getParameters().size()) {
            return new ApproximationBounds(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listH0 = type.H0();
        List parameters = typeConstructorJ0.getParameters();
        Intrinsics.g(parameters, "getParameters(...)");
        Iterator it = CollectionsKt.Q0(listH0, parameters).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            TypeProjection typeProjection = (TypeProjection) pair.d;
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.e;
            Intrinsics.e(typeParameterDescriptor);
            Variance varianceJ = typeParameterDescriptor.j();
            if (varianceJ == null) {
                TypeSubstitutor.a(35);
                throw null;
            }
            if (typeProjection == null) {
                TypeSubstitutor.a(36);
                throw null;
            }
            TypeSubstitutor typeSubstitutor = TypeSubstitutor.b;
            int iOrdinal2 = (typeProjection.a() ? Variance.h : TypeSubstitutor.b(varianceJ, typeProjection.b())).ordinal();
            if (iOrdinal2 == 0) {
                KotlinType type3 = typeProjection.getType();
                Intrinsics.g(type3, "getType(...)");
                KotlinType type4 = typeProjection.getType();
                Intrinsics.g(type4, "getType(...)");
                typeArgument = new TypeArgument(typeParameterDescriptor, type3, type4);
            } else if (iOrdinal2 == 1) {
                KotlinType type5 = typeProjection.getType();
                Intrinsics.g(type5, "getType(...)");
                SimpleType simpleTypeP = DescriptorUtilsKt.e(typeParameterDescriptor).p();
                Intrinsics.g(simpleTypeP, "getNullableAnyType(...)");
                typeArgument = new TypeArgument(typeParameterDescriptor, type5, simpleTypeP);
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                SimpleType simpleTypeO2 = DescriptorUtilsKt.e(typeParameterDescriptor).o();
                Intrinsics.g(simpleTypeO2, "getNothingType(...)");
                KotlinType type6 = typeProjection.getType();
                Intrinsics.g(type6, "getType(...)");
                typeArgument = new TypeArgument(typeParameterDescriptor, simpleTypeO2, type6);
            }
            if (typeProjection.a()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                ApproximationBounds approximationBoundsA3 = a(typeArgument.b);
                KotlinType kotlinType = (KotlinType) approximationBoundsA3.f24636a;
                KotlinType kotlinType2 = (KotlinType) approximationBoundsA3.b;
                ApproximationBounds approximationBoundsA4 = a(typeArgument.c);
                KotlinType kotlinType3 = (KotlinType) approximationBoundsA4.f24636a;
                KotlinType kotlinType4 = (KotlinType) approximationBoundsA4.b;
                TypeParameterDescriptor typeParameterDescriptor2 = typeArgument.f24637a;
                TypeArgument typeArgument2 = new TypeArgument(typeParameterDescriptor2, kotlinType2, kotlinType3);
                TypeArgument typeArgument3 = new TypeArgument(typeParameterDescriptor2, kotlinType, kotlinType4);
                arrayList.add(typeArgument2);
                arrayList2.add(typeArgument3);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TypeArgument typeArgument4 = (TypeArgument) it2.next();
                typeArgument4.getClass();
                if (!KotlinTypeChecker.f24623a.d(typeArgument4.b, typeArgument4.c)) {
                    break;
                }
            }
            z = false;
        }
        if (z) {
            objC = TypeUtilsKt.h(type).o();
            Intrinsics.g(objC, "getNothingType(...)");
        } else {
            objC = c(type, arrayList);
        }
        return new ApproximationBounds(objC, c(type, arrayList2));
    }

    public static final TypeProjection b(TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.a()) {
            KotlinType type = typeProjection.getType();
            Intrinsics.g(type, "getType(...)");
            if (TypeUtils.c(type, CapturedTypeApproximationKt$$Lambda$1.d, null)) {
                Variance varianceB = typeProjection.b();
                Intrinsics.g(varianceB, "getProjectionKind(...)");
                if (varianceB == Variance.h) {
                    return new TypeProjectionImpl((KotlinType) a(type).b, varianceB);
                }
                if (z) {
                    return new TypeProjectionImpl((KotlinType) a(type).f24636a, varianceB);
                }
                CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1 capturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1 = new CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1();
                TypeSubstitutor typeSubstitutor = new TypeSubstitutor(capturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1);
                if (!capturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1.f()) {
                    try {
                        return typeSubstitutor.l(typeProjection, null, 0);
                    } catch (TypeSubstitutor.SubstitutionException unused) {
                        return null;
                    }
                }
            }
        }
        return typeProjection;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType c(kotlin.reflect.jvm.internal.impl.types.KotlinType r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.H0()
            r0.size()
            r8.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.s(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r8.next()
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument r1 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument) r1
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r1.c
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r1.b
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r1 = r1.f24637a
            kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl r5 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.f24623a
            r5.d(r4, r3)
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r4, r3)
            if (r5 != 0) goto L91
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r1.j()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.g
            if (r5 != r6) goto L43
            goto L91
        L43:
            boolean r5 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.F(r4)
            if (r5 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r1.j()
            if (r5 == r6) goto L5f
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r2 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.h
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.j()
            if (r4 != r1) goto L5b
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.f
        L5b:
            r2.<init>(r3, r4)
            goto L96
        L5f:
            if (r3 == 0) goto L8b
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.y(r3)
            if (r2 == 0) goto L7b
            boolean r2 = r3.K0()
            if (r2 == 0) goto L7b
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r2 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.j()
            if (r6 != r1) goto L77
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.f
        L77:
            r2.<init>(r4, r6)
            goto L96
        L7b:
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r2 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.h
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.j()
            if (r4 != r1) goto L87
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.f
        L87:
            r2.<init>(r3, r4)
            goto L96
        L8b:
            r7 = 140(0x8c, float:1.96E-43)
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.a(r7)
            throw r2
        L91:
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r2 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            r2.<init>(r4)
        L96:
            r0.add(r2)
            goto L19
        L9b:
            r8 = 6
            kotlin.reflect.jvm.internal.impl.types.KotlinType r7 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.c(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.c(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.ArrayList):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }
}
