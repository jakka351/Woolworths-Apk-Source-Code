package com.adobe.marketing.mobile.internal.eventhub.history;

import au.com.woolworths.product.details.b;
import com.adobe.marketing.mobile.EventHistoryRequest;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean z) {
        this.f = sessionReportingCoordinator;
        this.g = event;
        this.h = eventMetadata;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.internal.eventhub.history.a.run():void");
    }

    public /* synthetic */ a(EventHistoryRequest[] eventHistoryRequestArr, boolean z, AndroidEventHistory androidEventHistory, b bVar) {
        this.f = eventHistoryRequestArr;
        this.e = z;
        this.g = androidEventHistory;
        this.h = bVar;
    }
}
