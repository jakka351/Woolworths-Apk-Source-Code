package com.auth0.android.request.internal;

import com.auth0.android.result.Credentials;
import com.auth0.android.result.UserProfile;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/internal/GsonProvider;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GsonProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final Gson f13685a;

    static {
        Type type = TypeToken.getParameterized(Map.class, String.class, PublicKey.class).getType();
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.e.add(new JsonRequiredTypeAdapterFactory());
        gsonBuilder.b(new UserProfileDeserializer(), UserProfile.class);
        gsonBuilder.b(new CredentialsDeserializer(), Credentials.class);
        gsonBuilder.b(new JwksDeserializer(), type);
        gsonBuilder.g = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        f13685a = gsonBuilder.a();
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
