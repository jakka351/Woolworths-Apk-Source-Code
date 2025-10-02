package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes6.dex */
public class InstrumentApacheHttpResponseHandler<T> implements ResponseHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ResponseHandler f15710a;
    public final Timer b;
    public final NetworkRequestMetricBuilder c;

    public InstrumentApacheHttpResponseHandler(ResponseHandler responseHandler, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.f15710a = responseHandler;
        this.b = timer;
        this.c = networkRequestMetricBuilder;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.c.i(this.b.a());
        this.c.d(httpResponse.getStatusLine().getStatusCode());
        Long lA = NetworkRequestMetricBuilderUtil.a(httpResponse);
        if (lA != null) {
            this.c.h(lA.longValue());
        }
        String strB = NetworkRequestMetricBuilderUtil.b(httpResponse);
        if (strB != null) {
            this.c.g(strB);
        }
        this.c.b();
        return this.f15710a.handleResponse(httpResponse);
    }
}
