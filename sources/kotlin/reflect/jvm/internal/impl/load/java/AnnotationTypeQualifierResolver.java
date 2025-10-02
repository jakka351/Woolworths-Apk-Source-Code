package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnnotationTypeQualifierResolver extends AbstractAnnotationTypeQualifierResolver<AnnotationDescriptor> {
    public static List m(ConstantValue constantValue) {
        if (!(constantValue instanceof ArrayValue)) {
            return constantValue instanceof EnumValue ? CollectionsKt.Q(((EnumValue) constantValue).c().c()) : EmptyList.d;
        }
        Iterable iterable = (Iterable) ((ArrayValue) constantValue).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.h(m((ConstantValue) it.next()), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final ArrayList a(Object obj, boolean z) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.h(annotationDescriptor, "<this>");
        Map mapB = annotationDescriptor.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapB.entrySet()) {
            CollectionsKt.h((!z || Intrinsics.c((Name) entry.getKey(), JvmAnnotationNames.b)) ? m((ConstantValue) entry.getValue()) : EmptyList.d, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final FqName e(Object obj) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.h(annotationDescriptor, "<this>");
        return annotationDescriptor.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final ClassDescriptor f(Object obj) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.h(annotationDescriptor, "<this>");
        ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(annotationDescriptor);
        Intrinsics.e(classDescriptorD);
        return classDescriptorD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final Iterable g(Object obj) {
        Annotations annotations;
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.h(annotationDescriptor, "<this>");
        ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(annotationDescriptor);
        return (classDescriptorD == null || (annotations = classDescriptorD.getAnnotations()) == null) ? EmptyList.d : annotations;
    }
}
