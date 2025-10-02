package com.braintreepayments.api;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
class HttpClient {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadScheduler f13725a;
    public final SynchronousHttpClient b;
    public final HashMap c;

    public HttpClient(SSLSocketFactory sSLSocketFactory, HttpResponseParser httpResponseParser) {
        SynchronousHttpClient synchronousHttpClient = new SynchronousHttpClient(sSLSocketFactory, httpResponseParser);
        ThreadScheduler threadScheduler = new ThreadScheduler();
        this.b = synchronousHttpClient;
        this.f13725a = threadScheduler;
        this.c = new HashMap();
    }

    public final void a(final HttpRequest httpRequest, final int i, final NetworkResponseCallback networkResponseCallback) {
        URL urlB;
        try {
            urlB = httpRequest.b();
        } catch (MalformedURLException | URISyntaxException unused) {
            urlB = null;
        }
        if (urlB != null) {
            this.c.remove(urlB);
        }
        this.f13725a.b.submit(new Runnable() { // from class: com.braintreepayments.api.HttpClient.1
            @Override // java.lang.Runnable
            public final void run() {
                URL urlB2;
                HttpRequest httpRequest2 = httpRequest;
                final NetworkResponseCallback networkResponseCallback2 = networkResponseCallback;
                HttpClient httpClient = HttpClient.this;
                ThreadScheduler threadScheduler = httpClient.f13725a;
                try {
                    final HttpResponse httpResponseA = httpClient.b.a(httpRequest2);
                    if (networkResponseCallback2 != null) {
                        threadScheduler.a(new Runnable() { // from class: com.braintreepayments.api.HttpClient.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                networkResponseCallback2.c(httpResponseA, null);
                            }
                        });
                    }
                } catch (Exception e) {
                    int i2 = i;
                    if (i2 == 0) {
                        if (networkResponseCallback2 != null) {
                            threadScheduler.a(new Runnable() { // from class: com.braintreepayments.api.HttpClient.3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    networkResponseCallback2.c(null, e);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (i2 != 1) {
                        return;
                    }
                    HashMap map = httpClient.c;
                    try {
                        urlB2 = httpRequest2.b();
                    } catch (MalformedURLException | URISyntaxException unused2) {
                        urlB2 = null;
                    }
                    if (urlB2 != null) {
                        Integer num = (Integer) map.get(urlB2);
                        int iIntValue = (num == null ? 0 : num.intValue()) + 1;
                        if (iIntValue < 3) {
                            httpClient.a(httpRequest2, i2, networkResponseCallback2);
                            map.put(urlB2, Integer.valueOf(iIntValue));
                        } else {
                            final HttpClientException httpClientException = new HttpClientException("Retry limit has been exceeded. Try again later.");
                            if (networkResponseCallback2 != null) {
                                threadScheduler.a(new Runnable() { // from class: com.braintreepayments.api.HttpClient.3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        networkResponseCallback2.c(null, httpClientException);
                                    }
                                });
                            }
                        }
                    }
                }
            }
        });
    }
}
