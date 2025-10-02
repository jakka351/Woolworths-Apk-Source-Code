package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/request/internal/CredentialsDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/auth0/android/result/Credentials;", "<init>", "()V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class CredentialsDeserializer implements JsonDeserializer<Credentials> {
    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        Intrinsics.h(json, "json");
        Intrinsics.h(typeOfT, "typeOfT");
        Intrinsics.h(context, "context");
        if (!(json instanceof JsonObject) || (json instanceof JsonNull) || json.b().entrySet().isEmpty()) {
            throw new JsonParseException("credentials json is not a valid json object");
        }
        JsonObject jsonObjectB = json.b();
        String idToken = (String) context.a(jsonObjectB.l("id_token"), String.class);
        String accessToken = (String) context.a(jsonObjectB.l("access_token"), String.class);
        String type = (String) context.a(jsonObjectB.l("token_type"), String.class);
        String str = (String) context.a(jsonObjectB.l("refresh_token"), String.class);
        Long l = (Long) context.a(jsonObjectB.l("expires_in"), Long.TYPE);
        String str2 = (String) context.a(jsonObjectB.l("scope"), String.class);
        String str3 = (String) context.a(jsonObjectB.l("recovery_code"), String.class);
        Date date = (Date) context.a(jsonObjectB.l("expires_at"), Date.class);
        if (date == null && l != null) {
            date = new Date((l.longValue() * 1000) + System.currentTimeMillis());
        }
        Date expiresAt = date;
        Intrinsics.g(idToken, "idToken");
        Intrinsics.g(accessToken, "accessToken");
        Intrinsics.g(type, "type");
        Intrinsics.g(expiresAt, "expiresAt");
        Credentials credentials = new Credentials(idToken, accessToken, type, str, expiresAt, str2);
        credentials.g(str3);
        return credentials;
    }
}
