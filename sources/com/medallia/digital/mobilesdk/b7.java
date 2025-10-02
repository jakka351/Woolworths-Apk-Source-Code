package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class b7 extends w1<Integer> {
    private final BroadcastReceiver g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra("com.medallia.digital.mobilesdk.SESSION_NUMBER_VALUE")) {
                        b7.this.a((b7) Integer.valueOf(intent.getIntExtra("com.medallia.digital.mobilesdk.SESSION_NUMBER_VALUE", 0)));
                        a4.b(String.format(Locale.US, "New session created, number : %d", b7.this.f()));
                    }
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    public b7(n0 n0Var) {
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
