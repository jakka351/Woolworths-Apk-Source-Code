package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.widget.ImageView;
import com.salesforce.marketingcloud.media.u;
import java.lang.ref.Reference;

@SuppressLint
/* loaded from: classes6.dex */
public class p extends a<ImageView> {
    f f;

    public p(o oVar, v<ImageView> vVar, s sVar, f fVar) {
        super(oVar, vVar, sVar);
        this.f = fVar;
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a() {
        super.a();
        this.f = null;
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a(u.b bVar) {
        Reference reference = this.b;
        ImageView imageView = reference != null ? (ImageView) reference.get() : null;
        if (imageView == null) {
            return;
        }
        l.a(imageView, b().f16973a, bVar);
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
