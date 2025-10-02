package com.salesforce.marketingcloud.messages.inbox;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.inbox.InboxMessageManager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class c implements InboxMessageManager {
    final com.salesforce.marketingcloud.storage.j d;
    final com.salesforce.marketingcloud.analytics.g e;
    final com.salesforce.marketingcloud.http.c f;
    final MarketingCloudConfig g;
    final String h;
    private final com.salesforce.marketingcloud.alarms.b j;
    private final l k;

    @GuardedBy
    private InboxMessageManager.InboxRefreshListener m;
    private boolean n;
    private final Set<InboxMessageManager.InboxResponseListener> i = new ArraySet(0);
    private final Object l = new Object();

    public class a extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.d.q().b(TextUtils.split(this.b, ","));
        }
    }

    public class b implements MarketingCloudSdk.WhenReadyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.http.a f17014a;

        public b(com.salesforce.marketingcloud.http.a aVar) {
            this.f17014a = aVar;
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
        public void ready(@NonNull MarketingCloudSdk marketingCloudSdk) {
            c cVar = c.this;
            cVar.f.a(this.f17014a.a(cVar.g, cVar.d.c(), com.salesforce.marketingcloud.http.a.b(c.this.g.applicationId(), c.this.h)));
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.inbox.c$c, reason: collision with other inner class name */
    public class C0371c extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ com.salesforce.marketingcloud.storage.h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0371c(String str, Object[] objArr, com.salesforce.marketingcloud.storage.h hVar) {
            super(str, objArr);
            this.b = hVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.b.h();
        }
    }

    public class d extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ InboxMessage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, InboxMessage inboxMessage) {
            super(str, objArr);
            this.b = inboxMessage;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.d.q().a(this.b, c.this.d.b());
        }
    }

    public class e extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.setMessageRead(this.b);
        }
    }

    public class f extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.d.q().c(this.b);
        }
    }

    public class g extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.b = str2;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.d.q().d(this.b);
        }
    }

    public class h extends com.salesforce.marketingcloud.internal.g {
        public h(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.d.q().j();
        }
    }

    public class i extends com.salesforce.marketingcloud.internal.g {
        public i(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            c.this.d.q().b();
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b(false);
        }
    }

    public class k extends com.salesforce.marketingcloud.internal.g {
        final /* synthetic */ List b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k kVar = k.this;
                c.this.a(kVar.b);
                c.this.b(true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, Object[] objArr, List list) {
            super(str, objArr);
            this.b = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
        @Override // com.salesforce.marketingcloud.internal.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                r9 = this;
                com.salesforce.marketingcloud.messages.inbox.c r0 = com.salesforce.marketingcloud.messages.inbox.c.this
                com.salesforce.marketingcloud.storage.j r0 = r0.d
                com.salesforce.marketingcloud.storage.h r0 = r0.q()
                com.salesforce.marketingcloud.messages.inbox.c r1 = com.salesforce.marketingcloud.messages.inbox.c.this
                com.salesforce.marketingcloud.storage.j r1 = r1.d
                com.salesforce.marketingcloud.util.c r1 = r1.b()
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.List r3 = r9.b
                int r3 = r3.size()
                r2.<init>(r3)
                java.util.List r3 = r9.b
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L9e
                java.util.List r3 = r9.b
                java.util.Iterator r3 = r3.iterator()
            L29:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L9e
                java.lang.Object r4 = r3.next()
                com.salesforce.marketingcloud.messages.inbox.InboxMessage r4 = (com.salesforce.marketingcloud.messages.inbox.InboxMessage) r4
                java.lang.String r5 = r4.id()
                r2.add(r5)
                java.lang.String r5 = r4.id()
                com.salesforce.marketingcloud.storage.h$b r5 = r0.f(r5)
                r6 = 1
                if (r5 == 0) goto L91
                java.lang.String r7 = r5.b
                if (r7 != 0) goto L56
                boolean r7 = r5.e
                com.salesforce.marketingcloud.internal.b.a(r4, r7)
                boolean r7 = r5.d
                com.salesforce.marketingcloud.internal.b.c(r4, r7)
                goto L6e
            L56:
                java.lang.String r8 = com.salesforce.marketingcloud.internal.b.a(r4)
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L6e
                boolean r7 = r5.e
                com.salesforce.marketingcloud.internal.b.a(r4, r7)
                boolean r7 = r5.d
                com.salesforce.marketingcloud.internal.b.c(r4, r7)
                java.util.Date r7 = r5.c
                if (r7 != 0) goto L70
            L6e:
                r7 = r6
                goto L71
            L70:
                r7 = 0
            L71:
                boolean r8 = r5.f
                com.salesforce.marketingcloud.internal.b.b(r4, r8)
                int r8 = com.salesforce.marketingcloud.internal.b.c(r4)
                if (r8 <= 0) goto L7f
                com.salesforce.marketingcloud.internal.b.c(r4, r6)
            L7f:
                boolean r8 = r5.e
                if (r8 != 0) goto L8d
                boolean r5 = r5.d
                if (r5 == 0) goto L90
                int r5 = com.salesforce.marketingcloud.internal.b.c(r4)
                if (r5 != 0) goto L90
            L8d:
                com.salesforce.marketingcloud.internal.b.b(r4, r6)
            L90:
                r6 = r7
            L91:
                r0.a(r4, r1)
                if (r6 == 0) goto L29
                com.salesforce.marketingcloud.messages.inbox.c r5 = com.salesforce.marketingcloud.messages.inbox.c.this
                com.salesforce.marketingcloud.analytics.g r5 = r5.e
                r5.a(r4)
                goto L29
            L9e:
                r0.a(r2)
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.salesforce.marketingcloud.messages.inbox.c$k$a r1 = new com.salesforce.marketingcloud.messages.inbox.c$k$a
                r1.<init>()
                r0.post(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.inbox.c.k.a():void");
        }
    }

    public c(MarketingCloudConfig marketingCloudConfig, com.salesforce.marketingcloud.storage.j jVar, String str, com.salesforce.marketingcloud.alarms.b bVar, com.salesforce.marketingcloud.http.c cVar, com.salesforce.marketingcloud.analytics.g gVar, l lVar) {
        this.g = marketingCloudConfig;
        this.d = jVar;
        this.h = str;
        this.j = bVar;
        this.f = cVar;
        this.e = gVar;
        this.k = lVar;
    }

    public void a() {
        this.n = false;
        d();
    }

    public void b() {
        this.n = true;
        a(false);
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.salesforce.marketingcloud.storage.db.g.e, this.d.q().n(this.d.b()));
            return jSONObject;
        } catch (JSONException e2) {
            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e2, "Failed to create our component state JSONObject.", new Object[0]);
            return null;
        }
    }

    public void d() {
        List<h.b> listI = this.d.q().i();
        int size = listI.size();
        if (size > 0) {
            ArrayList arrayList = new ArrayList(size);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("deviceId", this.h);
                String strA = com.salesforce.marketingcloud.util.l.a(new Date());
                for (h.b bVar : listI) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("actionParameters", jSONObject);
                    jSONObject2.put("messageId", bVar.f17067a);
                    jSONObject2.put("actionDate", strA);
                    jSONObject2.put(UrlHandler.ACTION, bVar.e ? "Deleted" : "Viewed");
                    jSONArray.put(jSONObject2);
                    arrayList.add(bVar.f17067a);
                }
                com.salesforce.marketingcloud.http.b bVarA = com.salesforce.marketingcloud.http.a.l.a(this.g, this.d.c(), com.salesforce.marketingcloud.http.a.a(this.g.applicationId()), jSONArray.toString());
                bVarA.a(TextUtils.join(",", arrayList));
                this.f.a(bVarA);
            } catch (JSONException e2) {
                com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e2, "Failed to create Inbox status payload.  Status updates not sent to Marketing Cloud", new Object[0]);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void deleteMessage(@Nullable InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, "InboxMessage was null and could not be updated.  Call to deleteMessage() ignored.", new Object[0]);
        } else {
            com.salesforce.marketingcloud.internal.b.a(inboxMessage, true);
            deleteMessage(inboxMessage.id());
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void disableInbox() {
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void enableInbox() {
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getDeletedMessageCount() {
        return this.d.q().a(h.a.DELETED);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getDeletedMessages() {
        return this.d.q().a(this.d.b(), h.a.DELETED);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getMessageCount() {
        return this.d.q().a(h.a.NOT_DELETED);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getMessages() {
        return this.d.q().a(this.d.b(), h.a.NOT_DELETED);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getReadMessageCount() {
        return this.d.q().a(h.a.READ);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getReadMessages() {
        return this.d.q().a(this.d.b(), h.a.READ);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public int getUnreadMessageCount() {
        return this.d.q().a(h.a.UNREAD);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    @NonNull
    public List<InboxMessage> getUnreadMessages() {
        return this.d.q().a(this.d.b(), h.a.UNREAD);
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public boolean isInboxEnabled() {
        return true;
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void markAllMessagesDeleted() {
        this.k.b().execute(new i("delete_all", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void markAllMessagesRead() {
        this.k.b().execute(new h("mark_all_read", new Object[0]));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void refreshInbox(InboxMessageManager.InboxRefreshListener inboxRefreshListener) {
        synchronized (this.l) {
            if (this.m == null) {
                this.m = inboxRefreshListener;
                com.salesforce.marketingcloud.g.d(InboxMessageManager.TAG, "Refreshing inbox messages", new Object[0]);
                a(true);
            } else {
                com.salesforce.marketingcloud.g.d(InboxMessageManager.TAG, "Refresh already in progress.", new Object[0]);
                try {
                    inboxRefreshListener.onRefreshComplete(false);
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e2, "Error delivering Refresh Complete result to %s", inboxRefreshListener.getClass().getName());
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void registerInboxResponseListener(@NonNull InboxMessageManager.InboxResponseListener inboxResponseListener) {
        if (inboxResponseListener != null) {
            synchronized (this.i) {
                this.i.add(inboxResponseListener);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void setMessageRead(@Nullable InboxMessage inboxMessage) {
        if (inboxMessage == null) {
            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, "InboxMessage was null and could not be updated.  Call to setMessageRead() ignored.", new Object[0]);
        } else {
            com.salesforce.marketingcloud.internal.b.c(inboxMessage, true);
            setMessageRead(inboxMessage.id());
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void unregisterInboxResponseListener(@NonNull InboxMessageManager.InboxResponseListener inboxResponseListener) {
        synchronized (this.i) {
            this.i.remove(inboxResponseListener);
        }
    }

    private void a(boolean z) {
        MarketingCloudSdk.requestSdk(new b(z ? com.salesforce.marketingcloud.http.a.k : com.salesforce.marketingcloud.http.a.j));
    }

    public void b(boolean z) {
        synchronized (this.l) {
            InboxMessageManager.InboxRefreshListener inboxRefreshListener = this.m;
            if (inboxRefreshListener != null) {
                try {
                    inboxRefreshListener.onRefreshComplete(z);
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e2, "InboxRefreshListener threw an exception", new Object[0]);
                }
                this.m = null;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void deleteMessage(@NonNull String str) {
        this.k.b().execute(new f("inbox_delete", new Object[0], str));
    }

    @Override // com.salesforce.marketingcloud.messages.inbox.InboxMessageManager
    public void setMessageRead(@NonNull String str) {
        this.k.b().execute(new g("mark_read", new Object[0], str));
    }

    public void a(InboxMessage inboxMessage) {
        this.k.b().execute(new d("inbox_push_received", new Object[0], inboxMessage));
        if (this.n) {
            a(false);
        }
    }

    @VisibleForTesting
    public void b(@NonNull List<InboxMessage> list) {
        this.k.b().execute(new k("inbox_updated", new Object[0], list));
    }

    public void a(@NonNull NotificationMessage notificationMessage) {
        if (this.g.markMessageReadOnInboxNotificationOpen()) {
            this.k.b().execute(new e("inbox_notification_opened", new Object[0], notificationMessage.id()));
        }
    }

    public void b(int i2, String str) {
        com.salesforce.marketingcloud.g.c(InboxMessageManager.TAG, "Request failed: %d - %s", Integer.valueOf(i2), str);
        this.j.b(a.EnumC0346a.f);
    }

    public void a(List<InboxMessage> list) {
        synchronized (this.i) {
            if (!this.i.isEmpty()) {
                for (InboxMessageManager.InboxResponseListener inboxResponseListener : this.i) {
                    if (inboxResponseListener != null) {
                        try {
                            inboxResponseListener.onInboxMessagesChanged(list);
                        } catch (Exception e2) {
                            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e2, "%s threw an exception while processing the inbox messages response", inboxResponseListener.getClass().getName());
                        }
                    }
                }
            }
        }
    }

    public void a(int i2, String str) {
        com.salesforce.marketingcloud.g.c(InboxMessageManager.TAG, "Request failed: %d - %s", Integer.valueOf(i2), str);
        new Handler(Looper.getMainLooper()).post(new j());
    }

    public void a(com.salesforce.marketingcloud.http.b bVar) {
        if (bVar.q() != null) {
            this.j.c(a.EnumC0346a.f);
            this.k.b().execute(new a("inbox_status_updated", new Object[0], bVar.q()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.salesforce.marketingcloud.messages.inbox.c] */
    public void a(com.salesforce.marketingcloud.http.d dVar) {
        int length;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(dVar.a()).optJSONArray(com.salesforce.marketingcloud.storage.db.i.e);
            ?? arrayList = Collections.EMPTY_LIST;
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        arrayList.add(new InboxMessage(jSONArrayOptJSONArray.getJSONObject(i2)));
                    } catch (Exception e2) {
                        com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e2, "Failed to parse inbox message", new Object[0]);
                    }
                }
            }
            b(arrayList);
        } catch (Exception e3) {
            com.salesforce.marketingcloud.g.b(InboxMessageManager.TAG, e3, "Failed to parse inbox messages response", new Object[0]);
            a(-1, "Failed to parse response");
        }
    }

    public static void a(com.salesforce.marketingcloud.storage.j jVar, com.salesforce.marketingcloud.alarms.b bVar, l lVar, boolean z) {
        bVar.d(a.EnumC0346a.f);
        if (z) {
            lVar.b().execute(new C0371c("inbox_shutdown", new Object[0], jVar.q()));
        }
    }
}
