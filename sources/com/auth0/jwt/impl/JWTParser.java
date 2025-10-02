package com.auth0.jwt.impl;

import com.auth0.jwt.interfaces.Header;
import com.auth0.jwt.interfaces.JWTPartsParser;
import com.auth0.jwt.interfaces.Payload;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

/* loaded from: classes4.dex */
public class JWTParser implements JWTPartsParser {
    static {
        ObjectMapper objectMapper = new ObjectMapper();
        SerializationFeature serializationFeature = SerializationFeature.FAIL_ON_EMPTY_BEANS;
        SerializationConfig serializationConfig = objectMapper.g;
        int i = serializationConfig.o;
        int i2 = (~serializationFeature.e) & i;
        if (i2 != i) {
            serializationConfig = new SerializationConfig(serializationConfig, serializationConfig.d, i2);
        }
        objectMapper.g = serializationConfig;
        JsonInclude.Value value = JsonInclude.Value.h;
        JsonInclude.Include include = JsonInclude.Include.f;
        objectMapper.f.d = new JsonInclude.Value(include, include, null, null);
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.e(Payload.class, new PayloadDeserializer(Payload.class));
        simpleModule.e(Header.class, new HeaderDeserializer(Header.class));
        objectMapper.j(simpleModule);
        objectMapper.i(Payload.class);
        objectMapper.i(Header.class);
    }
}
