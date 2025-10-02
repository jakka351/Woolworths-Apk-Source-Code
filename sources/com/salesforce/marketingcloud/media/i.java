package com.salesforce.marketingcloud.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.media.u;
import java.io.IOException;

/* loaded from: classes6.dex */
class i extends u {
    private static final String c = "drawable";

    /* renamed from: a, reason: collision with root package name */
    private final Context f16966a;
    private int b;

    public i(Context context) {
        this.f16966a = context;
    }

    @Override // com.salesforce.marketingcloud.media.u
    public boolean a(s sVar) {
        if (c.equalsIgnoreCase(sVar.f16978a.getScheme())) {
            this.b = this.f16966a.getResources().getIdentifier(sVar.f16978a.getHost(), c, this.f16966a.getPackageName());
        }
        return this.b > 0;
    }

    @Override // com.salesforce.marketingcloud.media.u
    public void a(o oVar, s sVar, u.a aVar) throws IOException {
        Drawable drawable = this.f16966a.getDrawable(this.b);
        if (drawable == null) {
            aVar.a(new IllegalStateException("Invalid res id for drawable"));
        } else {
            aVar.a(new u.b(drawable, o.b.MEMORY));
        }
    }
}
