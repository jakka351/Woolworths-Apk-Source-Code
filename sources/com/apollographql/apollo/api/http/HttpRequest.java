package com.apollographql.apollo.api.http;

import com.apollographql.apollo.api.EmptyExecutionContext;
import com.apollographql.apollo.api.ExecutionContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpRequest;", "", "Builder", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpRequest {

    /* renamed from: a, reason: collision with root package name */
    public final HttpMethod f13529a;
    public final String b;
    public final List c;
    public final HttpBody d;
    public final ExecutionContext e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HttpMethod f13530a;
        public final String b;
        public HttpBody c;
        public final ArrayList d;
        public ExecutionContext e;

        public Builder(HttpMethod httpMethod, String url) {
            Intrinsics.h(url, "url");
            this.f13530a = httpMethod;
            this.b = url;
            this.d = new ArrayList();
            this.e = EmptyExecutionContext.f13513a;
        }

        public final void a(List headers) {
            Intrinsics.h(headers, "headers");
            this.d.addAll(headers);
        }

        public final HttpRequest b() {
            return new HttpRequest(this.f13530a, this.b, this.d, this.c, this.e);
        }
    }

    public HttpRequest(HttpMethod httpMethod, String str, ArrayList arrayList, HttpBody httpBody, ExecutionContext executionContext) {
        this.f13529a = httpMethod;
        this.b = str;
        this.c = arrayList;
        this.d = httpBody;
        this.e = executionContext;
    }

    public static Builder a(HttpRequest httpRequest) {
        HttpMethod httpMethod = httpRequest.f13529a;
        String url = httpRequest.b;
        httpRequest.getClass();
        Intrinsics.h(url, "url");
        Builder builder = new Builder(httpMethod, url);
        HttpBody httpBody = httpRequest.d;
        if (httpBody != null) {
            builder.c = httpBody;
        }
        builder.a(httpRequest.c);
        ExecutionContext executionContext = httpRequest.e;
        Intrinsics.h(executionContext, "executionContext");
        builder.e = builder.e.d(executionContext);
        return builder;
    }
}
