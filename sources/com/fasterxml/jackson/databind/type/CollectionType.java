package com.fasterxml.jackson.databind.type;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes4.dex */
public final class CollectionType extends CollectionLikeType {
    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionType(cls, typeBindings, javaType, javaTypeArr, this.m, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType I(JavaType javaType) {
        if (this.m == javaType) {
            return this;
        }
        return new CollectionType(this.d, this.k, this.i, this.j, javaType, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType J(Object obj) {
        return new CollectionType(this.d, this.k, this.i, this.j, this.m.N(obj), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType K(JsonDeserializer jsonDeserializer) {
        return new CollectionType(this.d, this.k, this.i, this.j, this.m.O(jsonDeserializer), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType N(Object obj) {
        return new CollectionType(this.d, this.k, this.i, this.j, this.m, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType O(Object obj) {
        return new CollectionType(this.d, this.k, this.i, this.j, this.m, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: R */
    public final CollectionLikeType J(Object obj) {
        return new CollectionType(this.d, this.k, this.i, this.j, this.m.N(obj), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: S */
    public final CollectionLikeType K(JsonDeserializer jsonDeserializer) {
        return new CollectionType(this.d, this.k, this.i, this.j, this.m.O(jsonDeserializer), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: U */
    public final CollectionLikeType N(Object obj) {
        return new CollectionType(this.d, this.k, this.i, this.j, this.m, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: V */
    public final CollectionLikeType O(Object obj) {
        return new CollectionType(this.d, this.k, this.i, this.j, this.m, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final CollectionType M() {
        if (this.h) {
            return this;
        }
        return new CollectionType(this.d, this.k, this.i, this.j, this.m.M(), this.f, this.g, true);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final String toString() {
        StringBuilder sb = new StringBuilder("[collection type; class ");
        a.x(this.d, sb, ", contains ");
        sb.append(this.m);
        sb.append("]");
        return sb.toString();
    }
}
