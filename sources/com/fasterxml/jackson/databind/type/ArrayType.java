package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public final class ArrayType extends TypeBase {
    public static final /* synthetic */ int o = 0;
    public final JavaType m;
    public final Object n;

    public ArrayType(JavaType javaType, TypeBindings typeBindings, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), typeBindings, null, null, javaType.e, obj2, obj3, z);
        this.m = javaType;
        this.n = obj;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType I(JavaType javaType) throws NegativeArraySizeException {
        return new ArrayType(javaType, this.k, Array.newInstance((Class<?>) javaType.d, 0), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType J(Object obj) {
        JavaType javaType = this.m;
        if (obj == javaType.g) {
            return this;
        }
        return new ArrayType(javaType.N(obj), this.k, this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType K(JsonDeserializer jsonDeserializer) {
        JavaType javaType = this.m;
        if (jsonDeserializer == javaType.f) {
            return this;
        }
        return new ArrayType(javaType.O(jsonDeserializer), this.k, this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType M() {
        if (this.h) {
            return this;
        }
        return new ArrayType(this.m.M(), this.k, this.n, this.f, this.g, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType N(Object obj) {
        if (obj == this.g) {
            return this;
        }
        return new ArrayType(this.m, this.k, this.n, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType O(Object obj) {
        if (obj == this.f) {
            return this;
        }
        return new ArrayType(this.m, this.k, this.n, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == ArrayType.class) {
            return this.m.equals(((ArrayType) obj).m);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType k() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder l(StringBuilder sb) {
        sb.append('[');
        return this.m.l(sb);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder m(StringBuilder sb) {
        sb.append('[');
        return this.m.m(sb);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean s() {
        return this.m.s();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean t() {
        return super.t() || this.m.t();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final String toString() {
        return "[array type, component type: " + this.m + "]";
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean w() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean y() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean z() {
        return true;
    }
}
