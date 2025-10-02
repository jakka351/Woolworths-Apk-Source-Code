package com.google.firebase.perf.network;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* loaded from: classes.dex */
public final class NetworkRequestMetricBuilderUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f15711a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            AndroidLogger.e().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void c(NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        if (!((NetworkRequestMetric) networkRequestMetricBuilder.g.e).m0()) {
            NetworkRequestMetric.Builder builder = networkRequestMetricBuilder.g;
            builder.p();
            NetworkRequestMetric.M((NetworkRequestMetric) builder.e);
        }
        networkRequestMetricBuilder.b();
    }
}
