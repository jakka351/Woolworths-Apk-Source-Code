package com.adobe.marketing.mobile.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod d;
    public static final /* synthetic */ HttpMethod[] e;

    static {
        HttpMethod httpMethod = new HttpMethod("GET", 0);
        d = httpMethod;
        e = new HttpMethod[]{httpMethod, new HttpMethod("POST", 1)};
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) e.clone();
    }
}
