package com.auth0.jwt.impl;

import com.auth0.jwt.impl.ClaimsHolder;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes4.dex */
public class ClaimsSerializer<T extends ClaimsHolder> extends StdSerializer<T> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.p1();
        ((ClaimsHolder) obj).getClass();
        throw null;
    }
}
