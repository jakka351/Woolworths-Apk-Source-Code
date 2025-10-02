package com.fasterxml.jackson.databind.type;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes4.dex */
public class CollectionLikeType extends TypeBase {
    public final JavaType m;

    public CollectionLikeType(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.e, obj, obj2, z);
        this.m = javaType2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionLikeType(cls, typeBindings, javaType, javaTypeArr, this.m, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType I(JavaType javaType) {
        if (this.m == javaType) {
            return this;
        }
        return new CollectionLikeType(this.d, this.k, this.i, this.j, javaType, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType L(JavaType javaType) {
        JavaType javaType2;
        JavaType javaTypeL;
        JavaType javaTypeL2 = super.L(javaType);
        JavaType javaTypeK = javaType.k();
        return (javaTypeK == null || (javaTypeL = (javaType2 = this.m).L(javaTypeK)) == javaType2) ? javaTypeL2 : javaTypeL2.I(javaTypeL);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
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

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType J(Object obj) {
        return new CollectionLikeType(this.d, this.k, this.i, this.j, this.m.N(obj), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType K(JsonDeserializer jsonDeserializer) {
        return new CollectionLikeType(this.d, this.k, this.i, this.j, this.m.O(jsonDeserializer), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType M() {
        if (this.h) {
            return this;
        }
        return new CollectionLikeType(this.d, this.k, this.i, this.j, this.m.M(), this.f, this.g, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType N(Object obj) {
        return new CollectionLikeType(this.d, this.k, this.i, this.j, this.m, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType O(Object obj) {
        return new CollectionLikeType(this.d, this.k, this.i, this.j, this.m, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) obj;
        return this.d == collectionLikeType.d && this.m.equals(collectionLikeType.m);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType k() {
        return this.m;
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
        sb.append(">;");
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean t() {
        return super.t() || this.m.t();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public String toString() {
        StringBuilder sb = new StringBuilder("[collection-like type; class ");
        a.x(this.d, sb, ", contains ");
        sb.append(this.m);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean x() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean z() {
        return true;
    }
}
