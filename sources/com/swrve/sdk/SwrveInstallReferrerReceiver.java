package com.swrve.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: classes6.dex */
public class SwrveInstallReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws UnsupportedEncodingException {
        String stringExtra = intent.getStringExtra("referrer");
        SwrveLogger.e("Received INSTALL_REFERRER broadcast with referrer:%s", stringExtra);
        if (SwrveHelper.p(stringExtra)) {
            return;
        }
        try {
            context.getSharedPreferences("swrve_prefs", 0).edit().putString("swrve.referrer_id", URLDecoder.decode(stringExtra, "UTF-8")).apply();
        } catch (UnsupportedEncodingException e) {
            SwrveLogger.c(YU.a.A("Error decoding the referrer:", stringExtra), e, new Object[0]);
        }
    }
}
