package com.braintreepayments.api;

import android.content.Context;
import android.util.Log;
import java.util.Arrays;
import org.json.JSONException;

/* loaded from: classes4.dex */
class BrowserSwitchPersistentStore {

    /* renamed from: a, reason: collision with root package name */
    public static final BrowserSwitchPersistentStore f13710a = new BrowserSwitchPersistentStore();

    public static BrowserSwitchRequest a(Context context) {
        String string = context.getApplicationContext().getSharedPreferences("com.braintreepayment.browserswitch.persistentstore", 0).getString("browserSwitch.request", null);
        if (string != null) {
            try {
                return BrowserSwitchRequest.a(string);
            } catch (JSONException e) {
                Log.d("BrowserSwitch", e.getMessage());
                Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
            }
        }
        return null;
    }

    public static void b(BrowserSwitchRequest browserSwitchRequest, Context context) {
        try {
            context.getApplicationContext().getSharedPreferences("com.braintreepayment.browserswitch.persistentstore", 0).edit().putString("browserSwitch.request", browserSwitchRequest.b()).apply();
        } catch (JSONException e) {
            Log.d("BrowserSwitch", e.getMessage());
            Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
        }
    }
}
