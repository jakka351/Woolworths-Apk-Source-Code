package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes4.dex */
public class BeanAsArraySerializer extends BeanSerializerBase {
    public final BeanSerializerBase o;

    public BeanAsArraySerializer(BeanAsArraySerializer beanAsArraySerializer, Set set, Set set2) {
        super(beanAsArraySerializer, set, set2);
        this.o = beanAsArraySerializer;
    }

    public final void B(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this.h != null) {
            serializerProvider.getClass();
        }
        BeanPropertyWriter[] beanPropertyWriterArr = this.g;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter == null) {
                    jsonGenerator.Y();
                } else {
                    beanPropertyWriter.j(obj, jsonGenerator, serializerProvider);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.n(serializerProvider, e, obj, beanPropertyWriterArr[i].f.d);
            throw null;
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingException.e(obj, beanPropertyWriterArr[i].f.d);
            throw jsonMappingException;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (serializerProvider.d.r(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && this.g.length == 1) {
            B(obj, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.b1(obj);
        B(obj, jsonGenerator, serializerProvider);
        jsonGenerator.F();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (this.l != null) {
            o(obj, jsonGenerator, serializerProvider, typeSerializer);
            return;
        }
        WritableTypeId writableTypeIdQ = q(typeSerializer, obj, JsonToken.START_ARRAY);
        typeSerializer.e(jsonGenerator, writableTypeIdQ);
        jsonGenerator.i(obj);
        B(obj, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdQ);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final JsonSerializer h(NameTransformer nameTransformer) {
        return this.o.h(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase r() {
        return this;
    }

    public final String toString() {
        return "BeanAsArraySerializer for ".concat(this.d.getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase w(Set set, Set set2) {
        return new BeanAsArraySerializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase x(Object obj) {
        return new BeanAsArraySerializer(this, this.l, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase y(ObjectIdWriter objectIdWriter) {
        return this.o.y(objectIdWriter);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase z(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return this;
    }

    public BeanAsArraySerializer(BeanAsArraySerializer beanAsArraySerializer, ObjectIdWriter objectIdWriter, Object obj) {
        super(beanAsArraySerializer, objectIdWriter, obj);
        this.o = beanAsArraySerializer;
    }

    public BeanAsArraySerializer(BeanSerializer beanSerializer) {
        super(beanSerializer, (ObjectIdWriter) null, beanSerializer.j);
        this.o = beanSerializer;
    }
}
