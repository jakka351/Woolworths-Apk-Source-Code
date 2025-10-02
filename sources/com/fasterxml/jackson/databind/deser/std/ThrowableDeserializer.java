package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes4.dex */
public class ThrowableDeserializer extends BeanDeserializer {
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer
    public final Object P0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this.l != null) {
            return p0(jsonParser, deserializationContext);
        }
        JsonDeserializer jsonDeserializer = this.j;
        ValueInstantiator valueInstantiator = this.i;
        if (jsonDeserializer != null) {
            return valueInstantiator.z(deserializationContext, jsonDeserializer.e(jsonParser, deserializationContext));
        }
        JavaType javaType = this.g;
        boolean zW = javaType.w();
        Class cls = javaType.d;
        if (zW) {
            deserializationContext.z(cls, valueInstantiator, "abstract type (need to add/enable type information?)", new Object[0]);
            throw null;
        }
        boolean zH = valueInstantiator.h();
        boolean zJ = valueInstantiator.j();
        if (!zH && !zJ) {
            deserializationContext.z(cls, valueInstantiator, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
            throw null;
        }
        Throwable th = null;
        Object[] objArr = null;
        Throwable[] thArr = null;
        int i = 0;
        while (!jsonParser.a1(JsonToken.END_OBJECT)) {
            String strD = jsonParser.d();
            BeanPropertyMap beanPropertyMap = this.o;
            SettableBeanProperty settableBeanPropertyG = beanPropertyMap.g(strD);
            jsonParser.N1();
            if (settableBeanPropertyG != null) {
                if (th != null) {
                    settableBeanPropertyG.h(jsonParser, deserializationContext, th);
                } else {
                    if (objArr == null) {
                        int i2 = beanPropertyMap.f;
                        objArr = new Object[i2 + i2];
                    }
                    int i3 = i + 1;
                    objArr[i] = settableBeanPropertyG;
                    i += 2;
                    objArr[i3] = settableBeanPropertyG.g(jsonParser, deserializationContext);
                }
            } else if ("message".equalsIgnoreCase(strD) && zH) {
                th = (Throwable) valueInstantiator.w(deserializationContext, jsonParser.T0());
            } else {
                Set set = this.r;
                if (set != null && set.contains(strD)) {
                    jsonParser.V1();
                } else if ("suppressed".equalsIgnoreCase(strD)) {
                    thArr = (Throwable[]) deserializationContext.R(jsonParser, Throwable[].class);
                } else if ("localizedMessage".equalsIgnoreCase(strD)) {
                    jsonParser.V1();
                } else {
                    SettableAnyProperty settableAnyProperty = this.q;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.c(jsonParser, deserializationContext, th, strD);
                    } else {
                        E0(jsonParser, deserializationContext, th, strD);
                    }
                }
            }
            jsonParser.N1();
        }
        if (th == null) {
            th = zH ? (Throwable) valueInstantiator.w(deserializationContext, null) : (Throwable) valueInstantiator.y(deserializationContext);
        }
        if (objArr != null) {
            for (int i4 = 0; i4 < i; i4 += 2) {
                ((SettableBeanProperty) objArr[i4]).z(th, objArr[i4 + 1]);
            }
        }
        if (thArr != null) {
            for (Throwable th2 : thArr) {
                th.addSuppressed(th2);
            }
        }
        return th;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public final JsonDeserializer p(NameTransformer nameTransformer) {
        return getClass() != ThrowableDeserializer.class ? this : new ThrowableDeserializer(this, nameTransformer);
    }
}
