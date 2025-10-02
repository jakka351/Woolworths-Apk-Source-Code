package com.salesforce.marketingcloud.registration;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.internal.g;
import com.salesforce.marketingcloud.storage.m;

@RestrictTo
/* loaded from: classes6.dex */
public class a extends g {
    private final m b;
    private final com.salesforce.marketingcloud.util.c c;
    private final Registration d;
    private final boolean e;

    public a(m mVar, com.salesforce.marketingcloud.util.c cVar, Registration registration, boolean z) {
        super(z ? "update_registration" : "add_registration", new Object[0]);
        this.b = mVar;
        this.c = cVar;
        this.d = registration;
        this.e = z;
    }

    @Override // com.salesforce.marketingcloud.internal.g
    public void a() {
        try {
            if (this.e) {
                this.b.b(this.d, this.c);
            } else {
                this.b.a(this.d, this.c);
            }
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(RegistrationManager.f17033a, e, "Unable to %s registration", this.e ? "update" : "add");
        }
    }
}
