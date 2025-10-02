package com.google.firebase.perf.network;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class InstrumentOkHttpEnqueueCallback implements Callback {
    public final Callback d;
    public final NetworkRequestMetricBuilder e;
    public final Timer f;
    public final long g;

    public InstrumentOkHttpEnqueueCallback(Callback callback, TransportManager transportManager, Timer timer, long j) {
        this.d = callback;
        this.e = new NetworkRequestMetricBuilder(transportManager);
        this.g = j;
        this.f = timer;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        Request e = call.getE();
        NetworkRequestMetricBuilder networkRequestMetricBuilder = this.e;
        if (e != null) {
            HttpUrl httpUrl = e.f26690a;
            if (httpUrl != null) {
                networkRequestMetricBuilder.j(httpUrl.m().toString());
            }
            String str = e.b;
            if (str != null) {
                networkRequestMetricBuilder.c(str);
            }
        }
        networkRequestMetricBuilder.f(this.g);
        c.x(this.f, networkRequestMetricBuilder, networkRequestMetricBuilder);
        this.d.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        FirebasePerfOkHttpClient.a(response, this.e, this.g, this.f.a());
        this.d.onResponse(call, response);
    }
}
