package kotlin.reflect.jvm.internal.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SpecialJvmAnnotations {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f24305a;
    public static final ClassId b;

    static {
        List listR = CollectionsKt.R(JvmAnnotationNames.f24408a, JvmAnnotationNames.h, JvmAnnotationNames.i, JvmAnnotationNames.c, JvmAnnotationNames.d, JvmAnnotationNames.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ClassId.Companion.b((FqName) it.next()));
        }
        f24305a = linkedHashSet;
        FqName REPEATABLE_ANNOTATION = JvmAnnotationNames.g;
        Intrinsics.g(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        b = ClassId.Companion.b(REPEATABLE_ANNOTATION);
    }

    public static LinkedHashSet a() {
        return f24305a;
    }

    public static boolean b(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        kotlinJvmBinaryClass.d(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public final void a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
                if (!classId.equals(JvmAbi.b)) {
                    return null;
                }
                booleanRef.d = true;
                return null;
            }
        });
        return booleanRef.d;
    }
}
