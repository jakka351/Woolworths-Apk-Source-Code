package com.salesforce.marketingcloud.events.predicates;

import androidx.annotation.NonNull;

/* loaded from: classes6.dex */
public class a extends f {
    private final f[] e;

    public a(@NonNull f... fVarArr) {
        this.e = fVarArr;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.f
    public boolean a() {
        for (f fVar : this.e) {
            if (!fVar.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.f
    @NonNull
    public String c() {
        return "And";
    }
}
