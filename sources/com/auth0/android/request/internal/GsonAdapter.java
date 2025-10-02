package com.auth0.android.request.internal;

import com.auth0.android.request.JsonAdapter;
import com.auth0.android.result.Credentials;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/auth0/android/request/internal/GsonAdapter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/auth0/android/request/JsonAdapter;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GsonAdapter<T> implements JsonAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final TypeAdapter f13684a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/internal/GsonAdapter$Companion;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public GsonAdapter(TypeAdapter typeAdapter) {
        this.f13684a = typeAdapter;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GsonAdapter(Gson gson, TypeToken typeToken) {
        this(gson.g(typeToken));
        Intrinsics.h(gson, "gson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GsonAdapter(Gson gson) {
        this(gson.g(TypeToken.get(Credentials.class)));
        Intrinsics.h(gson, "gson");
    }
}
