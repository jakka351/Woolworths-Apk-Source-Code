package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class c6 extends w1<Long> {
    private final BroadcastReceiver g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra("com.medallia.digital.mobilesdk.PROPERTY_ID_VALUE")) {
                        c6.this.a((c6) Long.valueOf(intent.getLongExtra("com.medallia.digital.mobilesdk.PROPERTY_ID_VALUE", 0L)));
                        a4.b(String.format(Locale.US, "New propertyId created : %d", c6.this.f()));
                    }
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    public c6(n0 n0Var) {
        super(n0Var);
        this.g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.t;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void l() {
        super.l();
        q4.a(i4.c().b()).a(this.g, new IntentFilter("com.medallia.digital.mobilesdk.PROPERTY_ID_CHANGE"));
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.g);
        } catch (IllegalArgumentException e) {
            a4.c(e.getMessage());
        }
    }
}
