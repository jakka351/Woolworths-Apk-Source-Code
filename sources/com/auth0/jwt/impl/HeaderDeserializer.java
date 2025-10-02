package com.auth0.jwt.impl;

import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Header;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import io.jsonwebtoken.JwsHeader;
import java.util.Map;

/* loaded from: classes4.dex */
class HeaderDeserializer extends StdDeserializer<Header> {

    /* renamed from: com.auth0.jwt.impl.HeaderDeserializer$1, reason: invalid class name */
    class AnonymousClass1 extends TypeReference<Map<String, JsonNode>> {
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Map map = (Map) jsonParser.k().a(jsonParser, new AnonymousClass1());
        if (map == null) {
            throw new JWTDecodeException("Parsing the Header's JSON resulted on a Null map", null);
        }
        o0(JwsHeader.ALGORITHM, map);
        o0("typ", map);
        o0(io.jsonwebtoken.Header.CONTENT_TYPE, map);
        o0(JwsHeader.KEY_ID, map);
        jsonParser.k();
        return new BasicHeader(map);
    }

    public final String o0(String str, Map map) {
        JsonNode jsonNode = (JsonNode) map.get(str);
        if (jsonNode == null || jsonNode.y()) {
            return null;
        }
        return jsonNode.l();
    }
}
