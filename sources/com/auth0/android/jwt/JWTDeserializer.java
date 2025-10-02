package com.auth0.android.jwt;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import io.jsonwebtoken.Claims;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class JWTDeserializer implements JsonDeserializer<JWTPayload> {
    public static Date a(JsonObject jsonObject, String str) {
        if (jsonObject.d.containsKey(str)) {
            return new Date(jsonObject.i(str).d() * 1000);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        if ((jsonElement instanceof JsonNull) || !(jsonElement instanceof JsonObject)) {
            throw new DecodeException("The token's payload had an invalid JSON format.");
        }
        JsonObject jsonObjectB = jsonElement.b();
        LinkedTreeMap linkedTreeMap = jsonObjectB.d;
        if (linkedTreeMap.containsKey(Claims.ISSUER)) {
            jsonObjectB.i(Claims.ISSUER).g();
        }
        if (linkedTreeMap.containsKey(Claims.SUBJECT)) {
            jsonObjectB.i(Claims.SUBJECT).g();
        }
        Date dateA = a(jsonObjectB, Claims.EXPIRATION);
        a(jsonObjectB, Claims.NOT_BEFORE);
        Date dateA2 = a(jsonObjectB, Claims.ISSUED_AT);
        if (linkedTreeMap.containsKey(Claims.ID)) {
            jsonObjectB.i(Claims.ID).g();
        }
        ?? SingletonList = Collections.EMPTY_LIST;
        if (linkedTreeMap.containsKey(Claims.AUDIENCE)) {
            JsonElement jsonElementI = jsonObjectB.i(Claims.AUDIENCE);
            jsonElementI.getClass();
            boolean z = jsonElementI instanceof JsonArray;
            if (!z) {
                SingletonList = Collections.singletonList(jsonElementI.g());
            } else {
                if (!z) {
                    throw new IllegalStateException("Not a JSON Array: " + jsonElementI);
                }
                ArrayList arrayList = ((JsonArray) jsonElementI).d;
                SingletonList = new ArrayList(arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    SingletonList.add(((JsonElement) arrayList.get(i)).g());
                }
            }
        }
        HashMap map = new HashMap();
        for (Map.Entry entry : linkedTreeMap.entrySet()) {
            Object key = entry.getKey();
            map.put(key, new ClaimImpl());
        }
        return new JWTPayload(dateA, dateA2, SingletonList, map);
    }
}
