package com.auth0.android.request.internal;

import com.auth0.android.result.UserIdentity;
import com.auth0.android.result.UserProfile;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class UserProfileDeserializer implements JsonDeserializer<UserProfile> {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f13689a = new Gson();

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        if (!(jsonElement instanceof JsonObject) || (jsonElement instanceof JsonNull) || jsonElement.b().entrySet().isEmpty()) {
            throw new JsonParseException("user profile json is not a valid json object");
        }
        JsonObject jsonObjectB = jsonElement.b();
        if (jsonObjectB.k()) {
        }
        List list = (List) jsonDeserializationContext.a(jsonObjectB.l("identities"), new TypeToken<List<UserIdentity>>() { // from class: com.auth0.android.request.internal.UserProfileDeserializer.1
        }.getType());
        Type type2 = new TypeToken<Map<String, Object>>() { // from class: com.auth0.android.request.internal.UserProfileDeserializer.2
        }.getType();
        return new UserProfile(list, (Map) jsonDeserializationContext.a(jsonObjectB, type2), (Map) jsonDeserializationContext.a(jsonObjectB.l("user_metadata"), type2), (Map) jsonDeserializationContext.a(jsonObjectB.l("app_metadata"), type2));
    }
}
