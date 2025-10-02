package com.swrve.sdk;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes6.dex */
public class SwrveNotificationEngageActivity extends Activity {
    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            overridePendingTransition(0, 0);
            new SwrveNotificationEngage(getApplicationContext()).f(getIntent());
            finish();
        } catch (Exception e) {
            SwrveLogger.c("SwrveNotificationEngageActivity engage.processIntent", e, new Object[0]);
        }
    }
}
