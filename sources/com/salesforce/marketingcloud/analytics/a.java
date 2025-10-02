package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class a extends com.salesforce.marketingcloud.internal.g {
    private final com.salesforce.marketingcloud.storage.a b;
    private final com.salesforce.marketingcloud.util.c c;
    private final b d;

    public a(@NonNull com.salesforce.marketingcloud.storage.a aVar, @NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull b bVar) {
        super("add_analytic", new Object[0]);
        this.b = aVar;
        this.c = cVar;
        this.d = bVar;
    }

    @Override // com.salesforce.marketingcloud.internal.g
    public void a() {
        try {
            this.b.a(this.d, this.c);
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(AnalyticsManager.TAG, e, "Unable to record analytic [%d].", Integer.valueOf(this.d.a()));
        }
    }
}
