package com.fasterxml.jackson.databind.type;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Objects;

/* loaded from: classes4.dex */
public class ReferenceType extends SimpleType {
    public final JavaType m;
    public final JavaType n;

    public ReferenceType(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, Objects.hashCode(javaType2), obj, obj2, z);
        this.m = javaType2;
        this.n = javaType3 == null ? this : javaType3;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new ReferenceType(cls, this.k, javaType, javaTypeArr, this.m, this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType I(JavaType javaType) {
        if (this.m == javaType) {
            return this;
        }
        return new ReferenceType(this.d, this.k, this.i, this.j, javaType, this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType J(Object obj) {
        JavaType javaType = this.m;
        if (obj == javaType.g) {
            return this;
        }
        return new ReferenceType(this.d, this.k, this.i, this.j, javaType.N(obj), this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType N(Object obj) {
        if (obj == this.g) {
            return this;
        }
        return new ReferenceType(this.d, this.k, this.i, this.j, this.m, this.n, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType O(Object obj) {
        if (obj == this.f) {
            return this;
        }
        return new ReferenceType(this.d, this.k, this.i, this.j, this.m, this.n, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.type.TypeBase
    public final String Q() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.d;
        sb.append(cls.getName());
        JavaType javaType = this.m;
        if (javaType != null && cls.getTypeParameters().length == 1) {
            sb.append('<');
            sb.append(javaType.c());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* renamed from: U */
    public final SimpleType N(Object obj) {
        if (obj == this.g) {
            return this;
        }
        return new ReferenceType(this.d, this.k, this.i, this.j, this.m, this.n, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* renamed from: V */
    public final SimpleType O(Object obj) {
        if (obj == this.f) {
            return this;
        }
        return new ReferenceType(this.d, this.k, this.i, this.j, this.m, this.n, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final ReferenceType K(JsonDeserializer jsonDeserializer) {
        JavaType javaType = this.m;
        if (jsonDeserializer == javaType.f) {
            return this;
        }
        return new ReferenceType(this.d, this.k, this.i, this.j, javaType.O(jsonDeserializer), this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final ReferenceType M() {
        if (this.h) {
            return this;
        }
        return new ReferenceType(this.d, this.k, this.i, this.j, this.m.M(), this.n, this.f, this.g, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.core.type.ResolvedType
    public final JavaType a() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.core.type.ResolvedType
    public final boolean b() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        ReferenceType referenceType = (ReferenceType) obj;
        if (referenceType.d != this.d) {
            return false;
        }
        return this.m.equals(referenceType.m);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType k() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final StringBuilder l(StringBuilder sb) {
        TypeBase.P(this.d, sb, true);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final StringBuilder m(StringBuilder sb) {
        TypeBase.P(this.d, sb, false);
        sb.append('<');
        StringBuilder sbM = this.m.m(sb);
        sbM.append(">;");
        return sbM;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: p */
    public final JavaType a() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final String toString() {
        StringBuilder sbO = a.o(40, "[reference type, class ");
        sbO.append(Q());
        sbO.append('<');
        sbO.append(this.m);
        sbO.append(">]");
        return sbO.toString();
    }
}
