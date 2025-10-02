package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object c(DeserializationContext deserializationContext) {
        return new AtomicReference(this.j.c(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public final Object d(DeserializationContext deserializationContext) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return new AtomicReference(this.j.c(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public final Object o0(Object obj) {
        return ((AtomicReference) obj).get();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public final AtomicReference p0(Object obj) {
        return new AtomicReference(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public final AtomicReference q0(Object obj, Object obj2) {
        AtomicReference atomicReference = (AtomicReference) obj;
        atomicReference.set(obj2);
        return atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public final AtomicReferenceDeserializer r0(TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return new AtomicReferenceDeserializer(this.g, this.h, typeDeserializer, jsonDeserializer);
    }
}
