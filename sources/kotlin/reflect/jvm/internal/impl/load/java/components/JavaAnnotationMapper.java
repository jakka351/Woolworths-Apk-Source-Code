package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes7.dex */
public final class JavaAnnotationMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Name f24416a = Name.e("message");
    public static final Name b = Name.e("allowedTargets");
    public static final Name c = Name.e("value");
    public static final Object d = MapsKt.j(new Pair(StandardNames.FqNames.t, JvmAnnotationNames.c), new Pair(StandardNames.FqNames.w, JvmAnnotationNames.d), new Pair(StandardNames.FqNames.x, JvmAnnotationNames.f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static PossiblyExternalAnnotationDescriptor a(FqName kotlinName, JavaAnnotationOwner annotationOwner, LazyJavaResolverContext c2) {
        JavaAnnotation javaAnnotationH;
        Intrinsics.h(kotlinName, "kotlinName");
        Intrinsics.h(annotationOwner, "annotationOwner");
        Intrinsics.h(c2, "c");
        if (kotlinName.equals(StandardNames.FqNames.m)) {
            FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.e;
            Intrinsics.g(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation javaAnnotationH2 = annotationOwner.H(DEPRECATED_ANNOTATION);
            if (javaAnnotationH2 != null) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationH2, c2);
            }
        }
        FqName fqName = (FqName) d.get(kotlinName);
        if (fqName == null || (javaAnnotationH = annotationOwner.H(fqName)) == null) {
            return null;
        }
        return b(c2, javaAnnotationH, false);
    }

    public static PossiblyExternalAnnotationDescriptor b(LazyJavaResolverContext c2, JavaAnnotation annotation, boolean z) {
        Intrinsics.h(annotation, "annotation");
        Intrinsics.h(c2, "c");
        ClassId classIdC = annotation.c();
        FqName TARGET_ANNOTATION = JvmAnnotationNames.c;
        Intrinsics.g(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (classIdC.equals(ClassId.Companion.b(TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(annotation, c2);
        }
        FqName RETENTION_ANNOTATION = JvmAnnotationNames.d;
        Intrinsics.g(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (classIdC.equals(ClassId.Companion.b(RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c2);
        }
        FqName DOCUMENTED_ANNOTATION = JvmAnnotationNames.f;
        Intrinsics.g(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (classIdC.equals(ClassId.Companion.b(DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(c2, annotation, StandardNames.FqNames.x);
        }
        FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.e;
        Intrinsics.g(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (classIdC.equals(ClassId.Companion.b(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c2, annotation, z);
    }
}
