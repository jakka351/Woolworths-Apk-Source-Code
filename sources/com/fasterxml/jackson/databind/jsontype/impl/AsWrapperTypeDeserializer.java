package com.fasterxml.jackson.databind.jsontype.impl;

import androidx.constraintlayout.core.state.a;
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
public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Object c(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return o(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final TypeDeserializer f(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final JsonTypeInfo.As j() {
        return JsonTypeInfo.As.e;
    }

    public final Object o(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        Object objB0;
        if (jsonParser.b() && (objB0 = jsonParser.B0()) != null) {
            return l(jsonParser, deserializationContext, objB0);
        }
        JsonToken jsonTokenE = jsonParser.e();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        JavaType javaType = this.e;
        if (jsonTokenE == jsonToken) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (jsonTokenN1 != jsonToken2) {
                deserializationContext.Y(jsonToken2, a.f(javaType.d, new StringBuilder("need JSON String that contains type id (for subtype of "), ")"), new Object[0]);
                throw null;
            }
        } else if (jsonTokenE != JsonToken.FIELD_NAME) {
            deserializationContext.Y(jsonToken, "need JSON Object to contain As.WRAPPER_OBJECT type information for class ".concat(javaType.d.getName()), new Object[0]);
            throw null;
        }
        String strK0 = jsonParser.k0();
        JsonDeserializer jsonDeserializerN = n(deserializationContext, strK0);
        jsonParser.N1();
        if (this.i && jsonParser.a1(jsonToken)) {
            TokenBuffer tokenBufferK = deserializationContext.k(jsonParser);
            tokenBufferK.p1();
            tokenBufferK.U(this.h);
            tokenBufferK.J1(strK0);
            jsonParser.c();
            jsonParser = JsonParserSequence.Y1(tokenBufferK.k2(jsonParser), jsonParser);
            jsonParser.N1();
        }
        Object objE = jsonDeserializerN.e(jsonParser, deserializationContext);
        JsonToken jsonTokenN12 = jsonParser.N1();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenN12 == jsonToken3) {
            return objE;
        }
        deserializationContext.Y(jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        throw null;
    }
}
