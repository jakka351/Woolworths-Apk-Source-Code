package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes4.dex */
public interface ContextualDeserializer {
    JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty);
}
