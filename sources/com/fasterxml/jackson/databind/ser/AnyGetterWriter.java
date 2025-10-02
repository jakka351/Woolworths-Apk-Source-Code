package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public class AnyGetterWriter {

    /* renamed from: a, reason: collision with root package name */
    public final BeanProperty.Std f14301a;
    public final AnnotatedMember b;
    public JsonSerializer c;
    public MapSerializer d;

    public AnyGetterWriter(BeanProperty.Std std, AnnotatedMember annotatedMember, JsonSerializer jsonSerializer) {
        this.b = annotatedMember;
        this.f14301a = std;
        this.c = jsonSerializer;
        if (jsonSerializer instanceof MapSerializer) {
            this.d = (MapSerializer) jsonSerializer;
        }
    }

    public final void a(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        AnnotatedMember annotatedMember = this.b;
        Object objK = annotatedMember.k(obj);
        if (objK == null) {
            return;
        }
        if (objK instanceof Map) {
            MapSerializer mapSerializer = this.d;
            if (mapSerializer != null) {
                mapSerializer.t((Map) objK, jsonGenerator, serializerProvider);
                return;
            } else {
                this.c.f(objK, jsonGenerator, serializerProvider);
                return;
            }
        }
        serializerProvider.j("Value returned by 'any-getter' " + annotatedMember.d() + "() not java.util.Map but " + objK.getClass().getName());
        throw null;
    }
}
