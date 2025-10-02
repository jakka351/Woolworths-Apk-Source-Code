package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FunctionTypesKt {
    public static final int a(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        AnnotationDescriptor annotationDescriptorH = kotlinType.getAnnotations().H(StandardNames.FqNames.q);
        if (annotationDescriptorH == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) MapsKt.e(StandardNames.e, annotationDescriptorH.b());
        Intrinsics.f(constantValue, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((IntValue) constantValue).f24539a).intValue();
    }

    public static final SimpleType b(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List list, ArrayList arrayList, KotlinType kotlinType2, boolean z) {
        ClassDescriptor classDescriptorK;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (kotlinType != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(TypeUtilsKt.a((KotlinType) it.next()));
        }
        arrayList2.addAll(arrayList3);
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList2, kotlinType != null ? TypeUtilsKt.a(kotlinType) : null);
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            arrayList2.add(TypeUtilsKt.a((KotlinType) obj));
            i = i2;
        }
        arrayList2.add(TypeUtilsKt.a(kotlinType2));
        int size = list.size() + arrayList.size() + (kotlinType != null ? 1 : 0);
        if (z) {
            classDescriptorK = kotlinBuiltIns.w(size);
        } else {
            Name name = StandardNames.f24313a;
            classDescriptorK = kotlinBuiltIns.k("Function" + size);
        }
        Intrinsics.e(classDescriptorK);
        if (kotlinType != null) {
            FqName fqName = StandardNames.FqNames.p;
            if (!annotations.m2(fqName)) {
                annotations = Annotations.Companion.a(CollectionsKt.b0(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, EmptyMap.d)));
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            FqName fqName2 = StandardNames.FqNames.q;
            if (!annotations.m2(fqName2)) {
                annotations = Annotations.Companion.a(CollectionsKt.b0(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName2, MapsKt.i(new Pair(StandardNames.e, new IntValue(size2))))));
            }
        }
        return KotlinTypeFactory.c(TypeAttributesKt.b(annotations), classDescriptorK, arrayList2);
    }

    public static final Name c(KotlinType kotlinType) {
        String str;
        AnnotationDescriptor annotationDescriptorH = kotlinType.getAnnotations().H(StandardNames.FqNames.r);
        if (annotationDescriptorH != null) {
            Object objO0 = CollectionsKt.o0(annotationDescriptorH.b().values());
            StringValue stringValue = objO0 instanceof StringValue ? (StringValue) objO0 : null;
            if (stringValue != null && (str = (String) stringValue.f24539a) != null) {
                if (!Name.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return Name.e(str);
                }
            }
        }
        return null;
    }

    public static final List d(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        j(kotlinType);
        int iA = a(kotlinType);
        if (iA == 0) {
            return EmptyList.d;
        }
        List listSubList = kotlinType.H0().subList(0, iA);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return arrayList;
    }

    public static final FunctionTypeKind e(ClassifierDescriptor classifierDescriptor) {
        if (!(classifierDescriptor instanceof ClassDescriptor) || !KotlinBuiltIns.K(classifierDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafeH = DescriptorUtilsKt.h(classifierDescriptor);
        if (!fqNameUnsafeH.d() || fqNameUnsafeH.c()) {
            return null;
        }
        FunctionTypeKindExtractor functionTypeKindExtractor = FunctionTypeKindExtractor.c;
        FqName fqNameB = fqNameUnsafeH.g().b();
        String strB = fqNameUnsafeH.f().b();
        Intrinsics.g(strB, "asString(...)");
        functionTypeKindExtractor.getClass();
        FunctionTypeKindExtractor.KindWithArity kindWithArityA = functionTypeKindExtractor.a(strB, fqNameB);
        if (kindWithArityA != null) {
            return kindWithArityA.f24320a;
        }
        return null;
    }

    public static final KotlinType f(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        j(kotlinType);
        if (kotlinType.getAnnotations().H(StandardNames.FqNames.p) == null) {
            return null;
        }
        return ((TypeProjection) kotlinType.H0().get(a(kotlinType))).getType();
    }

    public static final KotlinType g(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        j(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.O(kotlinType.H0())).getType();
        Intrinsics.g(type, "getType(...)");
        return type;
    }

    public static final List h(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        j(kotlinType);
        return kotlinType.H0().subList((i(kotlinType) ? 1 : 0) + a(kotlinType), r0.size() - 1);
    }

    public static final boolean i(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        return j(kotlinType) && kotlinType.getAnnotations().H(StandardNames.FqNames.p) != null;
    }

    public static final boolean j(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        if (classifierDescriptorC == null) {
            return false;
        }
        FunctionTypeKind functionTypeKindE = e(classifierDescriptorC);
        return Intrinsics.c(functionTypeKindE, FunctionTypeKind.Function.c) || Intrinsics.c(functionTypeKindE, FunctionTypeKind.SuspendFunction.c);
    }

    public static final boolean k(SimpleType simpleType) {
        ClassifierDescriptor classifierDescriptorC = simpleType.J0().c();
        return Intrinsics.c(classifierDescriptorC != null ? e(classifierDescriptorC) : null, FunctionTypeKind.Function.c);
    }

    public static final boolean l(KotlinType kotlinType) {
        Intrinsics.h(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        return Intrinsics.c(classifierDescriptorC != null ? e(classifierDescriptorC) : null, FunctionTypeKind.SuspendFunction.c);
    }
}
