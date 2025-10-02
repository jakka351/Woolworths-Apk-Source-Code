package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AnnotationIntrospector implements Versioned, Serializable {

    public static class ReferenceProperty {

        /* renamed from: a, reason: collision with root package name */
        public final Type f14225a;
        public final String b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Type {
            public static final Type d;
            public static final Type e;
            public static final /* synthetic */ Type[] f;

            static {
                Type type = new Type("MANAGED_REFERENCE", 0);
                d = type;
                Type type2 = new Type("BACK_REFERENCE", 1);
                e = type2;
                f = new Type[]{type, type2};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f.clone();
            }
        }

        public ReferenceProperty(Type type, String str) {
            this.f14225a = type;
            this.b = str;
        }
    }

    public interface XmlExtensions {
    }

    public ObjectIdInfo B(Annotated annotated, ObjectIdInfo objectIdInfo) {
        return objectIdInfo;
    }

    public Class C(AnnotatedClass annotatedClass) {
        return null;
    }

    public JsonPOJOBuilder.Value D(AnnotatedClass annotatedClass) {
        return null;
    }

    public JsonProperty.Access E(AnnotatedMember annotatedMember) {
        return null;
    }

    public List F(AnnotatedMember annotatedMember) {
        return null;
    }

    public TypeResolverBuilder G(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public String H(AnnotatedMember annotatedMember) {
        return null;
    }

    public String I(AnnotatedMember annotatedMember) {
        return null;
    }

    public JsonIgnoreProperties.Value J(Annotated annotated) {
        return K(annotated);
    }

    public JsonIgnoreProperties.Value K(Annotated annotated) {
        return JsonIgnoreProperties.Value.i;
    }

    public JsonInclude.Value L(Annotated annotated) {
        return JsonInclude.Value.h;
    }

    public JsonIncludeProperties.Value M(Annotated annotated) {
        return JsonIncludeProperties.Value.e;
    }

    public Integer N(AnnotatedMember annotatedMember) {
        return null;
    }

    public TypeResolverBuilder O(MapperConfig mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        return null;
    }

    public ReferenceProperty P(AnnotatedMember annotatedMember) {
        return null;
    }

    public PropertyName Q() {
        return null;
    }

    public PropertyName R(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object S(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object T(Annotated annotated) {
        return null;
    }

    public String[] U(AnnotatedClass annotatedClass) {
        return null;
    }

    public Boolean V(Annotated annotated) {
        return null;
    }

    public JsonSerialize.Typing W(Annotated annotated) {
        return null;
    }

    public Object X(Annotated annotated) {
        return null;
    }

    public JsonSetter.Value Y(AnnotatedMember annotatedMember) {
        return JsonSetter.Value.f;
    }

    public List Z(Annotated annotated) {
        return null;
    }

    public void a(MapperConfig mapperConfig, AnnotatedClass annotatedClass, ArrayList arrayList) {
    }

    public String a0(AnnotatedClass annotatedClass) {
        return null;
    }

    public VisibilityChecker b(AnnotatedClass annotatedClass, VisibilityChecker visibilityChecker) {
        return visibilityChecker;
    }

    public TypeResolverBuilder b0(JavaType javaType, MapperConfig mapperConfig, AnnotatedClass annotatedClass) {
        return null;
    }

    public Object c(Annotated annotated) {
        return null;
    }

    public NameTransformer c0(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object d(Annotated annotated) {
        return null;
    }

    public Object d0(AnnotatedClass annotatedClass) {
        return null;
    }

    public JsonCreator.Mode e(MapperConfig mapperConfig, Annotated annotated) {
        if (!n0(annotated)) {
            return null;
        }
        JsonCreator.Mode modeF = f(annotated);
        return modeF == null ? JsonCreator.Mode.d : modeF;
    }

    public Class[] e0(Annotated annotated) {
        return null;
    }

    public JsonCreator.Mode f(Annotated annotated) {
        return null;
    }

    public PropertyName f0() {
        return null;
    }

    public Enum g(Class cls) {
        return null;
    }

    public Boolean g0(AnnotatedMember annotatedMember) {
        if ((annotatedMember instanceof AnnotatedMethod) && h0((AnnotatedMethod) annotatedMember)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Object h(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean h0(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public Object i(Annotated annotated) {
        return null;
    }

    public Boolean i0(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object j(Annotated annotated) {
        return null;
    }

    public Boolean j0(AnnotatedMember annotatedMember) {
        return null;
    }

    public void k(Class cls, Enum[] enumArr, String[][] strArr) {
    }

    public String[] l(Class cls, Enum[] enumArr, String[] strArr) {
        return strArr;
    }

    public Boolean l0(AnnotatedMember annotatedMember) {
        if ((annotatedMember instanceof AnnotatedMethod) && m0((AnnotatedMethod) annotatedMember)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Object m(Annotated annotated) {
        return null;
    }

    public boolean m0(AnnotatedMethod annotatedMethod) {
        return false;
    }

    public JsonFormat.Value n(Annotated annotated) {
        return JsonFormat.Value.k;
    }

    public boolean n0(Annotated annotated) {
        return false;
    }

    public String o(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean o0(AnnotatedMember annotatedMember) {
        return false;
    }

    public JacksonInject.Value p(AnnotatedMember annotatedMember) {
        Object objQ = q(annotatedMember);
        if (objQ == null) {
            return null;
        }
        if ("".equals(objQ)) {
            objQ = null;
        }
        return objQ == null ? JacksonInject.Value.f : new JacksonInject.Value(objQ, null);
    }

    public Boolean p0(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object q(AnnotatedMember annotatedMember) {
        return null;
    }

    public boolean q0(Annotation annotation) {
        return false;
    }

    public Object r(Annotated annotated) {
        return null;
    }

    public Boolean r0(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object s(Annotated annotated) {
        return null;
    }

    public Boolean s0(AnnotatedMember annotatedMember) {
        return null;
    }

    public Boolean t(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType t0(MapperConfig mapperConfig, Annotated annotated, JavaType javaType) {
        return javaType;
    }

    public PropertyName u(AnnotatedMember annotatedMember) {
        return null;
    }

    public JavaType u0(MapperConfig mapperConfig, Annotated annotated, JavaType javaType) {
        return javaType;
    }

    public AnnotatedMethod v0(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        return null;
    }

    public PropertyName w(AnnotatedMember annotatedMember) {
        return null;
    }

    public Object x(AnnotatedClass annotatedClass) {
        return null;
    }

    public Object y(AnnotatedMember annotatedMember) {
        return null;
    }

    public ObjectIdInfo z(Annotated annotated) {
        return null;
    }
}
