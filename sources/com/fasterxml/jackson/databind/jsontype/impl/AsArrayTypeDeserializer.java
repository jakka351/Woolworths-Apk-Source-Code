package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer f(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.As j() {
        return JsonTypeInfo.As.f;
    }

    public final Object o(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        String strK0;
        Object objB0;
        if (jsonParser.b() && (objB0 = jsonParser.B0()) != null) {
            return l(jsonParser, deserializationContext, objB0);
        }
        boolean zX1 = jsonParser.x1();
        boolean zX12 = jsonParser.x1();
        JavaType javaType = this.e;
        if (zX12) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            if (jsonTokenN1 != jsonToken && (jsonTokenN1 == null || !jsonTokenN1.k)) {
                deserializationContext.Y(jsonToken, "need JSON String, Number of Boolean that contains type id (for subtype of %s)", javaType.d.getName());
                throw null;
            }
            strK0 = jsonParser.k0();
            jsonParser.N1();
        } else {
            if (this.g == null) {
                deserializationContext.Y(JsonToken.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class ".concat(javaType.d.getName()), new Object[0]);
                throw null;
            }
            strK0 = this.d.e();
        }
        JsonDeserializer jsonDeserializerN = n(deserializationContext, strK0);
        if (this.i && !(this instanceof AsExternalTypeDeserializer) && jsonParser.a1(JsonToken.START_OBJECT)) {
            TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
            tokenBufferK.p1();
            tokenBufferK.U(this.h);
            tokenBufferK.J1(strK0);
            jsonParser.c();
            jsonParser = JsonParserSequence.Y1(tokenBufferK.k2(jsonParser), jsonParser);
            jsonParser.N1();
        }
        if (zX1 && jsonParser.e() == JsonToken.END_ARRAY) {
            return jsonDeserializerN.c(deserializationContext);
        }
        Object objE = jsonDeserializerN.e(jsonParser, deserializationContext);
        if (zX1) {
            JsonToken jsonTokenN12 = jsonParser.N1();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            if (jsonTokenN12 != jsonToken2) {
                deserializationContext.Y(jsonToken2, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
                throw null;
            }
        }
        return objE;
    }
}
