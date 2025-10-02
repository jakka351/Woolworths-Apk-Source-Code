package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;

/* loaded from: classes4.dex */
public interface NullValueProvider {
    Object c(DeserializationContext deserializationContext);

    default Object d(DeserializationContext deserializationContext) {
        return c(deserializationContext);
    }
}
