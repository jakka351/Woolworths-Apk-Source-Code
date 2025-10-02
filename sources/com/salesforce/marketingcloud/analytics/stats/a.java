package com.salesforce.marketingcloud.analytics.stats;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.internal.g;

@RestrictTo
/* loaded from: classes6.dex */
public class a extends g {
    private final com.salesforce.marketingcloud.storage.d b;
    private final com.salesforce.marketingcloud.util.c c;
    private final b d;

    public a(@NonNull com.salesforce.marketingcloud.storage.d dVar, @NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull b bVar) {
        super("add_device_stat", new Object[0]);
        this.b = dVar;
        this.c = cVar;
        this.d = bVar;
    }

    @Override // com.salesforce.marketingcloud.internal.g
    public void a() {
        try {
            this.b.a(this.d, this.c);
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e, "Unable to record device stat [%d].", Integer.valueOf(this.d.d()));
        }
    }
}
