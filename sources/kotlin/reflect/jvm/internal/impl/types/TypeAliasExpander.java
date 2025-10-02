package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeAliasExpander {

    public static final class Companion {
    }

    public static TypeAttributes b(UnwrappedType unwrappedType, TypeAttributes typeAttributes) {
        if (KotlinTypeKt.a(unwrappedType)) {
            return unwrappedType.I0();
        }
        TypeAttributes other = unwrappedType.I0();
        typeAttributes.getClass();
        TypeAttributes.Companion companion = TypeAttributes.e;
        Intrinsics.h(other, "other");
        if (typeAttributes.isEmpty() && other.isEmpty()) {
            return typeAttributes;
        }
        ArrayList arrayList = new ArrayList();
        Collection collectionValues = companion.f24648a.values();
        Intrinsics.g(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute typeAttribute = (TypeAttribute) typeAttributes.d.get(iIntValue);
            TypeAttribute typeAttribute2 = (TypeAttribute) other.d.get(iIntValue);
            CollectionsKt.a(arrayList, typeAttribute == null ? typeAttribute2 != null ? typeAttribute2.a(typeAttribute) : null : typeAttribute.a(typeAttribute2));
        }
        return TypeAttributes.Companion.c(arrayList);
    }

    public final void a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().d());
        }
        Iterator<AnnotationDescriptor> it2 = annotations2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(it2.next().d());
        }
    }

    public final SimpleType c(TypeAliasExpansion typeAliasExpansion, TypeAttributes attributes) {
        Intrinsics.h(attributes, "attributes");
        return d(typeAliasExpansion, attributes, false, 0, true);
    }

    public final SimpleType d(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z, int i, boolean z2) {
        Variance variance = Variance.f;
        TypeAliasDescriptor typeAliasDescriptor = typeAliasExpansion.b;
        TypeProjection typeProjectionE = e(new TypeProjectionImpl(typeAliasDescriptor.x0(), variance), typeAliasExpansion, null, i);
        KotlinType type = typeProjectionE.getType();
        Intrinsics.g(type, "getType(...)");
        SimpleType simpleTypeA = TypeSubstitutionKt.a(type);
        if (KotlinTypeKt.a(simpleTypeA)) {
            return simpleTypeA;
        }
        typeProjectionE.b();
        a(simpleTypeA.getAnnotations(), AnnotationsTypeAttributeKt.a(typeAttributes));
        if (!KotlinTypeKt.a(simpleTypeA)) {
            simpleTypeA = TypeSubstitutionKt.d(simpleTypeA, null, b(simpleTypeA, typeAttributes), 1);
        }
        SimpleType simpleTypeJ = TypeUtils.j(simpleTypeA, z);
        if (!z2) {
            return simpleTypeJ;
        }
        TypeConstructor typeConstructorM = typeAliasDescriptor.m();
        Intrinsics.g(typeConstructorM, "getTypeConstructor(...)");
        return SpecialTypesKt.d(simpleTypeJ, KotlinTypeFactory.e(typeAliasExpansion.c, MemberScope.Empty.b, typeAttributes, typeConstructorM, z));
    }

    public final TypeProjection e(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance varianceJ;
        KotlinType kotlinTypeD;
        Variance variance;
        Variance variance2;
        TypeAliasDescriptor typeAliasDescriptor = typeAliasExpansion.b;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }
        if (typeProjection.a()) {
            Intrinsics.e(typeParameterDescriptor);
            return TypeUtils.k(typeParameterDescriptor);
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.g(type, "getType(...)");
        TypeConstructor constructor = type.J0();
        Intrinsics.h(constructor, "constructor");
        ClassifierDescriptor classifierDescriptorC = constructor.c();
        TypeProjection typeProjection2 = classifierDescriptorC instanceof TypeParameterDescriptor ? (TypeProjection) typeAliasExpansion.d.get(classifierDescriptorC) : null;
        if (typeProjection2 != null) {
            if (typeProjection2.a()) {
                Intrinsics.e(typeParameterDescriptor);
                return TypeUtils.k(typeParameterDescriptor);
            }
            UnwrappedType unwrappedTypeM0 = typeProjection2.getType().M0();
            Variance varianceB = typeProjection2.b();
            Intrinsics.g(varianceB, "getProjectionKind(...)");
            Variance varianceB2 = typeProjection.b();
            Intrinsics.g(varianceB2, "getProjectionKind(...)");
            if (varianceB2 != varianceB && varianceB2 != (variance2 = Variance.f) && varianceB == variance2) {
                varianceB = varianceB2;
            }
            if (typeParameterDescriptor == null || (varianceJ = typeParameterDescriptor.j()) == null) {
                varianceJ = Variance.f;
            }
            if (varianceJ != varianceB && varianceJ != (variance = Variance.f) && varianceB == variance) {
                varianceB = variance;
            }
            a(type.getAnnotations(), unwrappedTypeM0.getAnnotations());
            if (unwrappedTypeM0 instanceof DynamicType) {
                DynamicType dynamicType = (DynamicType) unwrappedTypeM0;
                TypeAttributes newAttributes = b(dynamicType, type.I0());
                Intrinsics.h(newAttributes, "newAttributes");
                kotlinTypeD = new DynamicType(TypeUtilsKt.h(dynamicType.f), newAttributes);
            } else {
                SimpleType simpleTypeJ = TypeUtils.j(TypeSubstitutionKt.a(unwrappedTypeM0), type.K0());
                kotlinTypeD = KotlinTypeKt.a(simpleTypeJ) ? simpleTypeJ : TypeSubstitutionKt.d(simpleTypeJ, null, b(simpleTypeJ, type.I0()), 1);
            }
            return new TypeProjectionImpl(kotlinTypeD, varianceB);
        }
        UnwrappedType unwrappedTypeM02 = typeProjection.getType().M0();
        if (!DynamicTypesKt.a(unwrappedTypeM02)) {
            SimpleType simpleTypeA = TypeSubstitutionKt.a(unwrappedTypeM02);
            if (!KotlinTypeKt.a(simpleTypeA) && TypeUtilsKt.q(simpleTypeA)) {
                TypeConstructor typeConstructorJ0 = simpleTypeA.J0();
                ClassifierDescriptor classifierDescriptorC2 = typeConstructorJ0.c();
                typeConstructorJ0.getParameters().size();
                simpleTypeA.H0().size();
                if (!(classifierDescriptorC2 instanceof TypeParameterDescriptor)) {
                    int i2 = 0;
                    if (!(classifierDescriptorC2 instanceof TypeAliasDescriptor)) {
                        SimpleType simpleTypeF = f(simpleTypeA, typeAliasExpansion, i);
                        TypeSubstitutor.d(simpleTypeF);
                        for (Object obj : simpleTypeF.H0()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                kotlin.collections.CollectionsKt.z0();
                                throw null;
                            }
                            TypeProjection typeProjection3 = (TypeProjection) obj;
                            if (!typeProjection3.a()) {
                                KotlinType type2 = typeProjection3.getType();
                                Intrinsics.g(type2, "getType(...)");
                                if (!TypeUtilsKt.d(type2)) {
                                }
                            }
                            i2 = i3;
                        }
                        return new TypeProjectionImpl(simpleTypeF, typeProjection.b());
                    }
                    TypeAliasDescriptor typeAliasDescriptor2 = (TypeAliasDescriptor) classifierDescriptorC2;
                    if (typeAliasExpansion.a(typeAliasDescriptor2)) {
                        return new TypeProjectionImpl(ErrorUtils.c(ErrorTypeKind.i, typeAliasDescriptor2.getName().d), Variance.f);
                    }
                    List listH0 = simpleTypeA.H0();
                    ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.s(listH0, 10));
                    for (Object obj2 : listH0) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            kotlin.collections.CollectionsKt.z0();
                            throw null;
                        }
                        arrayList.add(e((TypeProjection) obj2, typeAliasExpansion, (TypeParameterDescriptor) typeConstructorJ0.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    SimpleType simpleTypeD = d(TypeAliasExpansion.Companion.a(typeAliasExpansion, typeAliasDescriptor2, arrayList), simpleTypeA.I0(), simpleTypeA.K0(), i + 1, false);
                    SimpleType simpleTypeF2 = f(simpleTypeA, typeAliasExpansion, i);
                    if (!DynamicTypesKt.a(simpleTypeD)) {
                        simpleTypeD = SpecialTypesKt.d(simpleTypeD, simpleTypeF2);
                    }
                    return new TypeProjectionImpl(simpleTypeD, typeProjection.b());
                }
            }
        }
        return typeProjection;
    }

    public final SimpleType f(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor typeConstructorJ0 = simpleType.J0();
        List listH0 = simpleType.H0();
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.s(listH0, 10));
        int i2 = 0;
        for (Object obj : listH0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.z0();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionE = e(typeProjection, typeAliasExpansion, (TypeParameterDescriptor) typeConstructorJ0.getParameters().get(i2), i + 1);
            if (!typeProjectionE.a()) {
                typeProjectionE = new TypeProjectionImpl(TypeUtils.i(typeProjectionE.getType(), typeProjection.getType().K0()), typeProjectionE.b());
            }
            arrayList.add(typeProjectionE);
            i2 = i3;
        }
        return TypeSubstitutionKt.d(simpleType, arrayList, null, 2);
    }
}
