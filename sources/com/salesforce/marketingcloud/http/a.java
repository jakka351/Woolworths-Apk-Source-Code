package com.salesforce.marketingcloud.http;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.medallia.digital.mobilesdk.l8;
import com.medallia.digital.mobilesdk.q2;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.http.b;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.l;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.oriient.internal.infra.rest.RequestBuilder;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'k' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@SuppressLint
/* loaded from: classes6.dex */
public final class a {
    public static final a h = new a("ET_ANALYTICS", 0, "POST", 1, "/device/v1/event/analytic", "application/json", "application/json", "analytics_next_retry_time");
    public static final a i = new a("PI_ANALYTICS", 1, "POST", 2, "{0}", "application/json", "application/json", "piwama_next_retry_time");
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;

    @RestrictTo
    public static final String s = "X-Subscriber-Token";
    private static final String t = "Bearer %s";
    private static final String u;
    private static final long v = 86400000;
    private static final /* synthetic */ a[] w;

    /* renamed from: a, reason: collision with root package name */
    public final int f16909a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;

    /* renamed from: com.salesforce.marketingcloud.http.a$a, reason: collision with other inner class name */
    public static class C0360a {

        /* renamed from: a, reason: collision with root package name */
        static final int f16910a = 1;
        static final int b = 2;

        private C0360a() {
        }
    }

    static {
        a aVar = new a("INBOX_MESSAGE", 2, "GET", 1, "/device/v1/{0}/message/?deviceid={1}&messagetype=8&contenttype=2", "application/json", "application/json", "inbox_next_retry_time");
        j = aVar;
        k = new a("USER_INITIATED_INBOX_MESSAGE", 3, aVar.f, aVar.f16909a, aVar.b, aVar.d, aVar.e, aVar.c, l8.b.b);
        l = new a("INBOX_STATUS", 4, "PATCH", 1, "/device/v1/{0}/message", "application/json", "application/json", "inbox_status_next_retry_time");
        m = new a("GEOFENCE_MESSAGE", 5, "GET", 1, "/device/v1/location/{0}/fence/?latitude={1,number,#.########}&longitude={2,number,#.########}&deviceid={3}", "application/json", "application/json", "geofence_next_retry_time");
        n = new a("PROXIMITY_MESSAGES", 6, "GET", 1, "/device/v1/location/{0}/proximity/?latitude={1,number,#.########}&longitude={2,number,#.########}&deviceid={3}", "application/json", "application/json", "proximity_next_retry_time");
        o = new a("REGISTRATION", 7, "POST", 1, "/device/v1/registration", "application/json", "application/json", "registration_next_retry_time", l8.b.b);
        p = new a("SYNC", 8, "POST", 1, "/device/v1/{0}/sync/{1}", "application/json", "application/json", "sync_next_retry_time");
        q = new a("DEVICE_STATS", 9, "POST", 1, "/devicestatistics/v1/analytic", "application/json", "application/json", "et_device_stats_retry_after");
        r = new a("EVENTS", 10, "POST", 1, "/devicestatistics/v1/event", "application/json", "application/json", "et_events_retry_after");
        w = a();
        Locale locale = l.f17084a;
        u = androidx.constraintlayout.core.state.a.l(YU.a.v("MarketingCloudSdk/", MarketingCloudSdk.getSdkVersionName(), " (Android ", Build.VERSION.RELEASE, "; %s; "), Build.MANUFACTURER, q2.c, Build.MODEL, ") %s/%s");
    }

    private a(String str, int i2, String str2, int i3, String str3, String str4, String str5, String str6) {
        this(str, i2, str2, i3, str3, str4, str5, str6, 0L);
    }

    private static /* synthetic */ a[] a() {
        return new a[]{h, i, j, k, l, m, n, o, p, q, r};
    }

