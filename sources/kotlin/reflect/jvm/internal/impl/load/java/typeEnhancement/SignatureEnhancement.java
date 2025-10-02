package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class SignatureEnhancement {

    /* renamed from: a, reason: collision with root package name */
    public final JavaTypeEnhancement f24450a;

    public SignatureEnhancement(JavaTypeEnhancement javaTypeEnhancement) {
        this.f24450a = javaTypeEnhancement;
    }

    public final KotlinType a(JavaCallableMemberDescriptor javaCallableMemberDescriptor, CallableDescriptor callableDescriptor, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1 function1) {
        SignatureParts signatureParts = new SignatureParts(callableDescriptor, z, lazyJavaResolverContext, annotationQualifierApplicabilityType);
        KotlinType kotlinType = (KotlinType) function1.invoke(javaCallableMemberDescriptor);
        Collection collectionQ = javaCallableMemberDescriptor.q();
        Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
        Collection<CallableMemberDescriptor> collection = collectionQ;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Intrinsics.e(callableMemberDescriptor);
            arrayList.add((KotlinType) function1.invoke(callableMemberDescriptor));
        }
        return b(signatureParts, kotlinType, arrayList, typeEnhancementInfo, z2);
    }

    public final KotlinType b(SignatureParts signatureParts, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        Function1 function1A = signatureParts.a(kotlinType, list, typeEnhancementInfo, z);
        boolean zP = signatureParts.p();
        Intrinsics.h(kotlinType, "<this>");
        return this.f24450a.b(kotlinType.M0(), function1A, 0, zP).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList c(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r24, java.util.Collection r25) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.c(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, java.util.Collection):java.util.ArrayList");
    }

    public final KotlinType d(KotlinType kotlinType, LazyJavaResolverContext context) {
        Intrinsics.h(context, "context");
        KotlinType kotlinTypeB = b(new SignatureParts(null, false, context, AnnotationQualifierApplicabilityType.h, true), kotlinType, EmptyList.d, null, false);
        return kotlinTypeB == null ? kotlinType : kotlinTypeB;
    }

    public final ArrayList e(LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor, List list, LazyJavaResolverContext context) {
        KotlinType kotlinTypeB;
        Intrinsics.h(context, "context");
        List<KotlinType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (KotlinType kotlinType : list2) {
            if (!TypeUtilsKt.b(kotlinType, SignatureEnhancement$$Lambda$3.d) && (kotlinTypeB = b(new SignatureParts(lazyJavaTypeParameterDescriptor, false, context, AnnotationQualifierApplicabilityType.i), kotlinType, EmptyList.d, null, false)) != null) {
                kotlinType = kotlinTypeB;
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }
}
