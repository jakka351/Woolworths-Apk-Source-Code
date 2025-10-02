package com.salesforce.marketingcloud.analytics.etanalytics;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.analytics.i;
import com.salesforce.marketingcloud.internal.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class a extends i {
    private static final int f = 0;
    private final j d;
    private final l e;

    /* renamed from: com.salesforce.marketingcloud.analytics.etanalytics.a$a, reason: collision with other inner class name */
    public class C0350a extends g {
        final /* synthetic */ j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0350a(String str, Object[] objArr, j jVar) {
            super(str, objArr);
            this.b = jVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.b.m().b(0);
        }
    }

    public a(@NonNull j jVar, @NonNull l lVar) {
        this.d = jVar;
        this.e = lVar;
    }

    private static void a(l lVar, j jVar) {
        lVar.b().execute(new C0350a("delete_analytics", new Object[0], jVar));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.j
    public void b(@NonNull NotificationMessage notificationMessage) {
        Region region = notificationMessage.region();
        if (TextUtils.isEmpty(notificationMessage.id()) || region == null) {
            return;
        }
        this.e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 3, Arrays.asList(notificationMessage.id(), region.id()), notificationMessage.requestId(), true)));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.g
    public void a(@NonNull InboxMessage inboxMessage) {
        this.e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 14, Collections.singletonList(inboxMessage.id()), com.salesforce.marketingcloud.internal.b.b(inboxMessage), true)));
    }

    @Override // com.salesforce.marketingcloud.analytics.i, com.salesforce.marketingcloud.analytics.j
    public void a(@NonNull NotificationMessage notificationMessage, boolean z) {
        if (notificationMessage.region() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(notificationMessage.id());
            arrayList.add(notificationMessage.region().id());
            com.salesforce.marketingcloud.analytics.b bVarA = com.salesforce.marketingcloud.analytics.b.a(new Date(), 0, 17, arrayList, notificationMessage.requestId(), true);
            bVarA.b(z ? 1 : 0);
            this.e.b().execute(new com.salesforce.marketingcloud.analytics.a(this.d.m(), this.d.b(), bVarA));
        }
    }

    public static void a(j jVar, l lVar, boolean z) {
        if (z) {
            a(lVar, jVar);
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.i
    public void a(boolean z) {
        if (z) {
            a(this.e, this.d);
        }
    }
}
