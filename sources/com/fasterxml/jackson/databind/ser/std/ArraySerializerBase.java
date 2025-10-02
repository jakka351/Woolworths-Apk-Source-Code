package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class ArraySerializerBase<T> extends ContainerSerializer<T> implements ContextualSerializer {
    public final BeanProperty f;
    public final Boolean g;

    public ArraySerializerBase(Class cls) {
        super(cls);
        this.f = null;
        this.g = null;
    }

    public JsonSerializer b(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonFormat.Value valueK;
        if (beanProperty != null && (valueK = StdSerializer.k(serializerProvider, beanProperty, this.d)) != null) {
            Boolean boolB = valueK.b(JsonFormat.Feature.f);
            if (!Objects.equals(boolB, this.g)) {
                return r(beanProperty, boolB);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (q(serializerProvider) && p(obj)) {
            s(obj, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.b1(obj);
        s(obj, jsonGenerator, serializerProvider);
        jsonGenerator.F();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void g(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writableTypeIdE = typeSerializer.e(jsonGenerator, typeSerializer.d(JsonToken.START_ARRAY, obj));
        jsonGenerator.i(obj);
        s(obj, jsonGenerator, serializerProvider);
        typeSerializer.f(jsonGenerator, writableTypeIdE);
    }

    public final boolean q(SerializerProvider serializerProvider) {
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return serializerProvider.d.r(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    }

    public abstract JsonSerializer r(BeanProperty beanProperty, Boolean bool);

    public abstract void s(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public ArraySerializerBase(ArraySerializerBase arraySerializerBase, BeanProperty beanProperty, Boolean bool) {
        super(arraySerializerBase.d, 0);
        this.f = beanProperty;
        this.g = bool;
    }
}
