package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;

/* loaded from: classes4.dex */
public class MapLikeType extends TypeBase {
    public final JavaType m;
    public final JavaType n;

    public MapLikeType(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.e ^ javaType3.e, obj, obj2, z);
        this.m = javaType2;
        this.n = javaType3;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean E() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapLikeType(cls, typeBindings, javaType, javaTypeArr, this.m, this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType I(JavaType javaType) {
        if (this.n == javaType) {
            return this;
        }
        return new MapLikeType(this.d, this.k, this.i, this.j, this.m, javaType, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType L(JavaType javaType) {
        JavaType javaType2;
        JavaType javaTypeL;
        JavaType javaType3;
        JavaType javaTypeL2;
        JavaType javaTypeL3 = super.L(javaType);
        JavaType javaTypeO = javaType.o();
        if ((javaTypeL3 instanceof MapLikeType) && javaTypeO != null && (javaTypeL2 = (javaType3 = this.m).L(javaTypeO)) != javaType3) {
            javaTypeL3 = ((MapLikeType) javaTypeL3).T(javaTypeL2);
        }
        JavaType javaTypeK = javaType.k();
        return (javaTypeK == null || (javaTypeL = (javaType2 = this.n).L(javaTypeK)) == javaType2) ? javaTypeL3 : javaTypeL3.I(javaTypeL);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public final String Q() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.d;
        sb.append(cls.getName());
        JavaType javaType = this.m;
        if (javaType != null && cls.getTypeParameters().length == 2) {
            sb.append('<');
            sb.append(javaType.c());
            sb.append(',');
            sb.append(this.n.c());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public MapLikeType J(Object obj) {
        return new MapLikeType(this.d, this.k, this.i, this.j, this.m, this.n.N(obj), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public MapLikeType K(JsonDeserializer jsonDeserializer) {
        return new MapLikeType(this.d, this.k, this.i, this.j, this.m, this.n.O(jsonDeserializer), this.f, this.g, this.h);
    }

    public MapLikeType T(JavaType javaType) {
        if (javaType == this.m) {
            return this;
        }
        return new MapLikeType(this.d, this.k, this.i, this.j, javaType, this.n, this.f, this.g, this.h);
    }

    public MapLikeType U(KeyDeserializer keyDeserializer) {
        return new MapLikeType(this.d, this.k, this.i, this.j, this.m.O(keyDeserializer), this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public MapLikeType M() {
        if (this.h) {
            return this;
        }
        return new MapLikeType(this.d, this.k, this.i, this.j, this.m, this.n.M(), this.f, this.g, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public MapLikeType N(Object obj) {
        return new MapLikeType(this.d, this.k, this.i, this.j, this.m, this.n, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public MapLikeType O(Object obj) {
        return new MapLikeType(this.d, this.k, this.i, this.j, this.m, this.n, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        MapLikeType mapLikeType = (MapLikeType) obj;
        return this.d == mapLikeType.d && this.m.equals(mapLikeType.m) && this.n.equals(mapLikeType.n);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType k() {
        return this.n;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder l(StringBuilder sb) {
        TypeBase.P(this.d, sb, true);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder m(StringBuilder sb) {
        TypeBase.P(this.d, sb, false);
        sb.append('<');
        this.m.m(sb);
        this.n.m(sb);
        sb.append(">;");
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType o() {
        return this.m;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean t() {
        return super.t() || this.n.t() || this.m.t();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this.d.getName(), this.m, this.n);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean z() {
        return true;
    }
}
