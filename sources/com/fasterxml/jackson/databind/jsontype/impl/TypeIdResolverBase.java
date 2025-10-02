package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* loaded from: classes4.dex */
public abstract class TypeIdResolverBase implements TypeIdResolver {

    /* renamed from: a, reason: collision with root package name */
    public final TypeFactory f14295a;
    public final JavaType b;

    public TypeIdResolverBase(JavaType javaType, TypeFactory typeFactory) {
        this.b = javaType;
        this.f14295a = typeFactory;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JavaType c(DeserializationContext deserializationContext, String str) {
        throw new IllegalStateException("Sub-class " + getClass().getName() + " MUST implement `typeFromId(DatabindContext,String)");
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final String e() {
        return d(this.b.d, null);
    }
}
