package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    public final NameTransformer w;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1, reason: invalid class name */
    class AnonymousClass1 extends JsonFormatVisitorWrapper.Base {
    }

    public UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer.Chained chained, SerializedString serializedString) {
        super(unwrappingBeanPropertyWriter, serializedString);
        this.w = chained;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public final JsonSerializer e(PropertySerializerMap propertySerializerMap, Class cls, SerializerProvider serializerProvider) {
        JavaType javaType = this.j;
        JsonSerializer jsonSerializerX = javaType != null ? serializerProvider.x(serializerProvider.n(javaType, cls), this) : serializerProvider.y(cls, this);
        boolean zE = jsonSerializerX.e();
        NameTransformer chained = this.w;
        if (zE && (jsonSerializerX instanceof UnwrappingBeanSerializer)) {
            chained = new NameTransformer.Chained(chained, ((UnwrappingBeanSerializer) jsonSerializerX).o);
        }
        JsonSerializer jsonSerializerH = jsonSerializerX.h(chained);
        this.r = this.r.c(cls, jsonSerializerH);
        return jsonSerializerH;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public final void h(JsonSerializer jsonSerializer) {
        if (jsonSerializer != null) {
            boolean zE = jsonSerializer.e();
            NameTransformer chained = this.w;
            if (zE && (jsonSerializer instanceof UnwrappingBeanSerializer)) {
                chained = new NameTransformer.Chained(chained, ((UnwrappingBeanSerializer) jsonSerializer).o);
            }
            jsonSerializer = jsonSerializer.h(chained);
        }
        super.h(jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public final BeanPropertyWriter i(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, new NameTransformer.Chained(nameTransformer, this.w), new SerializedString(nameTransformer.b(this.f.d)));
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public final void k(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Method method = this.m;
        Object objInvoke = method == null ? this.n.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            return;
        }
        JsonSerializer jsonSerializerE = this.o;
        if (jsonSerializerE == null) {
            Class<?> cls = objInvoke.getClass();
            PropertySerializerMap propertySerializerMap = this.r;
            JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
            jsonSerializerE = jsonSerializerD == null ? e(propertySerializerMap, cls, serializerProvider) : jsonSerializerD;
        }
        Object obj2 = this.t;
        if (obj2 != null) {
            if (JsonInclude.Include.f == obj2) {
                if (jsonSerializerE.d(serializerProvider, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && f(jsonGenerator, serializerProvider, jsonSerializerE)) {
            return;
        }
        if (!jsonSerializerE.e()) {
            jsonGenerator.T(this.f);
        }
        TypeSerializer typeSerializer = this.q;
        if (typeSerializer == null) {
            jsonSerializerE.f(objInvoke, jsonGenerator, serializerProvider);
        } else {
            jsonSerializerE.g(objInvoke, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter, beanPropertyWriter.f);
        this.w = nameTransformer;
    }
}
