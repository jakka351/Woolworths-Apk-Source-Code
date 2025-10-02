package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectJavaAnnotationOwnerKt {
    public static final ReflectJavaAnnotation a(Annotation[] annotationArr, FqName fqName) {
        Annotation annotation;
        Intrinsics.h(annotationArr, "<this>");
        Intrinsics.h(fqName, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (Intrinsics.c(ReflectClassUtilKt.a(JvmClassMappingKt.b(JvmClassMappingKt.a(annotation))).a(), fqName)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new ReflectJavaAnnotation(annotation);
        }
        return null;
    }

    public static final ArrayList b(Annotation[] annotationArr) {
        Intrinsics.h(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }
}
