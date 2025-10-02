package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class JavaTypeEnhancement {

    /* loaded from: classes7.dex */
    public static final class Result {

        /* renamed from: a, reason: collision with root package name */
        public final KotlinType f24444a;
        public final int b;

        public Result(UnwrappedType unwrappedType, int i) {
            this.f24444a = unwrappedType;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final KotlinType b() {
            return this.f24444a;
        }
    }

    /* loaded from: classes7.dex */
    public static final class SimpleResult {

        /* renamed from: a, reason: collision with root package name */
        public final SimpleType f24445a;
        public final int b;
        public final boolean c;

        public SimpleResult(SimpleType simpleType, int i, boolean z) {
            this.f24445a = simpleType;
            this.b = i;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final SimpleType c() {
            return this.f24445a;
        }
    }

    public final SimpleResult a(SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        ClassifierDescriptor classifierDescriptorC;
        TypeConstructor typeConstructorJ0;
        Boolean bool;
        Result result;
        TypeProjectionBase typeProjectionBaseK;
        Function1 function12 = function1;
        boolean z3 = z2;
        boolean zA = TypeComponentPositionKt.a(typeComponentPosition);
        boolean z4 = (z3 && z) ? false : true;
        UnwrappedType unwrappedType = null;
        if ((zA || !simpleType.H0().isEmpty()) && (classifierDescriptorC = simpleType.J0().c()) != null) {
            AbstractSignatureParts$$Lambda$1 abstractSignatureParts$$Lambda$1 = (AbstractSignatureParts$$Lambda$1) function12;
            JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) abstractSignatureParts$$Lambda$1.invoke(Integer.valueOf(i));
            ClassDescriptor classDescriptorB = TypeEnhancementKt.b(classifierDescriptorC, javaTypeQualifiers, typeComponentPosition);
            Boolean boolD = TypeEnhancementKt.d(javaTypeQualifiers, typeComponentPosition);
            if (classDescriptorB == null || (typeConstructorJ0 = classDescriptorB.m()) == null) {
                typeConstructorJ0 = simpleType.J0();
            }
            int iA = i + 1;
            List listH0 = simpleType.H0();
            List parameters = typeConstructorJ0.getParameters();
            Intrinsics.g(parameters, "getParameters(...)");
            List list = parameters;
            Iterator it = listH0.iterator();
            Iterator it2 = list.iterator();
            ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.s(listH0, 10), CollectionsKt.s(list, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
                TypeProjection typeProjection = (TypeProjection) next;
                if (z4) {
                    bool = boolD;
                    if (!typeProjection.a()) {
                        result = b(typeProjection.getType().M0(), function12, iA, z3);
                    } else if (((JavaTypeQualifiers) abstractSignatureParts$$Lambda$1.invoke(Integer.valueOf(iA))).b() == NullabilityQualifier.d) {
                        UnwrappedType unwrappedTypeM0 = typeProjection.getType().M0();
                        result = new Result(KotlinTypeFactory.a(FlexibleTypesKt.c(unwrappedTypeM0).N0(false), FlexibleTypesKt.d(unwrappedTypeM0).N0(true)), 1);
                    } else {
                        result = new Result(null, 1);
                    }
                } else {
                    bool = boolD;
                    result = new Result(unwrappedType, 0);
                }
                iA += result.a();
                if (result.b() != null) {
                    KotlinType kotlinTypeB = result.b();
                    Variance varianceB = typeProjection.b();
                    Intrinsics.g(varianceB, "getProjectionKind(...)");
                    typeProjectionBaseK = TypeUtilsKt.e(kotlinTypeB, varianceB, typeParameterDescriptor);
                } else if (classDescriptorB == null || typeProjection.a()) {
                    typeProjectionBaseK = classDescriptorB != null ? TypeUtils.k(typeParameterDescriptor) : null;
                } else {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.g(type, "getType(...)");
                    Variance varianceB2 = typeProjection.b();
                    Intrinsics.g(varianceB2, "getProjectionKind(...)");
                    typeProjectionBaseK = TypeUtilsKt.e(type, varianceB2, typeParameterDescriptor);
                }
                arrayList.add(typeProjectionBaseK);
                function12 = function1;
                boolD = bool;
                z3 = z2;
                unwrappedType = null;
            }
            Boolean bool2 = boolD;
            int i2 = iA - i;
            if (classDescriptorB == null && bool2 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((TypeProjection) it3.next()) == null) {
                        }
                    }
                }
                return new SimpleResult(null, i2, false);
            }
            Annotations annotations = simpleType.getAnnotations();
            EnhancedTypeAnnotations enhancedTypeAnnotations = TypeEnhancementKt.b;
            if (classDescriptorB == null) {
                enhancedTypeAnnotations = null;
            }
            Annotations annotationsE = TypeEnhancementKt.e();
            if (bool2 == null) {
                annotationsE = null;
            }
            TypeAttributes typeAttributesB = TypeAttributesKt.b(TypeEnhancementKt.a(ArraysKt.F(new Annotations[]{annotations, enhancedTypeAnnotations, annotationsE})));
            List listH02 = simpleType.H0();
            Iterator it4 = arrayList.iterator();
            Iterator it5 = listH02.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.s(arrayList, 10), CollectionsKt.s(listH02, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                TypeProjection typeProjection2 = (TypeProjection) it5.next();
                TypeProjection typeProjection3 = (TypeProjection) next2;
                if (typeProjection3 != null) {
                    typeProjection2 = typeProjection3;
                }
                arrayList2.add(typeProjection2);
            }
            SimpleType simpleTypeD = KotlinTypeFactory.d(typeAttributesB, typeConstructorJ0, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.K0(), null);
            if (javaTypeQualifiers.a()) {
                simpleTypeD = new NotNullTypeParameterImpl(simpleTypeD);
            }
            return new SimpleResult(simpleTypeD, i2, bool2 != null && javaTypeQualifiers.c());
        }
        return new SimpleResult(null, 1, false);
    }

    public final Result b(UnwrappedType unwrappedType, Function1 function1, int i, boolean z) {
        KotlinType kotlinTypeC;
        UnwrappedType unwrappedTypeD = null;
        if (KotlinTypeKt.a(unwrappedType)) {
            return new Result(null, 1);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (!(unwrappedType instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleResult simpleResultA = a((SimpleType) unwrappedType, function1, i, TypeComponentPosition.f, false, z);
            return new Result(simpleResultA.a() ? TypeWithEnhancementKt.d(unwrappedType, simpleResultA.c()) : simpleResultA.c(), simpleResultA.b());
        }
        boolean z2 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        SimpleResult simpleResultA2 = a(flexibleType.R0(), function1, i, TypeComponentPosition.d, z2, z);
        SimpleResult simpleResultA3 = a(flexibleType.S0(), function1, i, TypeComponentPosition.e, z2, z);
        if (simpleResultA2.c() != null || simpleResultA3.c() != null) {
            if (simpleResultA2.a() || simpleResultA3.a()) {
                SimpleType simpleTypeC = simpleResultA3.c();
                if (simpleTypeC != null) {
                    SimpleType simpleTypeC2 = simpleResultA2.c();
                    if (simpleTypeC2 == null) {
                        simpleTypeC2 = simpleTypeC;
                    }
                    kotlinTypeC = KotlinTypeFactory.a(simpleTypeC2, simpleTypeC);
                } else {
                    kotlinTypeC = simpleResultA2.c();
                    Intrinsics.e(kotlinTypeC);
                }
                unwrappedTypeD = TypeWithEnhancementKt.d(unwrappedType, kotlinTypeC);
            } else if (z2) {
                SimpleType simpleTypeC3 = simpleResultA2.c();
                if (simpleTypeC3 == null) {
                    simpleTypeC3 = flexibleType.R0();
                }
                SimpleType simpleTypeC4 = simpleResultA3.c();
                if (simpleTypeC4 == null) {
                    simpleTypeC4 = flexibleType.S0();
                }
                unwrappedTypeD = new RawTypeImpl(simpleTypeC3, simpleTypeC4);
            } else {
                SimpleType simpleTypeC5 = simpleResultA2.c();
                if (simpleTypeC5 == null) {
                    simpleTypeC5 = flexibleType.R0();
                }
                SimpleType simpleTypeC6 = simpleResultA3.c();
                if (simpleTypeC6 == null) {
                    simpleTypeC6 = flexibleType.S0();
                }
                unwrappedTypeD = KotlinTypeFactory.a(simpleTypeC5, simpleTypeC6);
            }
        }
        return new Result(unwrappedTypeD, simpleResultA2.b());
    }
}
