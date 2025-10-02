package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class JavaType extends ResolvedType implements Serializable, Type {
    public final Class d;
    public final int e;
    public final Object f;
    public final Object g;
    public final boolean h;

    public JavaType(Class cls, int i, Object obj, Object obj2, boolean z) {
        this.d = cls;
        this.e = cls.getName().hashCode() + i;
        this.f = obj;
        this.g = obj2;
        this.h = z;
    }

    public final boolean B() {
        Annotation[] annotationArr = ClassUtil.f14330a;
        return Enum.class.isAssignableFrom(this.d);
    }

    public final boolean C() {
        return Modifier.isFinal(this.d.getModifiers());
    }

    public final boolean D() {
        return this.d == Object.class;
    }

    public boolean E() {
        return false;
    }

    public final boolean F(Class cls) {
        Class cls2 = this.d;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean G(Class cls) {
        Class cls2 = this.d;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    public abstract JavaType I(JavaType javaType);

    public abstract JavaType J(Object obj);

    public abstract JavaType K(JsonDeserializer jsonDeserializer);

    public JavaType L(JavaType javaType) {
        Object obj = javaType.g;
        JavaType javaTypeN = obj != this.g ? N(obj) : this;
        Object obj2 = javaType.f;
        return obj2 != this.f ? javaTypeN.O(obj2) : javaTypeN;
    }

    public abstract JavaType M();

    public abstract JavaType N(Object obj);

    public abstract JavaType O(Object obj);

    public abstract JavaType d(int i);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public final JavaType f(int i) {
        JavaType javaTypeD = d(i);
        return javaTypeD == null ? TypeFactory.o() : javaTypeD;
    }

    public final int hashCode() {
        return this.e;
    }

    public abstract JavaType i(Class cls);

    public abstract TypeBindings j();

    public JavaType k() {
        return null;
    }

    public abstract StringBuilder l(StringBuilder sb);

    public abstract StringBuilder m(StringBuilder sb);

    public abstract List n();

    public JavaType o() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public JavaType a() {
        return null;
    }

    public abstract JavaType q();

    public boolean r() {
        return true;
    }

    public boolean s() {
        return e() > 0;
    }

    public boolean t() {
        return (this.g == null && this.f == null) ? false : true;
    }

    public abstract String toString();

    public final boolean u(Class cls) {
        return this.d == cls;
    }

    public boolean w() {
        return Modifier.isAbstract(this.d.getModifiers());
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        Class cls = this.d;
        if ((cls.getModifiers() & 1536) == 0) {
            return true;
        }
        return cls.isPrimitive();
    }

    public abstract boolean z();
}
