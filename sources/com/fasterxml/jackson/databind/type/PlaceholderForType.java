package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes4.dex */
public class PlaceholderForType extends TypeBase {
    public final int m;
    public JavaType n;

    public PlaceholderForType(int i) {
        super(Object.class, TypeBindings.j, TypeFactory.o(), null, 1, null, null, false);
        this.m = i;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        R();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType I(JavaType javaType) {
        R();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType J(Object obj) {
        R();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType K(JsonDeserializer jsonDeserializer) {
        R();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType M() {
        R();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType N(Object obj) {
        R();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType O(Object obj) {
        R();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public final String Q() {
        return toString();
    }

    public final void R() {
        throw new UnsupportedOperationException("Operation should not be attempted on ".concat(getClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder l(StringBuilder sb) {
        sb.append('$');
        sb.append(this.m + 1);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder m(StringBuilder sb) {
        l(sb);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        l(sb);
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean z() {
        return false;
    }
}
