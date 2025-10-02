package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class r3 extends w1<Long> {
    protected static final String h = "com.medallia.digital.mobilesdk.LastSubmitTimestampCollectorFilter";
    protected static final String i = "com.medallia.digital.mobilesdk.LastSubmitTimestampCollector";
    private final BroadcastReceiver g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(r3.i)) {
                        r3.this.a((r3) Long.valueOf(intent.getLongExtra(r3.i, 0L)));
                        a4.b(String.format(Locale.US, "Collectors > Last submit timestamp : %d", r3.this.f()));
                    }
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    public r3(n0 n0Var) {
        super(n0Var);
        this.g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.A;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.g, new IntentFilter(h));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.g);
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }
}
