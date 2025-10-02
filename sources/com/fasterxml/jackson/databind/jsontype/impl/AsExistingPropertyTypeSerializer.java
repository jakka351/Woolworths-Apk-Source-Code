package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public class AsExistingPropertyTypeSerializer extends AsPropertyTypeSerializer {
    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final TypeSerializer a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new AsExistingPropertyTypeSerializer(this.f14296a, beanProperty, this.c);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final JsonTypeInfo.As c() {
        return JsonTypeInfo.As.h;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer
    /* renamed from: g */
    public final AsArrayTypeSerializer a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new AsExistingPropertyTypeSerializer(this.f14296a, beanProperty, this.c);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer
    /* renamed from: h */
    public final AsPropertyTypeSerializer a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new AsExistingPropertyTypeSerializer(this.f14296a, beanProperty, this.c);
    }
}
