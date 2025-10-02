package au.com.woolworths.android.onesite.analytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FirebasePerfMonitor;", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebasePerfMonitor {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4059a = new HashMap();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FirebasePerfMonitor$Companion;", "", "", "FIREBASE_PERF_HOMEPAGE_LOAD", "Ljava/lang/String;", "FIREBASE_PERF_COLD_START_LOAD", "FIREBASE_PERF_TOKEN_REFRESH", "FIREBASE_PERF_CONFIG_LOAD", "FIREBASE_PERF_ACCESS_LIST_LOAD", "FIREBASE_PERF_HOMEPAGE_SUCCESS_LOAD", "FIREBASE_PERF_HOMEPAGE_FAILED_LOAD", "FIREBASE_PERF_DYNAMIC_ONBOARDING_SUCCESS_LOAD", "FIREBASE_PERF_DYNAMIC_ONBOARDING_FAILED_LOAD", "FIREBASE_PERF_ECID_FIRST_TIME_SYNC", "FIREBASE_PERF_ECID_RE_SYNC", "FIREBASE_PERF_SNG_BEACON_SCAN_NATIVE", "FIREBASE_PERF_APPLICATION_ON_CREATE", "FIREBASE_PERF_PRODUCT_LIST_AD_LOADING_TIME", "FIREBASE_PERF_GOOGLE_AD_LOADING_TIMEOUT", "Metrics", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/FirebasePerfMonitor$Companion$Metrics;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Metrics {
        }
    }

    public static void b(FirebasePerfMonitor firebasePerfMonitor, String str) {
        firebasePerfMonitor.getClass();
        Trace trace = (Trace) firebasePerfMonitor.f4059a.get("app_start_interactive_state");
        if (trace != null) {
            trace.incrementMetric(str, 1L);
        }
    }

    public final void a(String str, String str2, String str3) {
        Trace trace = (Trace) this.f4059a.get(str);
        if (trace != null) {
            trace.putAttribute(str2, str3);
        }
    }

    public final void c(String str) {
        AndroidLogger androidLogger = FirebasePerformance.h;
        Intrinsics.g((FirebasePerformance) FirebaseApp.d().b(FirebasePerformance.class), "getInstance(...)");
        Trace trace = new Trace(str, TransportManager.v, new Clock(), AppStateMonitor.a(), GaugeManager.getInstance());
        trace.start();
        this.f4059a.put(str, trace);
    }

    public final void d(String str) {
        HashMap map = this.f4059a;
        Trace trace = (Trace) map.get(str);
        if (trace != null) {
            trace.stop();
        }
        map.remove(str);
    }
}
