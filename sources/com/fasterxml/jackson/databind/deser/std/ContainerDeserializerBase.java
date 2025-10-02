package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> implements ValueInstantiator.Gettable {
    public final JavaType g;
    public final NullValueProvider h;
    public final boolean i;
    public final Boolean j;

    public ContainerDeserializerBase(JavaType javaType, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType);
        this.g = javaType;
        this.j = bool;
        this.h = nullValueProvider;
        this.i = NullsConstantProvider.a(nullValueProvider);
    }

    public static void p0(DeserializationContext deserializationContext, Exception exc, Object obj, String str) throws IOException {
        Exception cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        ClassUtil.E(cause);
        if (deserializationContext != null && !deserializationContext.N(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ClassUtil.G(cause);
        }
        if ((cause instanceof IOException) && !(cause instanceof JsonMappingException)) {
            throw ((IOException) cause);
        }
        if (str == null) {
            str = "N/A";
        }
        int i = JsonMappingException.g;
        throw JsonMappingException.h(cause, new JsonMappingException.Reference(obj, str));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final SettableBeanProperty h(String str) {
        JsonDeserializer jsonDeserializerO0 = o0();
        if (jsonDeserializerO0 != null) {
            return jsonDeserializerO0.h(str);
        }
        throw new IllegalArgumentException(YU.a.j("Cannot handle managed/back reference '", str, "': type: container deserializer of type ", getClass().getName(), " returned null for 'getContentDeserializer()'"));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern i() {
        return AccessPattern.f;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object j(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiatorI0 = i0();
        if (valueInstantiatorI0 == null || !valueInstantiatorI0.j()) {
            deserializationContext.j(String.format("Cannot create empty instance of %s, no default Creator", j0()));
            throw null;
        }
        try {
            return valueInstantiatorI0.y(deserializationContext);
        } catch (IOException e) {
            ClassUtil.D(deserializationContext, e);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType j0() {
        return this.g;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract JsonDeserializer o0();

    /* JADX WARN: Illegal instructions before constructor call */
    public ContainerDeserializerBase(ContainerDeserializerBase containerDeserializerBase, NullValueProvider nullValueProvider, Boolean bool) {
        JavaType javaType = containerDeserializerBase.g;
        super(javaType);
        this.g = javaType;
        this.h = nullValueProvider;
        this.j = bool;
        this.i = NullsConstantProvider.a(nullValueProvider);
    }
}
