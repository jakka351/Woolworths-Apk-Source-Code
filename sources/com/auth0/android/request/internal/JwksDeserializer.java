package com.auth0.android.request.internal;

import android.util.Base64;
import android.util.Log;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import io.jsonwebtoken.JwsHeader;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/auth0/android/request/internal/JwksDeserializer;", "Lcom/google/gson/JsonDeserializer;", "", "", "Ljava/security/PublicKey;", "<init>", "()V", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JwksDeserializer implements JsonDeserializer<Map<String, ? extends PublicKey>> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/auth0/android/request/internal/JwksDeserializer$Companion;", "", "", "RSA_ALGORITHM", "Ljava/lang/String;", "USE_SIGNING", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws InvalidKeySpecException {
        Intrinsics.h(json, "json");
        Intrinsics.h(typeOfT, "typeOfT");
        Intrinsics.h(context, "context");
        if (!(json instanceof JsonObject) || (json instanceof JsonNull) || json.b().entrySet().isEmpty()) {
            throw new JsonParseException("jwks json must be a valid and non-empty json object");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<JsonElement> it = json.b().j().iterator();
        while (it.hasNext()) {
            JsonObject jsonObjectB = it.next().b();
            String str = (String) context.a(jsonObjectB.i(JwsHeader.ALGORITHM), String.class);
            String str2 = (String) context.a(jsonObjectB.i("use"), String.class);
            if ("RS256".equals(str) && "sig".equals(str2)) {
                String str3 = (String) context.a(jsonObjectB.i("kty"), String.class);
                String keyId = (String) context.a(jsonObjectB.i(JwsHeader.KEY_ID), String.class);
                try {
                    PublicKey pub = KeyFactory.getInstance(str3).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode((String) context.a(jsonObjectB.i("n"), String.class), 11)), new BigInteger(1, Base64.decode((String) context.a(jsonObjectB.i("e"), String.class), 11))));
                    Intrinsics.g(keyId, "keyId");
                    Intrinsics.g(pub, "pub");
                    linkedHashMap.put(keyId, pub);
                } catch (NoSuchAlgorithmException e) {
                    Log.e("JwksDeserializer", "Could not parse the JWK with ID " + keyId, e);
                } catch (InvalidKeySpecException e2) {
                    Log.e("JwksDeserializer", "Could not parse the JWK with ID " + keyId, e2);
                }
            }
        }
        return MapsKt.q(linkedHashMap);
    }
}
