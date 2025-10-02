package com.apollographql.apollo.api.http;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpMethod;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod d;
    public static final HttpMethod e;
    public static final /* synthetic */ HttpMethod[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        HttpMethod httpMethod = new HttpMethod("Get", 0);
        d = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("Post", 1);
        e = httpMethod2;
        HttpMethod[] httpMethodArr = {httpMethod, httpMethod2};
        f = httpMethodArr;
        g = EnumEntriesKt.a(httpMethodArr);
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) f.clone();
    }
}
