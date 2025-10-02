package com.fasterxml.jackson.databind.jsontype.impl;

import YU.a;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.TokenBuffer;

/* loaded from: classes4.dex */
public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    public final JsonTypeInfo.As l;
    public final String m;

    public AsPropertyTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2, JsonTypeInfo.As as) {
        super(javaType, typeIdResolver, str, z, javaType2);
        this.m = a.h("missing type id property '", this.h, "'");
        this.l = as;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final Object b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return jsonParser.a1(JsonToken.START_ARRAY) ? o(jsonParser, deserializationContext) : d(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String strT0;
        Object objB0;
        if (jsonParser.b() && (objB0 = jsonParser.B0()) != null) {
            return l(jsonParser, deserializationContext, objB0);
        }
        JsonToken jsonTokenE = jsonParser.e();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        String str = this.m;
        TokenBuffer tokenBufferK = null;
        if (jsonTokenE == jsonToken) {
            jsonTokenE = jsonParser.N1();
        } else if (jsonTokenE != JsonToken.FIELD_NAME) {
            return q(jsonParser, deserializationContext, null, str);
        }
        boolean zM = deserializationContext.f.m(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenE == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            jsonParser.N1();
            String str2 = this.h;
            if ((strD.equals(str2) || (zM && strD.equalsIgnoreCase(str2))) && (strT0 = jsonParser.T0()) != null) {
                return p(jsonParser, deserializationContext, tokenBufferK, strT0);
            }
            if (tokenBufferK == null) {
                tokenBufferK = deserializationContext.k(jsonParser);
            }
            tokenBufferK.U(strD);
            tokenBufferK.u2(jsonParser);
            jsonTokenE = jsonParser.N1();
        }
        return q(jsonParser, deserializationContext, tokenBufferK, str);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer f(BeanProperty beanProperty) {
        return beanProperty == this.f ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final JsonTypeInfo.As j() {
        return this.l;
    }

    public final Object p(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer, String str) throws InvalidTypeIdException {
        JsonDeserializer jsonDeserializerN = n(deserializationContext, str);
        if (this.i) {
            if (tokenBuffer == null) {
                tokenBuffer = deserializationContext.k(jsonParser);
            }
            tokenBuffer.U(jsonParser.d());
            tokenBuffer.J1(str);
        }
        if (tokenBuffer != null) {
            jsonParser.c();
            jsonParser = JsonParserSequence.Y1(tokenBuffer.k2(jsonParser), jsonParser);
        }
        if (jsonParser.e() != JsonToken.END_OBJECT) {
            jsonParser.N1();
        }
        return jsonDeserializerN.e(jsonParser, deserializationContext);
    }

    public final Object q(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer, String str) throws InvalidTypeIdException {
        boolean zK = k();
        JavaType javaType = this.e;
        if (!zK) {
            Object objA = TypeDeserializer.a(jsonParser, javaType);
            if (objA != null) {
                return objA;
            }
            if (jsonParser.x1()) {
                return o(jsonParser, deserializationContext);
            }
            if (jsonParser.a1(JsonToken.VALUE_STRING) && deserializationContext.N(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.k0().trim().isEmpty()) {
                return null;
            }
        }
        JsonDeserializer jsonDeserializerM = m(deserializationContext);
        if (jsonDeserializerM != null) {
            if (tokenBuffer != null) {
                tokenBuffer.H();
                jsonParser = tokenBuffer.k2(jsonParser);
                jsonParser.N1();
            }
            return jsonDeserializerM.e(jsonParser, deserializationContext);
        }
        deserializationContext.f.getClass();
        for (LinkedNode linkedNode = null; linkedNode != null; linkedNode = linkedNode.b) {
            ((DeserializationProblemHandler) linkedNode.f14334a).getClass();
        }
        throw new InvalidTypeIdException(deserializationContext.i, DatabindContext.a(String.format("Could not resolve subtype of %s", javaType), str), null);
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        String strJ;
        super(asPropertyTypeDeserializer, beanProperty);
        if (beanProperty == null) {
            strJ = a.h("missing type id property '", this.h, "'");
        } else {
            strJ = a.j("missing type id property '", this.h, "' (for POJO property '", beanProperty.getName(), "')");
        }
        this.m = strJ;
        this.l = asPropertyTypeDeserializer.l;
    }
}
