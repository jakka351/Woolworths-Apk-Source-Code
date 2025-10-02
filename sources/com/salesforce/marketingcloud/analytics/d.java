package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class d extends com.salesforce.marketingcloud.internal.g {
    private final com.salesforce.marketingcloud.storage.a b;
    private final String[] c;

    public d(@NonNull com.salesforce.marketingcloud.storage.a aVar, @NonNull String[] strArr) {
        super("delete_analytics", new Object[0]);
        this.b = aVar;
        this.c = strArr;
    }

    @Override // com.salesforce.marketingcloud.internal.g
    public void a() {
        this.b.a(this.c);
    }
}
