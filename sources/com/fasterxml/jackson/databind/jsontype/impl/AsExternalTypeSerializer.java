package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public class AsExternalTypeSerializer extends TypeSerializerBase {
    public final String c;

    public AsExternalTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty);
        this.c = str;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final TypeSerializer a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new AsExternalTypeSerializer(this.f14296a, beanProperty, this.c);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final String b() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final JsonTypeInfo.As c() {
        return JsonTypeInfo.As.g;
    }
}
