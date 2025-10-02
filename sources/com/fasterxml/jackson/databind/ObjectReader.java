package com.fasterxml.jackson.databind;

import YU.a;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ObjectReader extends ObjectCodec implements Versioned, Serializable {
    public final DeserializationConfig d;
    public final DefaultDeserializationContext e;
    public final JsonFactory f;
    public final JavaType g;
    public final JsonDeserializer h;
    public final DataFormatReaders i;
    public final ConcurrentHashMap j;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType) {
        this.d = deserializationConfig;
        this.e = objectMapper.k;
        this.j = objectMapper.m;
        this.f = objectMapper.d;
        this.g = javaType;
        deserializationConfig.getClass();
        deserializationConfig.r(DeserializationFeature.UNWRAP_ROOT_VALUE);
        this.h = g(javaType);
        this.i = null;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final Object a(JsonParser jsonParser, TypeReference typeReference) {
        return h(this.d.e.d.k(typeReference.d)).i(jsonParser);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final Object b(JsonNode jsonNode) throws JsonProcessingException {
        d(jsonNode, "n");
        try {
            return h(this.d.c(String.class)).i(new TreeTraversingParser(jsonNode, this));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.g(e2);
        }
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public final void c(JsonGenerator jsonGenerator, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public final void d(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(a.h("argument \"", str, "\" is null"));
        }
    }

    public final JsonDeserializer e(DefaultDeserializationContext defaultDeserializationContext) throws InvalidDefinitionException {
        JsonDeserializer jsonDeserializer = this.h;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this.g;
        if (javaType == null) {
            defaultDeserializationContext.j("No value type configured for ObjectReader");
            throw null;
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) concurrentHashMap.get(javaType);
        if (jsonDeserializer2 != null) {
            return jsonDeserializer2;
        }
        JsonDeserializer jsonDeserializerU = defaultDeserializationContext.u(javaType);
        if (jsonDeserializerU != null) {
            concurrentHashMap.put(javaType, jsonDeserializerU);
            return jsonDeserializerU;
        }
        defaultDeserializationContext.j("Cannot find a deserializer for type " + javaType);
        throw null;
    }

    public final JsonToken f(DefaultDeserializationContext defaultDeserializationContext, JsonParser jsonParser) throws MismatchedInputException {
        this.d.getClass();
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE != null) {
            return jsonTokenE;
        }
        JsonToken jsonTokenN1 = jsonParser.N1();
        if (jsonTokenN1 != null) {
            return jsonTokenN1;
        }
        defaultDeserializationContext.W("No content to map due to end-of-input", new Object[0]);
        throw null;
    }

    public final JsonDeserializer g(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        DeserializationFeature deserializationFeature = DeserializationFeature.EAGER_DESERIALIZER_FETCH;
        DeserializationConfig deserializationConfig = this.d;
        if (!deserializationConfig.r(deserializationFeature)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        JsonDeserializer jsonDeserializerU = (JsonDeserializer) concurrentHashMap.get(javaType);
        if (jsonDeserializerU == null) {
            try {
                jsonDeserializerU = this.e.d0(deserializationConfig).u(javaType);
                if (jsonDeserializerU != null) {
                    concurrentHashMap.put(javaType, jsonDeserializerU);
                }
            } catch (JacksonException unused) {
            }
        }
        return jsonDeserializerU;
    }

    public final ObjectReader h(JavaType javaType) {
        if (javaType != null && javaType.equals(this.g)) {
            return this;
        }
        JsonDeserializer jsonDeserializerG = g(javaType);
        DataFormatReaders dataFormatReaders = this.i;
        if (dataFormatReaders == null) {
            return new ObjectReader(this, this.d, javaType, jsonDeserializerG, dataFormatReaders);
        }
        throw null;
    }

    public final Object i(JsonParser jsonParser) throws MismatchedInputException {
        JsonToken jsonTokenN1;
        DefaultDeserializationContext defaultDeserializationContext = this.e;
        DeserializationConfig deserializationConfig = this.d;
        DefaultDeserializationContext.Impl implE0 = defaultDeserializationContext.e0(deserializationConfig, jsonParser);
        JsonToken jsonTokenF = f(implE0, jsonParser);
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        JavaType javaType = this.g;
        Object objC = jsonTokenF == jsonToken ? e(implE0).c(implE0) : (jsonTokenF == JsonToken.END_ARRAY || jsonTokenF == JsonToken.END_OBJECT) ? null : implE0.f0(jsonParser, javaType, e(implE0));
        jsonParser.c();
        if (!deserializationConfig.r(DeserializationFeature.FAIL_ON_TRAILING_TOKENS) || (jsonTokenN1 = jsonParser.N1()) == null) {
            return objC;
        }
        Annotation[] annotationArr = ClassUtil.f14330a;
        DeserializationContext.X(javaType == null ? null : javaType.d, jsonParser, jsonTokenN1);
        throw null;
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer jsonDeserializer, DataFormatReaders dataFormatReaders) {
        this.d = deserializationConfig;
        this.e = objectReader.e;
        this.j = objectReader.j;
        this.f = objectReader.f;
        this.g = javaType;
        this.h = jsonDeserializer;
        deserializationConfig.getClass();
        deserializationConfig.r(DeserializationFeature.UNWRAP_ROOT_VALUE);
        this.i = dataFormatReaders;
    }
}
