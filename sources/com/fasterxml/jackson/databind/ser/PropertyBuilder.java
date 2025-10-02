package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

/* loaded from: classes4.dex */
public class PropertyBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final SerializationConfig f14304a;
    public final BeanDescription b;
    public final AnnotationIntrospector c;
    public Object d;
    public final JsonInclude.Value e;
    public final boolean f;

    /* renamed from: com.fasterxml.jackson.databind.ser.PropertyBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14305a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f14305a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14305a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14305a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14305a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14305a[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14305a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this.f14304a = serializationConfig;
        this.b = beanDescription;
        JsonInclude.Value valueA = JsonInclude.Value.h;
        JsonInclude.Value valueK = beanDescription.k(valueA);
        serializationConfig.e(beanDescription.f14226a.d);
        valueA = valueK != null ? valueK.a(valueA) : valueA;
        JsonInclude.Value value = serializationConfig.j.d;
        this.e = value == null ? valueA : value.a(valueA);
        this.f = valueA.d == JsonInclude.Include.g;
        this.c = serializationConfig.d();
    }

    public final JavaType a(AnnotatedMember annotatedMember, boolean z, JavaType javaType) {
        SerializationConfig serializationConfig = this.f14304a;
        AnnotationIntrospector annotationIntrospector = this.c;
        JavaType javaTypeU0 = annotationIntrospector.u0(serializationConfig, annotatedMember, javaType);
        if (javaTypeU0 != javaType) {
            Class<?> cls = javaTypeU0.d;
            Class<?> cls2 = javaType.d;
            if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + annotatedMember.d() + "': class " + cls.getName() + " not a super-type of (declared) class " + cls2.getName());
            }
            javaType = javaTypeU0;
            z = true;
        }
        JsonSerialize.Typing typingW = annotationIntrospector.W(annotatedMember);
        if (typingW != null && typingW != JsonSerialize.Typing.f) {
            z = typingW == JsonSerialize.Typing.e;
        }
        if (z) {
            return javaType.M();
        }
        return null;
    }
}
