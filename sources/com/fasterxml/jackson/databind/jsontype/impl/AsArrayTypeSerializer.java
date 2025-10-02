package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* loaded from: classes4.dex */
public class AsArrayTypeSerializer extends TypeSerializerBase {
    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As c() {
        return JsonTypeInfo.As.f;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AsArrayTypeSerializer a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new AsArrayTypeSerializer(this.f14296a, beanProperty);
    }
}
