package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
class s extends w1<Long> {
    protected static final String h = "com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollectorFilter";
    protected static final String i = "com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollector";
    private final BroadcastReceiver g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(s.i)) {
                        s.this.a((s) Long.valueOf(intent.getLongExtra(s.i, 0L)));
                        a4.b(String.format(Locale.US, "Collectors > App Rating Last accepted timestamp : %d", s.this.f()));
                    }
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    public s(n0 n0Var) {
        super(n0Var);
        this.g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.O;
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
