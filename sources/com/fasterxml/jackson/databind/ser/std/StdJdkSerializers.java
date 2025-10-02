package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class StdJdkSerializers {

    public static class AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.A(((AtomicBoolean) obj).get());
        }
    }

    public static class AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.d0(((AtomicInteger) obj).get());
        }
    }

    public static class AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.i0(((AtomicLong) obj).get());
        }
    }
}
