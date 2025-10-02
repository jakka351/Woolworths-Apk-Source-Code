package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/* loaded from: classes4.dex */
public interface ContextualSerializer {
    JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty);
}
