package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public interface JsonDeserializer<T> {
    Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext);
}
