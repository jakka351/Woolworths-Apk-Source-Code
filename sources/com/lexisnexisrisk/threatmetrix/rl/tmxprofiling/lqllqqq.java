package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfiling;
import javax.annotation.Nonnull;

/* loaded from: classes6.dex */
public class lqllqqq extends BroadcastReceiver {
    private static final String gg0067g00670067g = lqlqqll.u00750075u00750075u(lqllqqq.class);
    public TMXProfiling g00670067g00670067g;

    private lqllqqq(TMXProfiling tMXProfiling) {
        this.g00670067g00670067g = tMXProfiling;
    }

    public static void g0067gggg00670067(TMXProfiling tMXProfiling, nlllnnl nlllnnlVar) {
        if (nlllnnlVar == null || nlllnnlVar.ww0077w007700770077 == null) {
            lqlqqll.u0075u0075uu0075(gg0067g00670067g, "Null context");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        nlllnnlVar.ww0077w007700770077.registerReceiver(new lqllqqq(tMXProfiling), intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, @Nonnull Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.g00670067g00670067g.www007700770077ww();
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.g00670067g00670067g.w0077w007700770077ww();
        }
    }
}
