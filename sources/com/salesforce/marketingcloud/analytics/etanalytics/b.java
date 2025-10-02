package com.salesforce.marketingcloud.analytics.etanalytics;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.analytics.i;
import com.salesforce.marketingcloud.internal.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.j;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo
/* loaded from: classes6.dex */
public class b extends i {
    private static final int f = 0;
    final j d;
    private final l e;

    public class a extends g {
        final /* synthetic */ j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, j jVar) {
            super(str, objArr);
            this.b = jVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.b.m().a(0);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.b$b, reason: collision with other inner class name */
    public class C0351b extends g {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0351b(String str, Object[] objArr, long j) {
            super(str, objArr);
            this.b = j;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            if (b.this.d.m().c(0)) {
                return;
            }
            try {
                b.this.d.m().a(com.salesforce.marketingcloud.analytics.b.a(new Date(this.b), 0, 4), b.this.d.b());
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e, "Failed to create our EtAnalyticItem for TimeInApp.", new Object[0]);
            }
        }
    }

    public class c extends g {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr, long j) {
            super(str, objArr);
            this.b = j;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                List<com.salesforce.marketingcloud.analytics.b> listG = b.this.d.m().g(b.this.d.b());
                if (listG.isEmpty()) {
                    return;
                }
                for (com.salesforce.marketingcloud.analytics.b bVar : listG) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.b - bVar.b().getTime());
                    if (seconds > 0) {
                        bVar.b(seconds);
                        bVar.a(true);
                        b.this.d.m().b(bVar, b.this.d.b());
                    }
                }
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e, "Failed to update our EtAnalytic TimeInApp.", new Object[0]);
            }
        }
    }

    public class d extends g {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, long j) {
            super(str, objArr);
            this.b = j;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                List<com.salesforce.marketingcloud.analytics.b> listH = b.this.d.m().h(b.this.d.b());
                if (listH.isEmpty()) {
                    return;
                }
                for (com.salesforce.marketingcloud.analytics.b bVar : listH) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.b - bVar.b().getTime());
                    if (seconds > 0) {
                        bVar.b(seconds);
                        bVar.a(true);
                        b.this.d.m().b(bVar, b.this.d.b());
                    }
                }
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e, "Failed to update local storage for stopTimeInAllRegions.", new Object[0]);
            }
        }
    }

    public class e extends g {
        final /* synthetic */ Region b;
        final /* synthetic */ Date c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, Region region, Date date) {
            super(str, objArr);
            this.b = region;
            this.c = date;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            try {
                List<com.salesforce.marketingcloud.analytics.b> listB = b.this.d.m().b(this.b, b.this.d.b());
                if (listB.isEmpty()) {
                    return;
                }
                for (com.salesforce.marketingcloud.analytics.b bVar : listB) {
                    int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.c.getTime() - bVar.b().getTime());
                    if (seconds > 0) {
                        bVar.b(seconds);
                        bVar.a(true);
                        b.this.d.m().b(bVar, b.this.d.b());
                    }
                }
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e, "Failed to record EtAnalyticItem for stopTimeInRegion.", new Object[0]);
            }
        }
    }

    public b(@NonNull j jVar, @NonNull l lVar) {
        this.d = jVar;
        this.e = lVar;
    }

    private static void a(l lVar, j jVar) {
        lVar.b().execute(new a("delete_analytics", new Object[0], jVar));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.k
    public void b(@NonNull Region region) {
        Date date = new Date();
        b(region, date);
        if (region.regionType() == 3) {
            return;
        }
        this.e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), com.salesforce.marketingcloud.analytics.b.a(date, 0, 7, (List<String>) Collections.singletonList(region.id()), true)));
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void c(long j) {
        this.e.b().execute(new d("end_region_counter", new Object[0], j));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.AnalyticsManager
    public void trackInboxOpenEvent(@NonNull InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            com.salesforce.marketingcloud.g.e(AnalyticsManager.TAG, "InboxMessage was null. Call to trackInboxOpenEvent() ignored.", new Object[0]);
        } else {
            this.e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 15, Collections.singletonList(inboxMessage.id()), com.salesforce.marketingcloud.internal.b.b(inboxMessage), true)));
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(long j) {
        this.e.b().execute(new c("end_app_counter", new Object[0], j));
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void b(long j) {
        this.e.b().execute(new C0351b("start_app_counter", new Object[0], j));
    }

    private void b(@NonNull Region region, @NonNull Date date) {
        this.e.b().execute(new e("end_region_counter", new Object[0], region, date));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage) {
        a(System.currentTimeMillis());
        this.e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 5, notificationMessage, false)));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.k
    public void a(@NonNull Region region) {
        Date date = new Date();
        a(region, date);
        this.e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), com.salesforce.marketingcloud.analytics.b.a(date, 0, region.regionType() == 1 ? 6 : 12, (List<String>) Collections.singletonList(region.id()), true)));
    }

    public static void a(@NonNull j jVar, @NonNull l lVar, boolean z) {
        if (z) {
            a(lVar, jVar);
        }
    }

    private void a(@NonNull Region region, Date date) {
        this.e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), com.salesforce.marketingcloud.analytics.b.a(date, 0, region.regionType() == 1 ? 11 : 13, (List<String>) Collections.singletonList(region.id()), false)));
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(boolean z) {
        if (z) {
            a(this.e, this.d);
        }
    }
}
