package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.util.EnumSet;
import java.util.Objects;

/* loaded from: classes4.dex */
public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements ContextualDeserializer {
    public final JavaType g;
    public final JsonDeserializer h;
    public final NullValueProvider i;
    public final boolean j;
    public final Boolean k;

    public EnumSetDeserializer(JavaType javaType) {
        super(EnumSet.class);
        this.g = javaType;
        if (!javaType.B()) {
            throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
        }
        this.h = null;
        this.k = null;
        this.i = null;
        this.j = false;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonFormat.Value valueH0 = StdDeserializer.h0(deserializationContext, beanProperty, EnumSet.class);
        Boolean boolB = valueH0 != null ? valueH0.b(JsonFormat.Feature.d) : null;
        JavaType javaType = this.g;
        JsonDeserializer jsonDeserializer = this.h;
        JsonDeserializer jsonDeserializerP = jsonDeserializer == null ? deserializationContext.p(javaType, beanProperty) : deserializationContext.C(jsonDeserializer, beanProperty, javaType);
        return (Objects.equals(this.k, boolB) && jsonDeserializer == jsonDeserializerP && this.i == jsonDeserializerP) ? this : new EnumSetDeserializer(this, jsonDeserializerP, StdDeserializer.f0(deserializationContext, beanProperty, jsonDeserializerP), boolB);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        EnumSet enumSetNoneOf = EnumSet.noneOf(this.g.d);
        if (jsonParser.x1()) {
            o0(jsonParser, deserializationContext, enumSetNoneOf);
            return enumSetNoneOf;
        }
        p0(jsonParser, deserializationContext, enumSetNoneOf);
        return enumSetNoneOf;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        EnumSet enumSet = (EnumSet) obj;
        if (jsonParser.x1()) {
            o0(jsonParser, deserializationContext, enumSet);
            return enumSet;
        }
        p0(jsonParser, deserializationContext, enumSet);
        return enumSet;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final AccessPattern i() {
        return AccessPattern.f;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object j(DeserializationContext deserializationContext) {
        return EnumSet.noneOf(this.g.d);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean m() {
        return this.g.f == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean o(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public final void o0(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws JsonMappingException {
        Enum r0;
        while (true) {
            try {
                JsonToken jsonTokenN1 = jsonParser.N1();
                if (jsonTokenN1 == JsonToken.END_ARRAY) {
                    return;
                }
                if (jsonTokenN1 != JsonToken.VALUE_NULL) {
                    r0 = (Enum) this.h.e(jsonParser, deserializationContext);
                } else if (!this.j) {
                    r0 = (Enum) this.i.c(deserializationContext);
                }
                if (r0 != null) {
                    enumSet.add(r0);
                }
            } catch (Exception e) {
                throw JsonMappingException.i(e, enumSet, enumSet.size());
            }
        }
    }

    public final void p0(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws JsonMappingException {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.k;
        if (bool2 != bool && (bool2 != null || !deserializationContext.N(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            deserializationContext.E(jsonParser, EnumSet.class);
            throw null;
        }
        if (jsonParser.a1(JsonToken.VALUE_NULL)) {
            deserializationContext.D(jsonParser, this.g);
            throw null;
        }
        try {
            Enum r4 = (Enum) this.h.e(jsonParser, deserializationContext);
            if (r4 != null) {
                enumSet.add(r4);
            }
        } catch (Exception e) {
            throw JsonMappingException.i(e, enumSet, enumSet.size());
        }
    }

    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, JsonDeserializer jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(enumSetDeserializer);
        this.g = enumSetDeserializer.g;
        this.h = jsonDeserializer;
        this.i = nullValueProvider;
        this.j = NullsConstantProvider.a(nullValueProvider);
        this.k = bool;
    }
}
