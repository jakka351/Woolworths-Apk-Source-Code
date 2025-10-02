package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;

/* loaded from: classes4.dex */
public class BeanSerializer extends BeanSerializerBase {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this.l != null) {
            jsonGenerator.i(obj);
            p(obj, jsonGenerator, serializerProvider, true);
            return;
        }
        jsonGenerator.x1(obj);
        if (this.j != null) {
            u(obj, jsonGenerator, serializerProvider);
            throw null;
        }
        t(obj, jsonGenerator, serializerProvider);
        jsonGenerator.H();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final JsonSerializer h(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase r() {
        return (this.l == null && this.i == null && this.j == null) ? new BeanAsArraySerializer(this) : this;
    }

    public final String toString() {
        return "BeanSerializer for ".concat(this.d.getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase w(Set set, Set set2) {
        return new BeanSerializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase x(Object obj) {
        return new BeanSerializer(this, this.l, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase y(ObjectIdWriter objectIdWriter) {
        return new BeanSerializer(this, objectIdWriter, this.j);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public final BeanSerializerBase z(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new BeanSerializer(this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }
}
