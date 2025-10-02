package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.ExecutionContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpInfo;", "Lcom/apollographql/apollo/api/ExecutionContext$Element;", "Key", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpInfo implements ExecutionContext.Element {
    public static final Key c = new Key();

    /* renamed from: a, reason: collision with root package name */
    public final int f13628a;
    public final List b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpInfo$Key;", "Lcom/apollographql/apollo/api/ExecutionContext$Key;", "Lcom/apollographql/apollo/network/http/HttpInfo;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements ExecutionContext.Key<HttpInfo> {
    }

    public HttpInfo(int i, List headers) {
        Intrinsics.h(headers, "headers");
        this.f13628a = i;
        this.b = headers;
    }

    @Override // com.apollographql.apollo.api.ExecutionContext.Element
    public final ExecutionContext.Key getKey() {
        return c;
    }
}
