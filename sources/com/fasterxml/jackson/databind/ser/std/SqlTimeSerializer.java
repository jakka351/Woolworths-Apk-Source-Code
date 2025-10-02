package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Time;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class SqlTimeSerializer extends StdScalarSerializer<Time> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.J1(((Time) obj).toString());
    }
}
