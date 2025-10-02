package com.fasterxml.jackson.databind.type;

import androidx.constraintlayout.core.state.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes4.dex */
public class ResolvedRecursiveType extends TypeBase {
    public JavaType m;

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType H(Class cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType I(JavaType javaType) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType J(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType K(JsonDeserializer jsonDeserializer) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType M() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType N(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType O(Object obj) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public final TypeBindings j() {
        JavaType javaType = this.m;
        return javaType != null ? javaType.j() : this.k;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder l(StringBuilder sb) {
        JavaType javaType = this.m;
        return javaType != null ? javaType.l(sb) : sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder m(StringBuilder sb) {
        JavaType javaType = this.m;
        if (javaType != null) {
            return javaType.l(sb);
        }
        sb.append("?");
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public final JavaType q() {
        JavaType javaType = this.m;
        return javaType != null ? javaType.q() : this.i;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final String toString() {
        StringBuilder sbO = a.o(40, "[recursive type; ");
        JavaType javaType = this.m;
        if (javaType == null) {
            sbO.append("UNRESOLVED");
        } else {
            sbO.append(javaType.d.getName());
        }
        return sbO.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean z() {
        return false;
    }
}
