package com.fasterxml.jackson.databind.type;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes4.dex */
public class SimpleType extends TypeBase {
    public SimpleType(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        super(cls, typeBindings, javaType, javaTypeArr, 0, null, null, false);
    }

    public static SimpleType R(Class cls) {
        return new SimpleType(cls, null, null, null, 0, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType I(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType J(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String Q() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.d;
        sb.append(cls.getName());
        TypeBindings typeBindings = this.k;
        int length = typeBindings.e.length;
        if (length > 0 && cls.getTypeParameters().length == length) {
            sb.append('<');
            for (int i = 0; i < length; i++) {
                JavaType javaTypeD = typeBindings.d(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(javaTypeD.c());
            }
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public SimpleType K(JsonDeserializer jsonDeserializer) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public SimpleType M() {
        return this.h ? this : new SimpleType(this.d, this.k, this.i, this.j, 0, this.f, this.g, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public SimpleType N(Object obj) {
        if (this.g == obj) {
            return this;
        }
        return new SimpleType(this.d, this.k, this.i, this.j, 0, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public SimpleType O(Object obj) {
        if (obj == this.f) {
            return this;
        }
        return new SimpleType(this.d, this.k, this.i, this.j, 0, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj;
        if (simpleType.d != this.d) {
            return false;
        }
        return this.k.equals(simpleType.k);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder l(StringBuilder sb) {
        TypeBase.P(this.d, sb, true);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder m(StringBuilder sb) {
        TypeBase.P(this.d, sb, false);
        TypeBindings typeBindings = this.k;
        int length = typeBindings.e.length;
        if (length > 0) {
            sb.append('<');
            for (int i = 0; i < length; i++) {
                sb = typeBindings.d(i).m(sb);
            }
            sb.append('>');
        }
        sb.append(';');
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean r() {
        return this instanceof ReferenceType;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sbO = a.o(40, "[simple type, class ");
        sbO.append(Q());
        sbO.append(']');
        return sbO.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean z() {
        return false;
    }

    public SimpleType(Class cls) {
        this(cls, TypeBindings.j, null, null);
    }
}
