package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

/* loaded from: classes4.dex */
public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer {
    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final TypeDeserializer f(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsExternalTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final JsonTypeInfo.As j() {
        return JsonTypeInfo.As.g;
    }
}
