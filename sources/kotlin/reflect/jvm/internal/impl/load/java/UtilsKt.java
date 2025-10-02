package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.FilteringSequence;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final AnnotationDescriptor a(LazyJavaResolverContext lazyJavaResolverContext, JavaWildcardType wildcardType) {
        Object next;
        Intrinsics.h(wildcardType, "wildcardType");
        if (wildcardType.w() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<AnnotationDescriptor> it = new LazyJavaAnnotations(lazyJavaResolverContext, wildcardType, false).iterator();
        loop0: while (true) {
            FilteringSequence.AnonymousClass1 anonymousClass1 = (FilteringSequence.AnonymousClass1) it;
            if (!anonymousClass1.hasNext()) {
                next = null;
                break;
            }
            next = anonymousClass1.next();
            AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) next;
            for (FqName fqName : JavaNullabilityAnnotationSettingsKt.b) {
                if (Intrinsics.c(annotationDescriptor.d(), fqName)) {
                    break loop0;
                }
            }
        }
        return (AnnotationDescriptor) next;
    }

    public static final boolean b(JavaCallableMemberDescriptor javaCallableMemberDescriptor) {
        return (javaCallableMemberDescriptor instanceof FunctionDescriptor) && Intrinsics.c(javaCallableMemberDescriptor.M(JavaMethodDescriptor.K), Boolean.TRUE);
    }

    public static final boolean c(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.h(javaTypeEnhancementState, "javaTypeEnhancementState");
        return JavaTypeEnhancementState$Companion$DEFAULT$1.d.invoke(JavaNullabilityAnnotationSettingsKt.f24402a) == ReportLevel.g;
    }

    public static final DescriptorVisibility d(Visibility visibility) {
        Intrinsics.h(visibility, "<this>");
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) JavaDescriptorVisibilities.d.get(visibility);
        return descriptorVisibility == null ? DescriptorVisibilities.g(visibility) : descriptorVisibility;
    }
}
