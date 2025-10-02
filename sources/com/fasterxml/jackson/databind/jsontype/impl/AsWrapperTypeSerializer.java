package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

/* loaded from: classes4.dex */
public class AsWrapperTypeSerializer extends TypeSerializerBase {
    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final TypeSerializer a(BeanProperty beanProperty) {
        return this.b == beanProperty ? this : new AsWrapperTypeSerializer(this.f14296a, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public final JsonTypeInfo.As c() {
        return JsonTypeInfo.As.e;
    }
}
