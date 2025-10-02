package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public final void j(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object objM = m(serializerProvider);
        if (objM == null) {
            JsonSerializer jsonSerializer = this.p;
            if (jsonSerializer != null) {
                jsonSerializer.f(null, jsonGenerator, serializerProvider);
                return;
            } else {
                jsonGenerator.Y();
                return;
            }
        }
        JsonSerializer jsonSerializerE = this.o;
        if (jsonSerializerE == null) {
            Class<?> cls = objM.getClass();
            PropertySerializerMap propertySerializerMap = this.r;
            JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
            jsonSerializerE = jsonSerializerD == null ? e(propertySerializerMap, cls, serializerProvider) : jsonSerializerD;
        }
        Object obj2 = this.t;
        if (obj2 != null) {
            if (JsonInclude.Include.f == obj2) {
                if (jsonSerializerE.d(serializerProvider, objM)) {
                    l(jsonGenerator, serializerProvider);
                    return;
                }
            } else if (obj2.equals(objM)) {
                l(jsonGenerator, serializerProvider);
                return;
            }
        }
        if (objM == obj && f(jsonGenerator, serializerProvider, jsonSerializerE)) {
            return;
        }
        TypeSerializer typeSerializer = this.q;
        if (typeSerializer == null) {
            jsonSerializerE.f(objM, jsonGenerator, serializerProvider);
        } else {
            jsonSerializerE.g(objM, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public final void k(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object objM = m(serializerProvider);
        SerializedString serializedString = this.f;
        if (objM == null) {
            if (this.p != null) {
                jsonGenerator.T(serializedString);
                this.p.f(null, jsonGenerator, serializerProvider);
                return;
            }
            return;
        }
        JsonSerializer jsonSerializerE = this.o;
        if (jsonSerializerE == null) {
            Class<?> cls = objM.getClass();
            PropertySerializerMap propertySerializerMap = this.r;
            JsonSerializer jsonSerializerD = propertySerializerMap.d(cls);
            jsonSerializerE = jsonSerializerD == null ? e(propertySerializerMap, cls, serializerProvider) : jsonSerializerD;
        }
        Object obj2 = this.t;
        if (obj2 != null) {
            if (JsonInclude.Include.f == obj2) {
                if (jsonSerializerE.d(serializerProvider, objM)) {
                    return;
                }
            } else if (obj2.equals(objM)) {
                return;
            }
        }
        if (objM == obj && f(jsonGenerator, serializerProvider, jsonSerializerE)) {
            return;
        }
        jsonGenerator.T(serializedString);
        TypeSerializer typeSerializer = this.q;
        if (typeSerializer == null) {
            jsonSerializerE.f(objM, jsonGenerator, serializerProvider);
        } else {
            jsonSerializerE.g(objM, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public abstract Object m(SerializerProvider serializerProvider);

    public abstract VirtualBeanPropertyWriter n();
}
