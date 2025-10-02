package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class StarProjectionImplKt {
    public static final KotlinType a(final ArrayList arrayList, List list, KotlinBuiltIns kotlinBuiltIns) {
        KotlinType kotlinTypeK = new TypeSubstitutor(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public final TypeProjection h(TypeConstructor key) {
                Intrinsics.h(key, "key");
                if (!arrayList.contains(key)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorC = key.c();
                Intrinsics.f(classifierDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return TypeUtils.k((TypeParameterDescriptor) classifierDescriptorC);
            }
        }).k((KotlinType) CollectionsKt.D(list), Variance.h);
        return kotlinTypeK == null ? kotlinBuiltIns.n() : kotlinTypeK;
    }

    public static final KotlinType b(TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.h(typeParameterDescriptor, "<this>");
        DeclarationDescriptor declarationDescriptorE = typeParameterDescriptor.e();
        Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
        if (declarationDescriptorE instanceof ClassifierDescriptorWithTypeParameters) {
            List parameters = ((ClassifierDescriptorWithTypeParameters) declarationDescriptorE).m().getParameters();
            Intrinsics.g(parameters, "getParameters(...)");
            List list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TypeConstructor typeConstructorM = ((TypeParameterDescriptor) it.next()).m();
                Intrinsics.g(typeConstructorM, "getTypeConstructor(...)");
                arrayList.add(typeConstructorM);
            }
            List upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.g(upperBounds, "getUpperBounds(...)");
            return a(arrayList, upperBounds, DescriptorUtilsKt.e(typeParameterDescriptor));
        }
        if (!(declarationDescriptorE instanceof FunctionDescriptor)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((FunctionDescriptor) declarationDescriptorE).getTypeParameters();
        Intrinsics.g(typeParameters, "getTypeParameters(...)");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            TypeConstructor typeConstructorM2 = ((TypeParameterDescriptor) it2.next()).m();
            Intrinsics.g(typeConstructorM2, "getTypeConstructor(...)");
            arrayList2.add(typeConstructorM2);
        }
        List upperBounds2 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.g(upperBounds2, "getUpperBounds(...)");
        return a(arrayList2, upperBounds2, DescriptorUtilsKt.e(typeParameterDescriptor));
    }
}
