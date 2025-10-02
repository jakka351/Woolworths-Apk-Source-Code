package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TakeWhileSequence;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TypeParameterUtilsKt {
    public static final PossiblyInnerType a(SimpleType simpleType) {
        ClassifierDescriptor classifierDescriptorC = simpleType.J0().c();
        return b(simpleType, classifierDescriptorC instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorC : null, 0);
    }

    public static final PossiblyInnerType b(SimpleType simpleType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.f(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.u().size() + i;
        if (classifierDescriptorWithTypeParameters.i()) {
            List listSubList = simpleType.H0().subList(i, size);
            DeclarationDescriptor declarationDescriptorE = classifierDescriptorWithTypeParameters.e();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, b(simpleType, declarationDescriptorE instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) declarationDescriptorE : null, size));
        }
        if (size != simpleType.H0().size()) {
            DescriptorUtils.o(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, simpleType.H0().subList(i, simpleType.H0().size()), null);
    }

    public static final List c(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List parameters;
        Object next;
        TypeConstructor typeConstructorM;
        List listU = classifierDescriptorWithTypeParameters.u();
        Intrinsics.g(listU, "getDeclaredTypeParameters(...)");
        if (!classifierDescriptorWithTypeParameters.i() && !(classifierDescriptorWithTypeParameters.e() instanceof CallableDescriptor)) {
            return listU;
        }
        List listX = SequencesKt.x(SequencesKt.j(SequencesKt.g(new TakeWhileSequence(DescriptorUtilsKt.k(classifierDescriptorWithTypeParameters), TypeParameterUtilsKt$$Lambda$0.d), TypeParameterUtilsKt$$Lambda$1.d), TypeParameterUtilsKt$$Lambda$2.d));
        Iterator f24664a = DescriptorUtilsKt.k(classifierDescriptorWithTypeParameters).getF24664a();
        while (true) {
            parameters = null;
            if (!f24664a.hasNext()) {
                next = null;
                break;
            }
            next = f24664a.next();
            if (next instanceof ClassDescriptor) {
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructorM = classDescriptor.m()) != null) {
            parameters = typeConstructorM.getParameters();
        }
        if (parameters == null) {
            parameters = EmptyList.d;
        }
        if (listX.isEmpty() && parameters.isEmpty()) {
            List listU2 = classifierDescriptorWithTypeParameters.u();
            Intrinsics.g(listU2, "getDeclaredTypeParameters(...)");
            return listU2;
        }
        ArrayList arrayListC0 = CollectionsKt.c0(parameters, listX);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListC0, 10));
        Iterator it = arrayListC0.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it.next();
            Intrinsics.e(typeParameterDescriptor);
            arrayList.add(new CapturedTypeParameterDescriptor(typeParameterDescriptor, classifierDescriptorWithTypeParameters, listU.size()));
        }
        return CollectionsKt.c0(arrayList, listU);
    }
}
