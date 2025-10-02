package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeUtilsKt {
    public static final TypeProjectionImpl a(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        return new TypeProjectionImpl(kotlinType);
    }

    public static final boolean b(KotlinType kotlinType, Function1 function1) {
        Intrinsics.h(kotlinType, "<this>");
        return TypeUtils.c(kotlinType, function1, null);
    }

    public static final boolean c(KotlinType kotlinType, TypeConstructor typeConstructor, Set set) {
        boolean zC;
        if (Intrinsics.c(kotlinType.J0(), typeConstructor)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorC instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorC : null;
        List listU = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.u() : null;
        Iterable iterableP0 = CollectionsKt.P0(kotlinType.H0());
        if (!(iterableP0 instanceof Collection) || !((Collection) iterableP0).isEmpty()) {
            Iterator it = iterableP0.iterator();
            do {
                IndexingIterator indexingIterator = (IndexingIterator) it;
                if (indexingIterator.d.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                    int i = indexedValue.f24254a;
                    TypeProjection typeProjection = (TypeProjection) indexedValue.b;
                    TypeParameterDescriptor typeParameterDescriptor = listU != null ? (TypeParameterDescriptor) CollectionsKt.J(i, listU) : null;
                    if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.a()) {
                        KotlinType type = typeProjection.getType();
                        Intrinsics.g(type, "getType(...)");
                        zC = c(type, typeConstructor, set);
                    } else {
                        zC = false;
                    }
                }
            } while (!zC);
            return true;
        }
        return false;
    }

    public static final boolean d(KotlinType kotlinType) {
        return TypeUtils.c(kotlinType, TypeUtilsKt$$Lambda$2.d, null);
    }

    public static final TypeProjectionImpl e(KotlinType type, Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.h(type, "type");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.j() : null) == variance) {
            variance = Variance.f;
        }
        return new TypeProjectionImpl(type, variance);
    }

    public static final LinkedHashSet f(SimpleType simpleType, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        g(simpleType, simpleType, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final void g(KotlinType kotlinType, SimpleType simpleType, LinkedHashSet linkedHashSet, Set set) {
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        if (classifierDescriptorC instanceof TypeParameterDescriptor) {
            if (!Intrinsics.c(kotlinType.J0(), simpleType.J0())) {
                linkedHashSet.add(classifierDescriptorC);
                return;
            }
            for (KotlinType kotlinType2 : ((TypeParameterDescriptor) classifierDescriptorC).getUpperBounds()) {
                Intrinsics.e(kotlinType2);
                g(kotlinType2, simpleType, linkedHashSet, set);
            }
            return;
        }
        ClassifierDescriptor classifierDescriptorC2 = kotlinType.J0().c();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorC2 instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorC2 : null;
        List listU = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.u() : null;
        int i = 0;
        for (TypeProjection typeProjection : kotlinType.H0()) {
            int i2 = i + 1;
            TypeParameterDescriptor typeParameterDescriptor = listU != null ? (TypeParameterDescriptor) CollectionsKt.J(i, listU) : null;
            if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.a() && !CollectionsKt.t(linkedHashSet, typeProjection.getType().J0().c()) && !Intrinsics.c(typeProjection.getType().J0(), simpleType.J0())) {
                KotlinType type = typeProjection.getType();
                Intrinsics.g(type, "getType(...)");
                g(type, simpleType, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final KotlinBuiltIns h(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        KotlinBuiltIns kotlinBuiltInsP = kotlinType.J0().p();
        Intrinsics.g(kotlinBuiltInsP, "getBuiltIns(...)");
        return kotlinBuiltInsP;
    }

    public static final KotlinType i(TypeParameterDescriptor typeParameterDescriptor) {
        Object obj;
        List upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.g(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.g(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassifierDescriptor classifierDescriptorC = ((KotlinType) next).J0().c();
            ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
            if (classDescriptor != null && classDescriptor.f() != ClassKind.e && classDescriptor.f() != ClassKind.h) {
                obj = next;
                break;
            }
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        List upperBounds3 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.g(upperBounds3, "getUpperBounds(...)");
        Object objD = CollectionsKt.D(upperBounds3);
        Intrinsics.g(objD, "first(...)");
        return (KotlinType) objD;
    }

    public static final boolean j(TypeParameterDescriptor typeParameter, TypeConstructor typeConstructor, Set set) {
        Intrinsics.h(typeParameter, "typeParameter");
        List upperBounds = typeParameter.getUpperBounds();
        Intrinsics.g(upperBounds, "getUpperBounds(...)");
        List<KotlinType> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (KotlinType kotlinType : list) {
            Intrinsics.e(kotlinType);
            if (c(kotlinType, typeParameter.t().J0(), set) && (typeConstructor == null || Intrinsics.c(kotlinType.J0(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean k(TypeParameterDescriptor typeParameterDescriptor, TypeConstructor typeConstructor, int i) {
        if ((i & 2) != 0) {
            typeConstructor = null;
        }
        return j(typeParameterDescriptor, typeConstructor, null);
    }

    public static final boolean l(KotlinType kotlinType, KotlinType superType) {
        Intrinsics.h(superType, "superType");
        return KotlinTypeChecker.f24623a.d(kotlinType, superType);
    }

    public static final boolean m(SimpleType simpleType) {
        return (simpleType instanceof ErrorType) && ((ErrorType) simpleType).g.e;
    }

    public static final UnwrappedType n(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        UnwrappedType unwrappedTypeH = TypeUtils.h(kotlinType, true);
        Intrinsics.g(unwrappedTypeH, "makeNullable(...)");
        return unwrappedTypeH;
    }

    public static final KotlinType o(KotlinType kotlinType, Annotations annotations) {
        return (kotlinType.getAnnotations().isEmpty() && annotations.isEmpty()) ? kotlinType : kotlinType.M0().P0(TypeAttributesKt.a(kotlinType.I0(), annotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    public static final UnwrappedType p(KotlinType kotlinType) {
        SimpleType simpleTypeD;
        Intrinsics.h(kotlinType, "<this>");
        UnwrappedType unwrappedTypeM0 = kotlinType.M0();
        if (unwrappedTypeM0 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeM0;
            SimpleType simpleTypeD2 = flexibleType.e;
            if (!simpleTypeD2.J0().getParameters().isEmpty() && simpleTypeD2.J0().c() != null) {
                List parameters = simpleTypeD2.J0().getParameters();
                Intrinsics.g(parameters, "getParameters(...)");
                List list = parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                simpleTypeD2 = TypeSubstitutionKt.d(simpleTypeD2, arrayList, null, 2);
            }
            SimpleType simpleTypeD3 = flexibleType.f;
            if (!simpleTypeD3.J0().getParameters().isEmpty() && simpleTypeD3.J0().c() != null) {
                List parameters2 = simpleTypeD3.J0().getParameters();
                Intrinsics.g(parameters2, "getParameters(...)");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                simpleTypeD3 = TypeSubstitutionKt.d(simpleTypeD3, arrayList2, null, 2);
            }
            simpleTypeD = KotlinTypeFactory.a(simpleTypeD2, simpleTypeD3);
        } else {
            if (!(unwrappedTypeM0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeM0;
            boolean zIsEmpty = simpleType.J0().getParameters().isEmpty();
            simpleTypeD = simpleType;
            if (!zIsEmpty) {
                ClassifierDescriptor classifierDescriptorC = simpleType.J0().c();
                simpleTypeD = simpleType;
                if (classifierDescriptorC != null) {
                    List parameters3 = simpleType.J0().getParameters();
                    Intrinsics.g(parameters3, "getParameters(...)");
                    List list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                    }
                    simpleTypeD = TypeSubstitutionKt.d(simpleType, arrayList3, null, 2);
                }
            }
        }
        return TypeWithEnhancementKt.b(simpleTypeD, unwrappedTypeM0);
    }

    public static final boolean q(SimpleType simpleType) {
        return TypeUtils.c(simpleType, TypeUtilsKt$$Lambda$4.d, null);
    }
}
