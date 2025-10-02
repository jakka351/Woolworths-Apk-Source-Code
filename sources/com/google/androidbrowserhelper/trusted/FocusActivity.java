package com.google.androidbrowserhelper.trusted;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes6.dex */
public class FocusActivity extends Activity {
    public static Boolean d;

    public static void a(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) FocusActivity.class);
        if (d == null) {
            d = Boolean.valueOf(intent2.resolveActivityInfo(context.getPackageManager(), 0) != null);
        }
        if (Boolean.FALSE.equals(d)) {
            return;
        }
        intent2.setFlags(268435456);
        intent.putExtra("androidx.browser.customtabs.extra.FOCUS_INTENT", PendingIntent.getActivity(context, 0, intent2, 67108864));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
    }
}
