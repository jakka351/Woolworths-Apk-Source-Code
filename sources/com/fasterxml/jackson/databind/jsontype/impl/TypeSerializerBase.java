package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public abstract class TypeSerializerBase extends TypeSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final TypeIdResolver f14296a;
    public final BeanProperty b;

    public TypeSerializerBase(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        this.f14296a = typeIdResolver;
        this.b = beanProperty;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public String b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public WritableTypeId e(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws JsonGenerationException {
        if (writableTypeId.c == null) {
            Object obj = writableTypeId.f14217a;
            Class cls = writableTypeId.b;
            TypeIdResolver typeIdResolver = this.f14296a;
            writableTypeId.c = cls == null ? typeIdResolver.a(obj) : typeIdResolver.d(cls, obj);
        }
        if (writableTypeId.c == null) {
            return null;
        }
        jsonGenerator.P1(writableTypeId);
        return writableTypeId;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public WritableTypeId f(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) {
        if (writableTypeId == null) {
            return null;
        }
        jsonGenerator.R1(writableTypeId);
        return writableTypeId;
    }
}
