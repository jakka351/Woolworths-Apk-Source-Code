package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class a7 extends w1<String> {
    private final BroadcastReceiver g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra("com.medallia.digital.mobilesdk.SESSION_ID_VALUE")) {
                        a7.this.a((a7) intent.getStringExtra("com.medallia.digital.mobilesdk.SESSION_ID_VALUE"));
                        a4.b(String.format(Locale.US, "New session created, id : %s", a7.this.f()));
                    }
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    public a7(n0 n0Var) {
        super(n0Var);
        this.g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.u;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void l() {
        super.l();
        q4.a(i4.c().b()).a(this.g, new IntentFilter("com.medallia.digital.mobilesdk.SESSION_STARTED"));
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
