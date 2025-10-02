package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.media.u;

@SuppressLint
/* loaded from: classes6.dex */
public class j extends a<Object> {
    private f f;

    public j(o oVar, s sVar, f fVar) {
        super(oVar, null, sVar);
        this.f = fVar;
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a() {
        super.a();
        this.f = null;
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a(u.b bVar) {
        f fVar = this.f;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a(Exception exc) {
        f fVar = this.f;
        if (fVar != null) {
            fVar.a(exc);
        }
    }
}
