package com.auth0.jwt.impl;

import YU.a;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Payload;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import io.jsonwebtoken.Claims;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
class PayloadDeserializer extends StdDeserializer<Payload> {

    /* renamed from: com.auth0.jwt.impl.PayloadDeserializer$1, reason: invalid class name */
    class AnonymousClass1 extends TypeReference<Map<String, JsonNode>> {
    }

    public static Instant o0(String str, Map map) {
        JsonNode jsonNode = (JsonNode) map.get(str);
        if (jsonNode == null || jsonNode.y()) {
            return null;
        }
        if (jsonNode.o()) {
            return Instant.ofEpochSecond(jsonNode.i());
        }
        throw new JWTDecodeException(a.h("The claim '", str, "' contained a non-numeric date value."), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Map map = (Map) jsonParser.k().a(jsonParser, new AnonymousClass1());
        ?? arrayList = 0;
        arrayList = 0;
        arrayList = 0;
        if (map == null) {
            throw new JWTDecodeException("Parsing the Payload's JSON resulted on a Null map", null);
        }
        p0(Claims.ISSUER, map);
        p0(Claims.SUBJECT, map);
        ObjectCodec objectCodecK = jsonParser.k();
        JsonNode jsonNode = (JsonNode) map.get(Claims.AUDIENCE);
        if (jsonNode != null && !jsonNode.y()) {
            boolean z = jsonNode instanceof ArrayNode;
            JsonNodeType jsonNodeType = JsonNodeType.l;
            if (z || jsonNode.x() == jsonNodeType) {
                if (jsonNode.x() != jsonNodeType || jsonNode.k().isEmpty()) {
                    arrayList = new ArrayList(jsonNode.size());
                    for (int i = 0; i < jsonNode.size(); i++) {
                        try {
                            arrayList.add((String) objectCodecK.b(jsonNode.w(i)));
                        } catch (JsonProcessingException e) {
                            throw new JWTDecodeException("Couldn't map the Claim's array contents to String", e);
                        }
                    }
                } else {
                    arrayList = Collections.singletonList(jsonNode.k());
                }
            }
        }
        o0(Claims.EXPIRATION, map);
        o0(Claims.NOT_BEFORE, map);
        o0(Claims.ISSUED_AT, map);
        p0(Claims.ID, map);
        jsonParser.k();
        return new PayloadImpl(arrayList, map);
    }

    public final String p0(String str, Map map) {
        JsonNode jsonNode = (JsonNode) map.get(str);
        if (jsonNode == null || jsonNode.y()) {
            return null;
        }
        return jsonNode.l();
    }
}
