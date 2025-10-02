package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements ContextualDeserializer {
    public final KeyDeserializer k;
    public final JsonDeserializer l;
    public final TypeDeserializer m;

    public MapEntryDeserializer(JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        if (javaType.e() != 2) {
            throw new IllegalArgumentException("Missing generic type information for " + javaType);
        }
        this.k = keyDeserializer;
        this.l = jsonDeserializer;
        this.m = typeDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JavaType javaType = this.g;
        KeyDeserializer keyDeserializer = this.k;
        KeyDeserializer keyDeserializerR = keyDeserializer == 0 ? deserializationContext.r(javaType.d(0), beanProperty) : keyDeserializer instanceof ContextualKeyDeserializer ? ((ContextualKeyDeserializer) keyDeserializer).a() : keyDeserializer;
        JsonDeserializer jsonDeserializer = this.l;
        JsonDeserializer jsonDeserializerG0 = StdDeserializer.g0(deserializationContext, beanProperty, jsonDeserializer);
        JavaType javaTypeD = javaType.d(1);
        JsonDeserializer jsonDeserializerP = jsonDeserializerG0 == null ? deserializationContext.p(javaTypeD, beanProperty) : deserializationContext.C(jsonDeserializerG0, beanProperty, javaTypeD);
        TypeDeserializer typeDeserializer = this.m;
        TypeDeserializer typeDeserializerF = typeDeserializer != null ? typeDeserializer.f(beanProperty) : typeDeserializer;
        return (keyDeserializer == keyDeserializerR && jsonDeserializer == jsonDeserializerP && typeDeserializer == typeDeserializerF) ? this : new MapEntryDeserializer(this, keyDeserializerR, jsonDeserializerP, typeDeserializerF);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objE;
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE == JsonToken.START_OBJECT) {
            jsonTokenE = jsonParser.N1();
        } else if (jsonTokenE != JsonToken.FIELD_NAME && jsonTokenE != JsonToken.END_OBJECT) {
            if (jsonTokenE == JsonToken.START_ARRAY) {
                return (Map.Entry) E(jsonParser, deserializationContext);
            }
            deserializationContext.D(jsonParser, l0(deserializationContext));
            throw null;
        }
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        if (jsonTokenE != jsonToken) {
            if (jsonTokenE == JsonToken.END_OBJECT) {
                deserializationContext.V(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
                throw null;
            }
            deserializationContext.E(jsonParser, this.d);
            throw null;
        }
        String strD = jsonParser.d();
        Object objA = this.k.a(deserializationContext, strD);
        JsonToken jsonTokenN1 = jsonParser.N1();
        try {
            JsonToken jsonToken2 = JsonToken.VALUE_NULL;
            JsonDeserializer jsonDeserializer = this.l;
            if (jsonTokenN1 == jsonToken2) {
                objE = jsonDeserializer.c(deserializationContext);
            } else {
                TypeDeserializer typeDeserializer = this.m;
                objE = typeDeserializer == null ? jsonDeserializer.e(jsonParser, deserializationContext) : jsonDeserializer.g(jsonParser, deserializationContext, typeDeserializer);
            }
            JsonToken jsonTokenN12 = jsonParser.N1();
            if (jsonTokenN12 == JsonToken.END_OBJECT) {
                return new AbstractMap.SimpleEntry(objA, objE);
            }
            if (jsonTokenN12 == jsonToken) {
                deserializationContext.V(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.d());
                throw null;
            }
            deserializationContext.V(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + jsonTokenN12, new Object[0]);
            throw null;
        } catch (Exception e) {
            ContainerDeserializerBase.p0(deserializationContext, e, Map.Entry.class, strD);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object f(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.d(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final LogicalType n() {
        return LogicalType.f;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public final JsonDeserializer o0() {
        return this.l;
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(mapEntryDeserializer, mapEntryDeserializer.h, mapEntryDeserializer.j);
        this.k = keyDeserializer;
        this.l = jsonDeserializer;
        this.m = typeDeserializer;
    }
}
