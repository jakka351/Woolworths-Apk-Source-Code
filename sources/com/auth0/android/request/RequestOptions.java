package com.auth0.android.request;

import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/RequestOptions;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestOptions {

    /* renamed from: a, reason: collision with root package name */
    public final HttpMethod f13679a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();

    public RequestOptions(HttpMethod httpMethod) {
        this.f13679a = httpMethod;
    }

    /* renamed from: a, reason: from getter */
    public final LinkedHashMap getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final HttpMethod getF13679a() {
        return this.f13679a;
    }

    /* renamed from: c, reason: from getter */
    public final LinkedHashMap getB() {
        return this.b;
    }
}
