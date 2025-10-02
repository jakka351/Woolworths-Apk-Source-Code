package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ValueClassAwareCallerKt {
    public static final Object a(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeC;
        Class clsH;
        return (((callableMemberDescriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.e((VariableDescriptor) callableMemberDescriptor)) || (kotlinTypeC = c(callableMemberDescriptor)) == null || (clsH = h(kotlinTypeC)) == null) ? obj : d(clsH, callableMemberDescriptor).invoke(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.calls.Caller b(kotlin.reflect.jvm.internal.calls.Caller r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4, boolean r5) {
        /*
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.h(r4, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.a(r4)
            if (r0 != 0) goto L97
            java.util.List r0 = r4.A0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L26
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L26
            goto L44
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) r1
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.g(r1)
            if (r1 == 0) goto L2a
            goto L97
        L44:
            java.util.List r0 = r4.h()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L5d
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5d
            goto L7b
        L5d:
            java.util.Iterator r0 = r0.iterator()
        L61:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r1
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.g(r1)
            if (r1 == 0) goto L61
            goto L97
        L7b:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r4.getReturnType()
            r1 = 1
            if (r0 == 0) goto L89
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.c(r0)
            if (r0 != r1) goto L89
            goto L97
        L89:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = c(r4)
            if (r0 == 0) goto L96
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.g(r0)
            if (r0 != r1) goto L96
            goto L97
        L96:
            return r3
        L97:
            kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller r0 = new kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller
            r0.<init>(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.b(kotlin.reflect.jvm.internal.calls.Caller, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):kotlin.reflect.jvm.internal.calls.Caller");
    }

    public static final KotlinType c(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorE0 = callableMemberDescriptor.e0();
        ReceiverParameterDescriptor receiverParameterDescriptorC0 = callableMemberDescriptor.c0();
        if (receiverParameterDescriptorE0 != null) {
            return receiverParameterDescriptorE0.getType();
        }
        if (receiverParameterDescriptorC0 != null) {
            if (callableMemberDescriptor instanceof ConstructorDescriptor) {
                return receiverParameterDescriptorC0.getType();
            }
            DeclarationDescriptor declarationDescriptorE = callableMemberDescriptor.e();
            ClassDescriptor classDescriptor = declarationDescriptorE instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorE : null;
            if (classDescriptor != null) {
                return classDescriptor.t();
            }
        }
        return null;
    }

    public static final Method d(Class cls, CallableMemberDescriptor descriptor) throws NoSuchMethodException, SecurityException {
        Intrinsics.h(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            Intrinsics.e(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final ArrayList e(SimpleType simpleType) {
        ArrayList arrayListF = f(TypeSubstitutionKt.a(simpleType));
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListF, 10));
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor classifierDescriptorC = simpleType.J0().c();
        Intrinsics.f(classifierDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsK = UtilKt.k((ClassDescriptor) classifierDescriptorC);
        Intrinsics.e(clsK);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final ArrayList f(SimpleType simpleType) {
        ?? Q;
        if (!InlineClassesUtilsKt.h(simpleType)) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorC = simpleType.J0().c();
        Intrinsics.f(classifierDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i = DescriptorUtilsKt.f24544a;
        ValueClassRepresentation valueClassRepresentationF0 = ((ClassDescriptor) classifierDescriptorC).f0();
        MultiFieldValueClassRepresentation multiFieldValueClassRepresentation = valueClassRepresentationF0 instanceof MultiFieldValueClassRepresentation ? (MultiFieldValueClassRepresentation) valueClassRepresentationF0 : null;
        Intrinsics.e(multiFieldValueClassRepresentation);
        ArrayList<Pair> arrayList = multiFieldValueClassRepresentation.f24337a;
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.d;
            ArrayList arrayListF = f((SimpleType) pair.e);
            if (arrayListF != null) {
                Q = new ArrayList(CollectionsKt.s(arrayListF, 10));
                Iterator it = arrayListF.iterator();
                while (it.hasNext()) {
                    Q.add(name.c() + '-' + ((String) it.next()));
                }
            } else {
                Q = CollectionsKt.Q(name.c());
            }
            CollectionsKt.h((Iterable) Q, arrayList2);
        }
        return arrayList2;
    }

    public static final Class g(DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.b(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class clsK = UtilKt.k(classDescriptor);
        if (clsK != null) {
            return clsK;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.f((ClassifierDescriptor) declarationDescriptor) + ')');
    }

    public static final Class h(KotlinType kotlinType) {
        SimpleType simpleTypeI;
        Class clsG = g(kotlinType.J0().c());
        if (clsG == null) {
            return null;
        }
        if (TypeUtils.f(kotlinType) && ((simpleTypeI = InlineClassesUtilsKt.i(kotlinType)) == null || TypeUtils.f(simpleTypeI) || KotlinBuiltIns.H(simpleTypeI))) {
            return null;
        }
        return clsG;
    }

    public static final String i(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        ClassId classIdF = DescriptorUtilsKt.f(classifierDescriptorWithTypeParameters);
        Intrinsics.e(classIdF);
        return ClassMapperLite.b(classIdF.b());
    }
}
