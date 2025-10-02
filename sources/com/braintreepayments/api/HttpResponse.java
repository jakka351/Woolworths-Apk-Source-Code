package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/HttpResponse;", "", "SharedUtils_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HttpResponse {

    /* renamed from: a, reason: collision with root package name */
    public String f13727a;
    public HttpResponseTiming b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return Intrinsics.c(this.f13727a, httpResponse.f13727a) && Intrinsics.c(this.b, httpResponse.b);
    }

    public final int hashCode() {
        String str = this.f13727a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "HttpResponse(body=" + this.f13727a + ", timing=" + this.b + ')';
    }
}
