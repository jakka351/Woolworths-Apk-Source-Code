package com.fasterxml.jackson.databind.type;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;

/* loaded from: classes4.dex */
public final class MapType extends MapLikeType {
    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapType(cls, typeBindings, javaType, javaTypeArr, this.m, this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType I(JavaType javaType) {
        if (this.n == javaType) {
            return this;
        }
        return new MapType(this.d, this.k, this.i, this.j, this.m, javaType, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType J(Object obj) {
        return new MapType(this.d, this.k, this.i, this.j, this.m, this.n.N(obj), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType K(JsonDeserializer jsonDeserializer) {
        return new MapType(this.d, this.k, this.i, this.j, this.m, this.n.O(jsonDeserializer), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType N(Object obj) {
        return new MapType(this.d, this.k, this.i, this.j, this.m, this.n, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType O(Object obj) {
        return new MapType(this.d, this.k, this.i, this.j, this.m, this.n, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: R */
    public final MapLikeType J(Object obj) {
        return new MapType(this.d, this.k, this.i, this.j, this.m, this.n.N(obj), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: S */
    public final MapLikeType K(JsonDeserializer jsonDeserializer) {
        return new MapType(this.d, this.k, this.i, this.j, this.m, this.n.O(jsonDeserializer), this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    public final MapLikeType T(JavaType javaType) {
        if (javaType == this.m) {
            return this;
        }
        return new MapType(this.d, this.k, this.i, this.j, javaType, this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    public final MapLikeType U(KeyDeserializer keyDeserializer) {
        return new MapType(this.d, this.k, this.i, this.j, this.m.O(keyDeserializer), this.n, this.f, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: W */
    public final MapLikeType N(Object obj) {
        return new MapType(this.d, this.k, this.i, this.j, this.m, this.n, this.f, obj, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: X */
    public final MapLikeType O(Object obj) {
        return new MapType(this.d, this.k, this.i, this.j, this.m, this.n, obj, this.g, this.h);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final MapType M() {
        if (this.h) {
            return this;
        }
        return new MapType(this.d, this.k, this.i, this.j, this.m.M(), this.n.M(), this.f, this.g, true);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final String toString() {
        StringBuilder sb = new StringBuilder("[map type; class ");
        a.x(this.d, sb, ", ");
        sb.append(this.m);
        sb.append(" -> ");
        sb.append(this.n);
        sb.append("]");
        return sb.toString();
    }
}
