package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* loaded from: classes.dex */
public interface KotlinJvmBinaryClass {

    public interface AnnotationArgumentVisitor {
        void a();

        AnnotationArgumentVisitor b(ClassId classId, Name name);

        void c(Name name, ClassId classId, Name name2);

        void d(Name name, ClassLiteralValue classLiteralValue);

        void e(Object obj, Name name);

        AnnotationArrayArgumentVisitor f(Name name);
    }

    public interface AnnotationArrayArgumentVisitor {
        void a();

        void b(Object obj);

        AnnotationArgumentVisitor c(ClassId classId);

        void d(ClassId classId, Name name);

        void e(ClassLiteralValue classLiteralValue);
    }

    public interface AnnotationVisitor {
        void a();

        AnnotationArgumentVisitor b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource);
    }

    /* loaded from: classes7.dex */
    public interface MemberVisitor {
    }

    /* loaded from: classes7.dex */
    public interface MethodAnnotationVisitor extends AnnotationVisitor {
    }

    KotlinClassHeader a();

    void b(AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1);

    ClassId c();

    void d(AnnotationVisitor annotationVisitor);

    String getLocation();
}
