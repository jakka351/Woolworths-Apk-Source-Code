package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;

/* loaded from: classes4.dex */
public final class WritableObjectId {

    /* renamed from: a, reason: collision with root package name */
    public final ObjectIdGenerator f14317a;
    public Object b;
    public boolean c = false;

    public WritableObjectId(ObjectIdGenerator objectIdGenerator) {
        this.f14317a = objectIdGenerator;
    }

    public final void a(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) throws JsonGenerationException {
        this.c = true;
        if (jsonGenerator.d()) {
            Object obj = this.b;
            jsonGenerator.z0(obj == null ? null : String.valueOf(obj));
            return;
        }
        SerializableString serializableString = objectIdWriter.b;
        if (serializableString != null) {
            jsonGenerator.T(serializableString);
            objectIdWriter.d.f(this.b, jsonGenerator, serializerProvider);
        }
    }

    public final boolean b(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, ObjectIdWriter objectIdWriter) throws JsonGenerationException {
        if (this.b == null) {
            return false;
        }
        if (!this.c && !objectIdWriter.e) {
            return false;
        }
        if (!jsonGenerator.d()) {
            objectIdWriter.d.f(this.b, jsonGenerator, serializerProvider);
            return true;
        }
        String.valueOf(this.b);
        jsonGenerator.B0();
        return true;
    }
}
