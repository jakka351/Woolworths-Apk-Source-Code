package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import androidx.constraintlayout.core.state.a;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24366a;
    public final KotlinClassHeader b;

    public static final class Factory {
        /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass a(java.lang.Class r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                java.lang.String r0 = "klass"
                kotlin.jvm.internal.Intrinsics.h(r14, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor
                r0.<init>()
                r1 = 0
                r0.f24479a = r1
                r0.b = r1
                r2 = 0
                r0.c = r2
                r0.d = r1
                r0.e = r1
                r0.f = r1
                r0.g = r1
                r0.h = r1
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.b(r14, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass r3 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion.g
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r5 = r0.g
                if (r5 == 0) goto L73
                int[] r5 = r0.f24479a
                if (r5 != 0) goto L2c
                goto L73
            L2c:
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r8 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion
                int[] r5 = r0.f24479a
                int r6 = r0.c
                r6 = r6 & 8
                if (r6 == 0) goto L37
                r2 = 1
            L37:
                r8.<init>(r5, r2)
                boolean r2 = r8.b(r4)
                if (r2 != 0) goto L47
                java.lang.String[] r2 = r0.d
                r0.f = r2
                r0.d = r1
                goto L5a
            L47:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = r0.g
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.h
                if (r2 == r4) goto L55
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.i
                if (r2 == r4) goto L55
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.l
                if (r2 != r4) goto L5a
            L55:
                java.lang.String[] r2 = r0.d
                if (r2 != 0) goto L5a
                goto L73
            L5a:
                java.lang.String[] r2 = r0.h
                if (r2 == 0) goto L61
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.a(r2)
            L61:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r6 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r7 = r0.g
                java.lang.String[] r9 = r0.d
                java.lang.String[] r10 = r0.f
                java.lang.String[] r11 = r0.e
                java.lang.String r12 = r0.b
                int r13 = r0.c
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                goto L74
            L73:
                r6 = r1
            L74:
                if (r6 != 0) goto L77
                return r1
            L77:
                r3.<init>(r14, r6)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass.Factory.a(java.lang.Class):kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass");
        }
    }

    public ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader) {
        this.f24366a = cls;
        this.b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final KotlinClassHeader a() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final void b(AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class klass = this.f24366a;
        Intrinsics.h(klass, "klass");
        Iterator itA = ArrayIteratorKt.a(klass.getDeclaredMethods());
        while (true) {
            if (!itA.hasNext()) {
                break;
            }
            Method method = (Method) itA.next();
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.AnnotationVisitorForMethod annotationVisitorForMethodB = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.b(Name.e(method.getName()), SignatureSerializer.c(method));
            Iterator itA2 = ArrayIteratorKt.a(method.getDeclaredAnnotations());
            while (itA2.hasNext()) {
                Annotation annotation = (Annotation) itA2.next();
                Intrinsics.e(annotation);
                ReflectClassStructure.c(annotationVisitorForMethodB, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.g(parameterAnnotations, "getParameterAnnotations(...)");
            Annotation[][] annotationArr = parameterAnnotations;
            int length = annotationArr.length;
            for (int i = 0; i < length; i++) {
                Iterator itA3 = ArrayIteratorKt.a(annotationArr[i]);
                while (itA3.hasNext()) {
                    Annotation annotation2 = (Annotation) itA3.next();
                    Class clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation2));
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorC = annotationVisitorForMethodB.c(i, ReflectClassUtilKt.a(clsB), new ReflectAnnotationSource(annotation2));
                    if (annotationArgumentVisitorC != null) {
                        ReflectClassStructure.d(annotationArgumentVisitorC, annotation2, clsB);
                    }
                }
            }
            annotationVisitorForMethodB.a();
        }
        Iterator itA4 = ArrayIteratorKt.a(klass.getDeclaredConstructors());
        while (itA4.hasNext()) {
            Constructor constructor = (Constructor) itA4.next();
            Name name = SpecialNames.e;
            Intrinsics.e(constructor);
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.AnnotationVisitorForMethod annotationVisitorForMethodB2 = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.b(name, SignatureSerializer.a(constructor));
            Iterator itA5 = ArrayIteratorKt.a(constructor.getDeclaredAnnotations());
            while (itA5.hasNext()) {
                Annotation annotation3 = (Annotation) itA5.next();
                Intrinsics.e(annotation3);
                ReflectClassStructure.c(annotationVisitorForMethodB2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            Intrinsics.e(parameterAnnotations2);
            if (parameterAnnotations2.length != 0) {
                int length2 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length3 = parameterAnnotations2.length;
                for (int i2 = 0; i2 < length3; i2++) {
                    Iterator itA6 = ArrayIteratorKt.a(parameterAnnotations2[i2]);
                    while (itA6.hasNext()) {
                        Annotation annotation4 = (Annotation) itA6.next();
                        Class clsB2 = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation4));
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorC2 = annotationVisitorForMethodB2.c(i2 + length2, ReflectClassUtilKt.a(clsB2), new ReflectAnnotationSource(annotation4));
                        if (annotationArgumentVisitorC2 != null) {
                            ReflectClassStructure.d(annotationArgumentVisitorC2, annotation4, clsB2);
                        }
                    }
                }
            }
            annotationVisitorForMethodB2.a();
        }
        Iterator itA7 = ArrayIteratorKt.a(klass.getDeclaredFields());
        while (itA7.hasNext()) {
            Field field = (Field) itA7.next();
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.MemberAnnotationVisitor memberAnnotationVisitorA = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.a(Name.e(field.getName()), SignatureSerializer.b(field));
            Iterator itA8 = ArrayIteratorKt.a(field.getDeclaredAnnotations());
            while (itA8.hasNext()) {
                Annotation annotation5 = (Annotation) itA8.next();
                Intrinsics.e(annotation5);
                ReflectClassStructure.c(memberAnnotationVisitorA, annotation5);
            }
            memberAnnotationVisitorA.a();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final ClassId c() {
        return ReflectClassUtilKt.a(this.f24366a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final void d(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ReflectClassStructure.b(this.f24366a, annotationVisitor);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectKotlinClass) {
            return Intrinsics.c(this.f24366a, ((ReflectKotlinClass) obj).f24366a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final String getLocation() {
        return StringsKt.R(this.f24366a.getName(), JwtParser.SEPARATOR_CHAR, '/').concat(".class");
    }

    public final int hashCode() {
        return this.f24366a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a.x(ReflectKotlinClass.class, sb, ": ");
        sb.append(this.f24366a);
        return sb.toString();
    }
}
