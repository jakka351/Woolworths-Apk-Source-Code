package com.auth0.jwt;

import com.auth0.jwt.impl.HeaderClaimsHolder;
import com.auth0.jwt.impl.HeaderSerializer;
import com.auth0.jwt.impl.PayloadClaimsHolder;
import com.auth0.jwt.impl.PayloadSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

/* loaded from: classes4.dex */
public final class JWTCreator {

    public static class Builder {
    }

    static {
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.f(PayloadClaimsHolder.class, new PayloadSerializer(PayloadClaimsHolder.class));
        simpleModule.f(HeaderClaimsHolder.class, new HeaderSerializer(HeaderClaimsHolder.class));
        JsonMapper jsonMapper = new JsonMapper();
        jsonMapper.g(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        jsonMapper.j(simpleModule);
    }
}
