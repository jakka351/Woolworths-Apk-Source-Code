package com.google.firebase.perf.metrics;

import androidx.work.impl.b;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes.dex */
public final class NetworkRequestMetricBuilder extends AppStateUpdateHandler implements SessionAwareObject {
    public static final AndroidLogger l = AndroidLogger.e();
    public final List d;
    public final GaugeManager e;
    public final TransportManager f;
    public final NetworkRequestMetric.Builder g;
    public final WeakReference h;
    public String i;
    public boolean j;
    public boolean k;

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkRequestMetricBuilder(TransportManager transportManager) {
        AppStateMonitor appStateMonitorA = AppStateMonitor.a();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(appStateMonitorA);
        this.g = NetworkRequestMetric.s0();
        this.h = new WeakReference(this);
        this.f = transportManager;
        this.e = gaugeManager;
        this.d = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    @Override // com.google.firebase.perf.session.SessionAwareObject
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            l.g("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        NetworkRequestMetric.Builder builder = this.g;
        if (!((NetworkRequestMetric) builder.e).k0() || ((NetworkRequestMetric) builder.e).q0()) {
            return;
        }
        this.d.add(perfSession);
    }

    public final void b() {
        List listUnmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.h);
        unregisterForAppState();
        synchronized (this.d) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.d) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArrB = PerfSession.b(listUnmodifiableList);
        if (perfSessionArrB != null) {
            NetworkRequestMetric.Builder builder = this.g;
            List listAsList = Arrays.asList(perfSessionArrB);
            builder.p();
            NetworkRequestMetric.V((NetworkRequestMetric) builder.e, listAsList);
        }
        NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.g.m();
        String str = this.i;
        if (str == null) {
            Pattern pattern = NetworkRequestMetricBuilderUtil.f15711a;
        } else if (NetworkRequestMetricBuilderUtil.f15711a.matcher(str).matches()) {
            l.a("Dropping network request from a 'User-Agent' that is not allowed");
            return;
        }
        if (this.j) {
            if (this.k) {
                l.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
        } else {
            TransportManager transportManager = this.f;
            transportManager.l.execute(new b(6, transportManager, networkRequestMetric, getAppState()));
            this.j = true;
        }
    }

    public final void c(String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case "GET":
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case "PUT":
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case "HEAD":
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case "POST":
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case "PATCH":
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case "TRACE":
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case "CONNECT":
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case "DELETE":
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            NetworkRequestMetric.Builder builder = this.g;
            builder.p();
            NetworkRequestMetric.W((NetworkRequestMetric) builder.e, httpMethod);
        }
    }

    public final void d(int i) {
        NetworkRequestMetric.Builder builder = this.g;
        builder.p();
        NetworkRequestMetric.N((NetworkRequestMetric) builder.e, i);
    }

    public final void e(long j) {
        NetworkRequestMetric.Builder builder = this.g;
        builder.p();
        NetworkRequestMetric.X((NetworkRequestMetric) builder.e, j);
    }

    public final void f(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.h);
        NetworkRequestMetric.Builder builder = this.g;
        builder.p();
        NetworkRequestMetric.Q((NetworkRequestMetric) builder.e, j);
        a(perfSession);
        if (perfSession.f) {
            this.e.collectGaugeMetricOnce(perfSession.e);
        }
    }

    public final void g(String str) {
        NetworkRequestMetric.Builder builder = this.g;
        if (str == null) {
            builder.p();
            NetworkRequestMetric.P((NetworkRequestMetric) builder.e);
            return;
        }
        if (str.length() <= 128) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31 && cCharAt <= 127) {
                }
            }
            builder.p();
            NetworkRequestMetric.O((NetworkRequestMetric) builder.e, str);
            return;
        }
        l.g("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void h(long j) {
        NetworkRequestMetric.Builder builder = this.g;
        builder.p();
        NetworkRequestMetric.Y((NetworkRequestMetric) builder.e, j);
    }

    public final void i(long j) {
        NetworkRequestMetric.Builder builder = this.g;
        builder.p();
        NetworkRequestMetric.T((NetworkRequestMetric) builder.e, j);
        if (SessionManager.getInstance().perfSession().f) {
            this.e.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().e);
        }
    }

    public final void j(String str) {
        HttpUrl httpUrlD;
        int iLastIndexOf;
        if (str != null) {
            HttpUrl.j.getClass();
            HttpUrl httpUrlD2 = HttpUrl.Companion.d(str);
            if (httpUrlD2 != null) {
                HttpUrl.Builder builderG = httpUrlD2.g();
                builderG.b = _UrlKt.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#", false);
                builderG.c = _UrlKt.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#", false);
                builderG.g = null;
                builderG.h = null;
                str = builderG.toString();
            }
            if (str.length() > 2000) {
                str = (str.charAt(2000) != '/' && (httpUrlD = HttpUrl.Companion.d(str)) != null && httpUrlD.b().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
            }
            NetworkRequestMetric.Builder builder = this.g;
            builder.p();
            NetworkRequestMetric.L((NetworkRequestMetric) builder.e, str);
        }
    }
}
