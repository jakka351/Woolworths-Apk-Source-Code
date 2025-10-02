package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes4.dex */
public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    public final NameTransformer o;

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, ObjectIdWriter objectIdWriter, Object obj) {
        super(unwrappingBeanSerializer, objectIdWriter, obj);
        this.o = unwrappingBeanSerializer.o;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.i(obj);
        if (this.l != null) {
            p(obj, jsonGenerator, serializerProvider, false);
        } else if (this.j == null) {
            t(obj, jsonGenerator, serializerProvider);
        } else {
            u(obj, jsonGenerator, serializerProvider);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        if (serializerProvider.d.r(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            serializerProvider.i(this.d, "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
            throw null;
        }
        jsonGenerator.i(obj);
        if (this.l != null) {
            o(obj, jsonGenerator, serializerProvider, typeSerializer);
        } else if (this.j == null) {
            t(obj, jsonGenerator, serializerProvider);
        } else {
            u(obj, jsonGenerator, serializerProvider);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final JsonSerializer h(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase r() {
        return this;
    }

    public final String toString() {
        return "UnwrappingBeanSerializer for ".concat(this.d.getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase w(Set set, Set set2) {
        return new UnwrappingBeanSerializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase x(Object obj) {
        return new UnwrappingBeanSerializer(this, this.l, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase y(ObjectIdWriter objectIdWriter) {
        return new UnwrappingBeanSerializer(this, objectIdWriter);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase z(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new UnwrappingBeanSerializer(this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set set, Set set2) {
        super(unwrappingBeanSerializer, set, set2);
        this.o = unwrappingBeanSerializer.o;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(unwrappingBeanSerializer, beanPropertyWriterArr, beanPropertyWriterArr2);
        this.o = unwrappingBeanSerializer.o;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, ObjectIdWriter objectIdWriter) {
        super(unwrappingBeanSerializer, objectIdWriter, unwrappingBeanSerializer.j);
        this.o = unwrappingBeanSerializer.o;
    }

    public UnwrappingBeanSerializer(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        super(beanSerializerBase, BeanSerializerBase.s(beanSerializerBase.g, nameTransformer), BeanSerializerBase.s(beanSerializerBase.h, nameTransformer));
        this.o = nameTransformer;
    }
}
