package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

/* loaded from: classes4.dex */
public class AsPropertyTypeSerializer extends AsArrayTypeSerializer {
    public final String c;

    public AsPropertyTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty);
        this.c = str;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final String b() {
        return this.c;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AsPropertyTypeSerializer a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new AsPropertyTypeSerializer(this.f14296a, beanProperty, this.c);
    }
}
