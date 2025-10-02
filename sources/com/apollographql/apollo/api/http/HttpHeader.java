package com.apollographql.apollo.api.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpHeader;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HttpHeader {

    /* renamed from: a, reason: collision with root package name */
    public final String f13528a;
    public final String b;

    public HttpHeader(String name, String value) {
        Intrinsics.h(name, "name");
        Intrinsics.h(value, "value");
        this.f13528a = name;
        this.b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpHeader)) {
            return false;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        return Intrinsics.c(this.f13528a, httpHeader.f13528a) && Intrinsics.c(this.b, httpHeader.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13528a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpHeader(name=");
        sb.append(this.f13528a);
        sb.append(", value=");
        return androidx.camera.core.impl.b.r(sb, this.b, ')');
    }
}
