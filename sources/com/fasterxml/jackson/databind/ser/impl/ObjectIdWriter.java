package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;

/* loaded from: classes4.dex */
public final class ObjectIdWriter {

    /* renamed from: a, reason: collision with root package name */
    public final JavaType f14308a;
    public final SerializableString b;
    public final ObjectIdGenerator c;
    public final JsonSerializer d;
    public final boolean e;

    public ObjectIdWriter(JavaType javaType, SerializableString serializableString, ObjectIdGenerator objectIdGenerator, JsonSerializer jsonSerializer, boolean z) {
        this.f14308a = javaType;
        this.b = serializableString;
        this.c = objectIdGenerator;
        this.d = jsonSerializer;
        this.e = z;
    }

    public static ObjectIdWriter a(JavaType javaType, PropertyName propertyName, ObjectIdGenerator objectIdGenerator, boolean z) {
        String str = propertyName == null ? null : propertyName.d;
        return new ObjectIdWriter(javaType, str != null ? new SerializedString(str) : null, objectIdGenerator, null, z);
    }
}
