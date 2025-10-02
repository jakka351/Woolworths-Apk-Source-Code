package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    public static void a(Response response, NetworkRequestMetricBuilder networkRequestMetricBuilder, long j, long j2) {
        Request request = response.d;
        if (request == null) {
            return;
        }
        networkRequestMetricBuilder.j(request.f26690a.m().toString());
        networkRequestMetricBuilder.c(request.b);
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            long jA = requestBody.a();
            if (jA != -1) {
                networkRequestMetricBuilder.e(jA);
            }
        }
        ResponseBody responseBody = response.j;
        if (responseBody != null) {
            long h = responseBody.getH();
            if (h != -1) {
                networkRequestMetricBuilder.h(h);
            }
            MediaType g = responseBody.getG();
            if (g != null) {
                networkRequestMetricBuilder.g(g.f26685a);
            }
        }
        networkRequestMetricBuilder.d(response.g);
        networkRequestMetricBuilder.f(j);
        networkRequestMetricBuilder.i(j2);
        networkRequestMetricBuilder.b();
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.U1(new InstrumentOkHttpEnqueueCallback(callback, TransportManager.v, timer, timer.d));
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilder = new NetworkRequestMetricBuilder(TransportManager.v);
        Timer timer = new Timer();
        long j = timer.d;
        try {
            Response responseExecute = call.execute();
            a(responseExecute, networkRequestMetricBuilder, j, timer.a());
            return responseExecute;
        } catch (IOException e) {
            Request e2 = call.getE();
            if (e2 != null) {
                HttpUrl httpUrl = e2.f26690a;
                if (httpUrl != null) {
                    networkRequestMetricBuilder.j(httpUrl.m().toString());
                }
                String str = e2.b;
                if (str != null) {
                    networkRequestMetricBuilder.c(str);
                }
            }
            networkRequestMetricBuilder.f(j);
            networkRequestMetricBuilder.i(timer.a());
            NetworkRequestMetricBuilderUtil.c(networkRequestMetricBuilder);
            throw e;
        }
    }
}
