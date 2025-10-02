package com.salesforce.marketingcloud.analytics.piwama;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.analytics.PiCart;
import com.salesforce.marketingcloud.analytics.PiOrder;
import com.salesforce.marketingcloud.http.c;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class i extends com.salesforce.marketingcloud.analytics.i implements c.InterfaceC0362c {
    static final String h = "user_id";
    static final String i = "session_id";

    @VisibleForTesting
    static final int j = 100;
    private static final int k = 30;
    private static final String l = "et_background_time_cache";
    static final String m = com.salesforce.marketingcloud.g.a("PiWamaAnalytic");
    private static final int n = 1;
    private static j o;
    final com.salesforce.marketingcloud.storage.j d;
    final com.salesforce.marketingcloud.http.c e;
    private final MarketingCloudConfig f;
    final com.salesforce.marketingcloud.internal.l g;

    public class a extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ com.salesforce.marketingcloud.storage.j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, com.salesforce.marketingcloud.storage.j jVar) {
            super(str, objArr);
            this.b = jVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.b.m().g(1);
        }
    }

    public class b implements Comparator<com.salesforce.marketingcloud.analytics.b> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.salesforce.marketingcloud.analytics.b bVar, com.salesforce.marketingcloud.analytics.b bVar2) {
            if (bVar.f() == null) {
                return bVar2.f() == null ? 0 : -1;
            }
            if (bVar2.f() == null) {
                return 1;
            }
            return bVar.f().compareTo(bVar2.f());
        }
    }

    public class c extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr, long j) {
            super(str, objArr);
            this.b = j;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                com.salesforce.marketingcloud.storage.a aVarM = i.this.d.m();
                for (com.salesforce.marketingcloud.analytics.b bVar : aVarM.i(i.this.d.b())) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.b - bVar.b().getTime());
                    if (seconds > 0) {
                        bVar.b(seconds);
                        bVar.a(true);
                        bVar.d(i.this.a());
                        aVarM.b(bVar, i.this.d.b());
                    }
                }
                com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(new Date(this.b), 1, 2);
                bVarA.d(i.this.a());
                bVarA.a(true);
                bVarA.c(new com.salesforce.marketingcloud.analytics.piwama.b(new Date(this.b)).c().toString());
                aVarM.a(bVarA, i.this.d.b());
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(i.m, e, "Failed to update our PiWama TimeInApp.", new Object[0]);
            }
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ NotificationMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, NotificationMessage notificationMessage) {
            super(str, objArr);
            this.b = notificationMessage;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (i.this.d.m().c(1)) {
                i.this.a(System.currentTimeMillis());
            }
            Date date = new Date();
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.b.id());
            Region region = this.b.region();
            if (region != null) {
                arrayList.add(region.id());
            }
            com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(date, 1, 5, (List<String>) arrayList, false);
            bVarA.d(i.this.a());
            bVarA.c(new com.salesforce.marketingcloud.analytics.piwama.e(date, true, bVarA.i()).c().toString());
            i.this.g.b().execute(new com.salesforce.marketingcloud.analytics.a(i.this.d.m(), i.this.d.b(), bVarA));
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        public e(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            i iVar = i.this;
            i.a(iVar.e, iVar.d.m().o(i.this.d.b()));
        }
    }

    public i(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar, @NonNull com.salesforce.marketingcloud.http.c cVar, @NonNull com.salesforce.marketingcloud.internal.l lVar) {
        com.salesforce.marketingcloud.util.j.a(marketingCloudConfig, "MarketingCloudConfig may not be null.");
        this.d = (com.salesforce.marketingcloud.storage.j) com.salesforce.marketingcloud.util.j.a(jVar, "MCStorage may not be null.");
        this.e = (com.salesforce.marketingcloud.http.c) com.salesforce.marketingcloud.util.j.a(cVar, "RequestManager may not be null.");
        this.f = marketingCloudConfig;
        o = a(marketingCloudConfig) ? new k(marketingCloudConfig, jVar) : new com.salesforce.marketingcloud.analytics.piwama.a(marketingCloudConfig, jVar);
        cVar.a(com.salesforce.marketingcloud.http.a.i, this);
        this.g = lVar;
    }

    private void a(@NonNull com.salesforce.marketingcloud.analytics.piwama.c cVar, long j2) throws IllegalArgumentException {
        JSONObject jSONObjectC = cVar.c();
        if (jSONObjectC == null) {
            throw new IllegalArgumentException("Failed to convert your input type to a JSON Object.");
        }
        try {
            com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(new Date(j2), 1, cVar.b());
            bVarA.d(a());
            bVarA.c(jSONObjectC.toString());
            bVarA.a(true);
            if (TextUtils.isEmpty(bVarA.e())) {
                return;
            }
            this.g.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), bVarA));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(m, e2, "Failed to record PiWamaItem in local storage.", new Object[0]);
            throw new IllegalArgumentException("Failed to record PiWamaItem in local storage.");
        }
    }

    private void b() {
        long j2 = this.d.f().getLong(l, -1L);
        if (j2 != -1) {
            this.d.f().edit().remove(l).apply();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(12, -30);
            if (calendar.before(calendar2)) {
                this.d.c().a(com.salesforce.marketingcloud.storage.c.f);
            }
        }
    }

    public void c() {
        this.g.b().execute(new e("send_pi_analytics", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    @Nullable
    public String getPiIdentifier() {
        return this.d.c().b("predictive_intelligence_identifier", null);
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void setPiIdentifier(@Nullable @Size String str) {
        if (str == null) {
            this.d.c().a("predictive_intelligence_identifier");
        } else {
            this.d.c().a("predictive_intelligence_identifier", str.trim());
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartContents(@NonNull PiCart piCart) {
        if (piCart != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                a(new f(piCart, new Date(jCurrentTimeMillis)), jCurrentTimeMillis);
            } catch (Exception e2) {
                com.salesforce.marketingcloud.g.b(m, e2, "Failed to add PiWamaAnalytic for trackCartContents.  See LogCat for details.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackCartConversion(@NonNull PiOrder piOrder) {
        if (piOrder != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                a(new g(piOrder, new Date(jCurrentTimeMillis)), jCurrentTimeMillis);
            } catch (IllegalArgumentException e2) {
                com.salesforce.marketingcloud.g.b(m, e2, "Failed to add PiWamaAnalytic for trackCartConversion.  See LogCat for details.", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackPageView(@NonNull @Size String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            a(new h(str, str2, str3, str4, new Date(jCurrentTimeMillis)), jCurrentTimeMillis);
        } catch (IllegalArgumentException e2) {
            com.salesforce.marketingcloud.g.b(m, e2, "Failed to record PiWamaItem for trackPageView.", new Object[0]);
        }
    }

    private static void a(com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.internal.l lVar) {
        lVar.b().execute(new a("deleting_pi_analytics", new Object[0], jVar));
    }

    @VisibleForTesting
    public static List<List<com.salesforce.marketingcloud.analytics.b>> b(List<com.salesforce.marketingcloud.analytics.b> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = size; i3 > 0; i3 -= 100) {
            int i4 = i2 * 100;
            i2++;
            int i5 = i2 * 100;
            if (i5 > size) {
                i5 = i3 + i4;
            }
            arrayList.add(new ArrayList(list.subList(i4, i5)));
        }
        return arrayList;
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(long j2) {
        this.d.f().edit().putLong(l, j2).apply();
        this.g.b().execute(new c("end_time_in_app", new Object[0], j2));
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void b(long j2) {
        Date date = new Date(j2);
        b();
        if (this.d.m().c(1)) {
            return;
        }
        try {
            com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(date, 1, 5);
            bVarA.c(new com.salesforce.marketingcloud.analytics.piwama.e(date, false, Collections.EMPTY_LIST).c().toString());
            this.g.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), bVarA));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(m, e2, "Failed to create WamaItem for TimeInApp.", new Object[0]);
        }
    }

    public String a() {
        String piIdentifier = getPiIdentifier();
        return (piIdentifier == null && this.f.useLegacyPiIdentifier()) ? com.salesforce.marketingcloud.registration.d.a(this.d) : piIdentifier;
    }

    private boolean a(@NonNull MarketingCloudConfig marketingCloudConfig) {
        String strTrim = marketingCloudConfig.predictiveIntelligenceServerUrl().toLowerCase(Locale.ENGLISH).trim();
        return (strTrim.startsWith("https://stage.app.igodigital.com/api/v1/collect/qa/qa1s1/process_batch") || strTrim.startsWith("https://stage.app.igodigital.com/api/v1/collect/qa/qa3s1/process_batch") || strTrim.startsWith("https://app.igodigital.com/api/v1/collect/process_batch")) ? false : true;
    }

    @Override // com.salesforce.marketingcloud.http.c.InterfaceC0362c
    public void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
        if (!dVar.g()) {
            com.salesforce.marketingcloud.g.c(m, "Request failed: %d - %s", Integer.valueOf(dVar.b()), dVar.e());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(dVar.a());
            a(com.salesforce.marketingcloud.analytics.c.a(bVar.q() != null ? bVar.q() : ""), jSONObject.getString(h), jSONObject.getString(i));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(m, e2, "Error parsing response.", new Object[0]);
        }
    }

    private void a(String[] strArr, String str, String str2) {
        this.d.c().a(com.salesforce.marketingcloud.storage.c.g, str);
        this.d.c().a(com.salesforce.marketingcloud.storage.c.f, str2);
        if (strArr != null) {
            this.g.b().execute(new com.salesforce.marketingcloud.analytics.d(this.d.m(), strArr));
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage) {
        try {
            this.g.b().execute(new d("notification_opened", new Object[0], notificationMessage));
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(m, e2, "Failed to store our WamaItem for message opened.", new Object[0]);
        }
    }

    public static List<List<com.salesforce.marketingcloud.analytics.b>> a(List<com.salesforce.marketingcloud.analytics.b> list) {
        ArrayList arrayList = new ArrayList();
        Collections.sort(list, new b());
        ArrayList arrayList2 = new ArrayList();
        String strF = null;
        for (com.salesforce.marketingcloud.analytics.b bVar : list) {
            if ((strF == null || !strF.equals(bVar.f())) && bVar.f() != null) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                }
                strF = bVar.f();
                arrayList2 = new ArrayList();
                arrayList2.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    @WorkerThread
    public static void a(com.salesforce.marketingcloud.http.c cVar, List<com.salesforce.marketingcloud.analytics.b> list) {
        MarketingCloudSdk marketingCloudSdk;
        if ((!MarketingCloudSdk.isReady() && !MarketingCloudSdk.isInitializing()) || (marketingCloudSdk = MarketingCloudSdk.getInstance()) == null || list.isEmpty()) {
            return;
        }
        Iterator<List<com.salesforce.marketingcloud.analytics.b>> it = a(list).iterator();
        while (it.hasNext()) {
            for (List<com.salesforce.marketingcloud.analytics.b> list2 : b(it.next())) {
                com.salesforce.marketingcloud.http.b bVarA = o.a(marketingCloudSdk.getRegistrationManager(), marketingCloudSdk.getPushMessageManager(), marketingCloudSdk.getRegionMessageManager(), list2);
                bVarA.a(com.salesforce.marketingcloud.analytics.c.a(list2));
                cVar.a(bVarA);
            }
        }
    }

    public static void a(com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.http.c cVar, com.salesforce.marketingcloud.internal.l lVar, boolean z) {
        if (z) {
            a(jVar, lVar);
            jVar.c().a("predictive_intelligence_identifier");
        }
        cVar.a(com.salesforce.marketingcloud.http.a.i);
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(boolean z) {
        if (z) {
            a(this.d, this.g);
        }
        com.salesforce.marketingcloud.http.c cVar = this.e;
        if (cVar != null) {
            cVar.a(com.salesforce.marketingcloud.http.a.i);
        }
    }
}