    private String b(MarketingCloudConfig marketingCloudConfig) {
        return String.format(l.f17084a, u, Locale.getDefault(), marketingCloudConfig.getAppPackageName(), marketingCloudConfig.getAppVersionName());
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) w.clone();
    }

    public long c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong(this.c, 0L);
    }

    private a(String str, int i2, String str2, int i3, String str3, String str4, String str5, String str6, long j2) {
        this.f = str2;
        this.f16909a = i3;
        this.b = str3;
        this.d = str4;
        this.e = str5;
        this.c = str6;
        this.g = j2 < 0 ? 0L : j2;
    }

    public static Object[] b(String str, String str2) {
        return new Object[]{str, str2};
    }

    public static Object[] c(String str, String str2) {
        return new Object[]{str, str2};
    }

    public long a(SharedPreferences sharedPreferences) {
        if (this.g > 0) {
            return sharedPreferences.getLong(YU.a.o(new StringBuilder(), this.c, "_device"), 0L);
        }
        return 0L;
    }

    public void b(@NonNull SharedPreferences sharedPreferences) {
        if (this.g > 0) {
            sharedPreferences.edit().putLong(YU.a.o(new StringBuilder(), this.c, "_device"), System.currentTimeMillis() + this.g).apply();
        }
    }

    private String a(String str, String str2) throws MalformedURLException {
        if (str.endsWith(q2.c)) {
            str = androidx.compose.ui.input.pointer.a.h(1, 0, str);
        }
        Locale locale = l.f17084a;
        return new URL(YU.a.g(str, str2)).toString();
    }

    @NonNull
    private String a(@NonNull MarketingCloudConfig marketingCloudConfig) {
        return this.f16909a == 1 ? marketingCloudConfig.marketingCloudServerUrl() : marketingCloudConfig.predictiveIntelligenceServerUrl();
    }

    public static Object[] a(String str) {
        return new Object[]{str};
    }

    public void a(@NonNull SharedPreferences sharedPreferences, @NonNull d dVar) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (dVar.g() && this.g > 0) {
            editorEdit.putLong(YU.a.o(new StringBuilder(), this.c, "_device"), dVar.c() + this.g);
        }
        List<String> list = dVar.d().get("Retry-After");
        if (list != null && !list.isEmpty()) {
            try {
                long j2 = Long.parseLong(list.get(0)) * 1000;
                String str = this.c;
                long jC = dVar.c();
                if (j2 > 86400000) {
                    j2 = 86400000;
                }
                editorEdit.putLong(str, jC + j2);
            } catch (Exception e) {
                g.a("MCRequest", e, "Unable to parse Retry-After value.", new Object[0]);
            }
        }
        editorEdit.apply();
    }

    public static Object[] a(String str, String str2, LatLon latLon) {
        return new Object[]{str, Double.valueOf(latLon.latitude()), Double.valueOf(latLon.longitude()), str2};
    }

    public static void a(@Nullable Map<String, List<String>> map, @NonNull com.salesforce.marketingcloud.storage.c cVar) {
        List<String> list;
        String str;
        if (map == null || map.isEmpty() || (list = map.get(s)) == null || list.isEmpty() || (str = list.get(0)) == null || str.isEmpty()) {
            return;
        }
        cVar.a(com.salesforce.marketingcloud.storage.c.j, str);
    }

    public static boolean a(@NonNull j jVar) {
        return jVar.c().b(com.salesforce.marketingcloud.storage.c.j, null) != null;
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, String str) {
        return a(marketingCloudConfig, cVar, a(marketingCloudConfig), this.b, str, null);
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, String str, @Nullable String str2) {
        String strA = a(marketingCloudConfig);
        if (str2 == null) {
            str2 = this.b;
        }
        return a(marketingCloudConfig, cVar, strA, str2, str, null);
    }

    private b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, @NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable Map<String, String> map) {
        try {
            String strA = a(str, str2);
            g.d("MCRequest", "Executing %s request ...", strA);
            b.a aVarD = b.b().b(this.f).a(this).a(this.d).d(strA);
            if (str3 != null) {
                aVarD.c(str3);
            }
            aVarD.a("User-Agent", b(marketingCloudConfig));
            Locale locale = l.f17084a;
            aVarD.a("Authorization", "Bearer " + marketingCloudConfig.accessToken());
            aVarD.a(RequestBuilder.ACCEPT, this.e);
            aVarD.a("X-SDK-Version", MarketingCloudSdk.getSdkVersionName());
            String strB = cVar.b(com.salesforce.marketingcloud.storage.c.j, null);
            if (strB != null) {
                aVarD.a(s, strB);
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    aVarD.a(entry.getKey(), entry.getValue());
                }
            }
            return aVarD.a();
        } catch (Exception e) {
            g.b("MCRequest", e, "Failed to execute request.", new Object[0]);
            return null;
        }
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, @NonNull Object[] objArr) {
        return a(marketingCloudConfig, cVar, a(marketingCloudConfig), new MessageFormat(this.b, l.f17084a).format(objArr), null, null);
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, Object[] objArr, String str) {
        return a(marketingCloudConfig, cVar, a(marketingCloudConfig), new MessageFormat(this.b, l.f17084a).format(objArr), str, null);
    }

    public b a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.c cVar, Object[] objArr, String str, Map<String, String> map) {
        return a(marketingCloudConfig, cVar, a(marketingCloudConfig), new MessageFormat(this.b, l.f17084a).format(objArr), str, map);
    }
}
