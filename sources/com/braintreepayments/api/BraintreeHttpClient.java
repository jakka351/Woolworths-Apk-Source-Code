package com.braintreepayments.api;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpClient;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class BraintreeHttpClient {

    /* renamed from: a, reason: collision with root package name */
    public final HttpClient f13704a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpClient$Companion;", "", "", "AUTHORIZATION_FINGERPRINT_KEY", "Ljava/lang/String;", "CLIENT_KEY_HEADER", "USER_AGENT_HEADER", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public BraintreeHttpClient() {
        byte[] bArr = TLSCertificatePinning.f13748a;
        this.f13704a = new HttpClient(new TLSSocketFactory(new ByteArrayInputStream(TLSCertificatePinning.f13748a)), new BraintreeHttpResponseParser());
    }

    public final void a(String str, Configuration configuration, Authorization authorization) throws BraintreeException {
        if (authorization instanceof InvalidAuthorization) {
            throw new BraintreeException(((InvalidAuthorization) authorization).b, null);
        }
        boolean zW = StringsKt.W("https://api-m.paypal.com/v1/tracking/batch/events", "http", false);
        if (configuration == null && !zW) {
            throw new BraintreeException("Braintree HTTP GET request without configuration cannot have a relative path.", null);
        }
        if (authorization instanceof ClientToken) {
            str = new JSONObject(str).put("authorizationFingerprint", ((ClientToken) authorization).d).toString();
        }
        Intrinsics.g(str, "if (authorization is Cli…           data\n        }");
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.d = "POST";
        httpRequest.f13726a = "https://api-m.paypal.com/v1/tracking/batch/events";
        httpRequest.c = str.getBytes(StandardCharsets.UTF_8);
        httpRequest.a("User-Agent", "braintree/android/4.49.1");
        if (!zW && configuration != null) {
            httpRequest.b = configuration.f13715a;
        }
        if (authorization instanceof TokenizationKey) {
            httpRequest.a("Client-Key", ((TokenizationKey) authorization).c);
        }
        Intrinsics.g(this.f13704a.b.a(httpRequest).f13727a, "httpClient.sendRequest(request)");
    }

    public final void b(String path, String str, Configuration configuration, Authorization authorization, Map map, a aVar) {
        String c;
        Intrinsics.h(path, "path");
        if (authorization instanceof InvalidAuthorization) {
            String str2 = ((InvalidAuthorization) authorization).b;
            if (aVar != null) {
                aVar.c(null, new BraintreeException(str2, null));
                return;
            }
            return;
        }
        boolean zW = StringsKt.W(path, "http", false);
        if (configuration == null && !zW) {
            BraintreeException braintreeException = new BraintreeException("Braintree HTTP GET request without configuration cannot have a relative path.", null);
            if (aVar != null) {
                aVar.c(null, braintreeException);
                return;
            }
            return;
        }
        if (authorization instanceof ClientToken) {
            try {
                str = new JSONObject(str).put("authorizationFingerprint", ((ClientToken) authorization).d).toString();
            } catch (JSONException e) {
                if (aVar != null) {
                    aVar.c(null, e);
                    return;
                }
                return;
            }
        }
        Intrinsics.g(str, "if (authorization is Cli…           data\n        }");
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.d = "POST";
        httpRequest.f13726a = path;
        httpRequest.c = str.getBytes(StandardCharsets.UTF_8);
        httpRequest.a("User-Agent", "braintree/android/4.49.1");
        if (!zW && configuration != null) {
            httpRequest.b = configuration.f13715a;
        }
        if (authorization instanceof TokenizationKey) {
            httpRequest.a("Client-Key", ((TokenizationKey) authorization).c);
        }
        if (authorization != null && (c = authorization.getC()) != null) {
            httpRequest.a("Authorization", "Bearer ".concat(c));
        }
        for (Map.Entry entry : map.entrySet()) {
            httpRequest.a((String) entry.getKey(), (String) entry.getValue());
        }
        this.f13704a.a(httpRequest, 0, aVar);
    }
}
