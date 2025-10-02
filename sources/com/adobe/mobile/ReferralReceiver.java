package com.adobe.mobile;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public class ReferralReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String[] strArr = StaticMethods.f13279a;
        if (context != null) {
            if (context instanceof Activity) {
                StaticMethods.a0 = context.getApplicationContext();
            } else {
                StaticMethods.a0 = context;
            }
        }
        StaticMethods.i().execute(new Runnable() { // from class: com.adobe.mobile.Analytics.10
            public final /* synthetic */ Intent d;

            public AnonymousClass10(Intent intent2) {
                intent = intent2;
            }

            /* JADX WARN: Removed duplicated region for block: B:195:0x0118  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 727
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adobe.mobile.Analytics.AnonymousClass10.run():void");
            }
        });
    }
}
