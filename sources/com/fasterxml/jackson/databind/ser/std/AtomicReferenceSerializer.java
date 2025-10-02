package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class AtomicReferenceSerializer extends ReferenceTypeSerializer<AtomicReference<?>> {
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public final Object p(Object obj) {
        return ((AtomicReference) obj).get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public final Object q(Object obj) {
        return ((AtomicReference) obj).get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public final boolean r(Object obj) {
        return ((AtomicReference) obj).get() != null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public final AtomicReferenceSerializer s(Object obj, boolean z) {
        return new AtomicReferenceSerializer(this, this.g, this.h, this.i, this.j, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public final AtomicReferenceSerializer t(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, NameTransformer nameTransformer) {
        return new AtomicReferenceSerializer(this, beanProperty, typeSerializer, jsonSerializer, nameTransformer, this.l, this.m);
    }
}
