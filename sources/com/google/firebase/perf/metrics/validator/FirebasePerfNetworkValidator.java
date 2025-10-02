package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.URLAllowlist;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;

/* loaded from: classes.dex */
final class FirebasePerfNetworkValidator extends PerfMetricValidator {
    public static final AndroidLogger d = AndroidLogger.e();
    public final NetworkRequestMetric b;
    public final Context c;

    public FirebasePerfNetworkValidator(NetworkRequestMetric networkRequestMetric, Context context) {
        this.c = context;
        this.b = networkRequestMetric;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public final boolean b() {
        URI uriCreate;
        NetworkRequestMetric networkRequestMetric = this.b;
        String strJ0 = networkRequestMetric.j0();
        boolean zIsEmpty = strJ0 == null ? true : strJ0.trim().isEmpty();
        AndroidLogger androidLogger = d;
        if (zIsEmpty) {
            androidLogger.g("URL is missing:" + networkRequestMetric.j0());
            return false;
        }
        String strJ02 = networkRequestMetric.j0();
        if (strJ02 == null) {
            uriCreate = null;
        } else {
            try {
                uriCreate = URI.create(strJ02);
            } catch (IllegalArgumentException | IllegalStateException e) {
                androidLogger.h("getResultUrl throws exception %s", e.getMessage());
            }
        }
        if (uriCreate == null) {
            androidLogger.g("URL cannot be parsed");
            return false;
        }
        Context context = this.c;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            AndroidLogger.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (URLAllowlist.f15725a == null) {
                URLAllowlist.f15725a = resources.getStringArray(identifier);
            }
            String host = uriCreate.getHost();
            if (host != null) {
                for (String str : URLAllowlist.f15725a) {
                    if (!host.contains(str)) {
                    }
                }
                androidLogger.g("URL fails allowlist rule: " + uriCreate);
                return false;
            }
        }
        String host2 = uriCreate.getHost();
        if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
            androidLogger.g("URL host is null or invalid");
            return false;
        }
        String scheme = uriCreate.getScheme();
        if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
            androidLogger.g("URL scheme is null or invalid");
            return false;
        }
        if (uriCreate.getUserInfo() != null) {
            androidLogger.g("URL user info is null");
            return false;
        }
        int port = uriCreate.getPort();
        if (port != -1 && port <= 0) {
            androidLogger.g("URL port is less than or equal to 0");
            return false;
        }
        NetworkRequestMetric.HttpMethod httpMethodB0 = networkRequestMetric.l0() ? networkRequestMetric.b0() : null;
        if (httpMethodB0 == null || httpMethodB0 == NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) {
            androidLogger.g("HTTP Method is null or invalid: " + networkRequestMetric.b0());
            return false;
        }
        if (networkRequestMetric.m0() && networkRequestMetric.c0() <= 0) {
            androidLogger.g("HTTP ResponseCode is a negative value:" + networkRequestMetric.c0());
            return false;
        }
        if (networkRequestMetric.n0()) {
            if (!(networkRequestMetric.e0() >= 0)) {
                androidLogger.g("Request Payload is a negative value:" + networkRequestMetric.e0());
                return false;
            }
        }
        if (networkRequestMetric.o0()) {
            if (!(networkRequestMetric.f0() >= 0)) {
                androidLogger.g("Response Payload is a negative value:" + networkRequestMetric.f0());
                return false;
            }
        }
        if (!networkRequestMetric.k0() || networkRequestMetric.Z() <= 0) {
            androidLogger.g("Start time of the request is null, or zero, or a negative value:" + networkRequestMetric.Z());
            return false;
        }
        if (networkRequestMetric.p0()) {
            if (!(networkRequestMetric.g0() >= 0)) {
                androidLogger.g("Time to complete the request is a negative value:" + networkRequestMetric.g0());
                return false;
            }
        }
        if (networkRequestMetric.r0()) {
            if (!(networkRequestMetric.i0() >= 0)) {
                androidLogger.g("Time from the start of the request to the start of the response is null or a negative value:" + networkRequestMetric.i0());
                return false;
            }
        }
        if (!networkRequestMetric.q0() || networkRequestMetric.h0() <= 0) {
            androidLogger.g("Time from the start of the request to the end of the response is null, negative or zero:" + networkRequestMetric.h0());
            return false;
        }
        if (networkRequestMetric.m0()) {
            return true;
        }
        androidLogger.g("Did not receive a HTTP Response Code");
        return false;
    }
}
