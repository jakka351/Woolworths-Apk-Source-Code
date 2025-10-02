package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
public class a1 extends w1<Integer> {
    static final String h = "com.medallia.digital.mobilesdk.CSATCollector";
    static final String i = "com.medallia.digital.mobilesdk.CSATCollectorFilter";
    private final BroadcastReceiver g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !intent.hasExtra(a1.h)) {
                return;
            }
            a1.this.a((a1) Integer.valueOf(intent.getIntExtra(a1.h, -1)));
            a4.b(String.format(Locale.US, "Collectors > CSAT : %S", a1.this.f()));
        }
    }

    public a1(n0 n0Var) {
        super(n0Var);
        this.g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public /* bridge */ /* synthetic */ void a(o0 o0Var) {
        super.a(o0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.L;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.g, new IntentFilter(i));
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
