package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes.dex */
final class ReflectClassStructure {
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    public static ClassLiteralValue a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            Intrinsics.g(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new ClassLiteralValue(ClassId.Companion.b(StandardNames.FqNames.d.g()), i);
            }
            PrimitiveType primitiveTypeD = JvmPrimitiveType.b(cls.getName()).d();
            Intrinsics.g(primitiveTypeD, "getPrimitiveType(...)");
            return i > 0 ? new ClassLiteralValue(ClassId.Companion.b((FqName) primitiveTypeD.g.getD()), i - 1) : new ClassLiteralValue(ClassId.Companion.b((FqName) primitiveTypeD.f.getD()), i);
        }
        ClassId classIdA = ReflectClassUtilKt.a(cls);
        String str = JavaToKotlinClassMap.f24321a;
        FqName fqName = classIdA.a();
        Intrinsics.h(fqName, "fqName");
        ClassId classId = (ClassId) JavaToKotlinClassMap.h.get(fqName.f24500a);
        if (classId != null) {
            classIdA = classId;
        }
        return new ClassLiteralValue(classIdA, i);
    }

    public static void b(Class klass, KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.h(klass, "klass");
        Iterator itA = ArrayIteratorKt.a(klass.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            Intrinsics.e(annotation);
            c(annotationVisitor, annotation);
        }
        annotationVisitor.a();
    }

    public static void c(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = annotationVisitor.b(ReflectClassUtilKt.a(clsB), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorB != null) {
            d(annotationArgumentVisitorB, annotation, clsB);
        }
    }

    public static void d(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = ArrayIteratorKt.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                Intrinsics.e(objInvoke);
                Name nameE = Name.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    annotationArgumentVisitor.d(nameE, a((Class) objInvoke));
                } else if (ReflectKotlinClassKt.f24368a.contains(enclosingClass)) {
                    annotationArgumentVisitor.e(objInvoke, nameE);
                } else {
                    List list = ReflectClassUtilKt.f24377a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        Intrinsics.e(enclosingClass);
                        annotationArgumentVisitor.c(nameE, ReflectClassUtilKt.a(enclosingClass), Name.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        Intrinsics.g(interfaces, "getInterfaces(...)");
                        Class cls2 = (Class) ArraysKt.d0(interfaces);
                        Intrinsics.e(cls2);
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = annotationArgumentVisitor.b(ReflectClassUtilKt.a(cls2), nameE);
                        if (annotationArgumentVisitorB != null) {
                            d(annotationArgumentVisitorB, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorF = annotationArgumentVisitor.f(nameE);
                        if (annotationArrayArgumentVisitorF != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            int i = 0;
                            if (componentType.isEnum()) {
                                ClassId classIdA = ReflectClassUtilKt.a(componentType);
                                Object[] objArr = (Object[]) objInvoke;
                                int length = objArr.length;
                                while (i < length) {
                                    Object obj = objArr[i];
                                    Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    annotationArrayArgumentVisitorF.d(classIdA, Name.e(((Enum) obj).name()));
                                    i++;
                                }
                            } else if (componentType.equals(Class.class)) {
                                Object[] objArr2 = (Object[]) objInvoke;
                                int length2 = objArr2.length;
                                while (i < length2) {
                                    Object obj2 = objArr2[i];
                                    Intrinsics.f(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    annotationArrayArgumentVisitorF.e(a((Class) obj2));
                                    i++;
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                Object[] objArr3 = (Object[]) objInvoke;
                                int length3 = objArr3.length;
                                while (i < length3) {
                                    Object obj3 = objArr3[i];
                                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorC = annotationArrayArgumentVisitorF.c(ReflectClassUtilKt.a(componentType));
                                    if (annotationArgumentVisitorC != null) {
                                        Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        d(annotationArgumentVisitorC, (Annotation) obj3, componentType);
                                    }
                                    i++;
                                }
                            } else {
                                Object[] objArr4 = (Object[]) objInvoke;
                                int length4 = objArr4.length;
                                while (i < length4) {
                                    annotationArrayArgumentVisitorF.b(objArr4[i]);
                                    i++;
                                }
                            }
                            annotationArrayArgumentVisitorF.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.a();
    }
}
