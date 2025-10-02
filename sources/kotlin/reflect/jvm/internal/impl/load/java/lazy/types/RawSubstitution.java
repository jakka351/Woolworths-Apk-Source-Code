package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RawSubstitution extends TypeSubstitution {
    public static final JavaTypeAttributes d;
    public static final JavaTypeAttributes e;
    public final RawProjectionComputer b;
    public final TypeParameterUpperBoundEraser c;

    public static final class Companion {
    }

    static {
        TypeUsage typeUsage = TypeUsage.e;
        d = JavaTypeAttributes.e(JavaTypeAttributesKt.a(typeUsage, false, null, 5), JavaTypeFlexibility.f, false, null, null, 61);
        e = JavaTypeAttributes.e(JavaTypeAttributesKt.a(typeUsage, false, null, 5), JavaTypeFlexibility.e, false, null, null, 61);
    }

    public RawSubstitution() {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.b = rawProjectionComputer;
        this.c = new TypeParameterUpperBoundEraser(rawProjectionComputer);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final TypeProjection e(KotlinType kotlinType) {
        return new TypeProjectionImpl(i(kotlinType, new JavaTypeAttributes(TypeUsage.e, false, false, null, 62)));
    }

    public final Pair h(final SimpleType simpleType, final ClassDescriptor classDescriptor, final JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.J0().getParameters().isEmpty()) {
            return new Pair(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.z(simpleType)) {
            TypeProjection typeProjection = (TypeProjection) simpleType.H0().get(0);
            Variance varianceB = typeProjection.b();
            KotlinType type = typeProjection.getType();
            Intrinsics.g(type, "getType(...)");
            return new Pair(KotlinTypeFactory.d(simpleType.I0(), simpleType.J0(), CollectionsKt.Q(new TypeProjectionImpl(i(type, javaTypeAttributes), varianceB)), simpleType.K0(), null), Boolean.FALSE);
        }
        if (KotlinTypeKt.a(simpleType)) {
            return new Pair(ErrorUtils.c(ErrorTypeKind.q, simpleType.J0().toString()), Boolean.FALSE);
        }
        MemberScope memberScopeU0 = classDescriptor.u0(this);
        Intrinsics.g(memberScopeU0, "getMemberScope(...)");
        TypeAttributes typeAttributesI0 = simpleType.I0();
        TypeConstructor typeConstructorM = classDescriptor.m();
        Intrinsics.g(typeConstructorM, "getTypeConstructor(...)");
        List parameters = classDescriptor.m().getParameters();
        Intrinsics.g(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            Intrinsics.e(typeParameterDescriptor);
            TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.c;
            arrayList.add(this.b.a(typeParameterDescriptor, javaTypeAttributes, typeParameterUpperBoundEraser, typeParameterUpperBoundEraser.b(typeParameterDescriptor, javaTypeAttributes)));
        }
        return new Pair(KotlinTypeFactory.f(typeAttributesI0, typeConstructorM, arrayList, simpleType.K0(), memberScopeU0, new Function1(classDescriptor, this, simpleType, javaTypeAttributes) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$$Lambda$0
            public final ClassDescriptor d;

            {
                this.d = classDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                JavaTypeAttributes javaTypeAttributes2 = RawSubstitution.d;
                Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
                ClassId classIdF = DescriptorUtilsKt.f(this.d);
                if (classIdF == null) {
                    return null;
                }
                kotlinTypeRefiner.b(classIdF);
                return null;
            }
        }), Boolean.TRUE);
    }

    public final KotlinType i(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        if (classifierDescriptorC instanceof TypeParameterDescriptor) {
            return i(this.c.b((TypeParameterDescriptor) classifierDescriptorC, javaTypeAttributes.i(true)), javaTypeAttributes);
        }
        if (!(classifierDescriptorC instanceof ClassDescriptor)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + classifierDescriptorC).toString());
        }
        ClassifierDescriptor classifierDescriptorC2 = FlexibleTypesKt.d(kotlinType).J0().c();
        if (classifierDescriptorC2 instanceof ClassDescriptor) {
            Pair pairH = h(FlexibleTypesKt.c(kotlinType), (ClassDescriptor) classifierDescriptorC, d);
            SimpleType simpleType = (SimpleType) pairH.d;
            boolean zBooleanValue = ((Boolean) pairH.e).booleanValue();
            Pair pairH2 = h(FlexibleTypesKt.d(kotlinType), (ClassDescriptor) classifierDescriptorC2, e);
            SimpleType simpleType2 = (SimpleType) pairH2.d;
            return (zBooleanValue || ((Boolean) pairH2.e).booleanValue()) ? new RawTypeImpl(simpleType, simpleType2) : KotlinTypeFactory.a(simpleType, simpleType2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorC2 + "\" while for lower it's \"" + classifierDescriptorC + '\"').toString());
    }
}
