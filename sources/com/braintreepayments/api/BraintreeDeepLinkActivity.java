package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braintreepayments/api/BraintreeDeepLinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class BraintreeDeepLinkActivity extends AppCompatActivity {
    public final BrowserSwitchClient t = new BrowserSwitchClient();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException {
        Uri data;
        super.onCreate(bundle);
        BrowserSwitchClient browserSwitchClient = this.t;
        browserSwitchClient.getClass();
        Intent intent = getIntent();
        Context applicationContext = getApplicationContext();
        browserSwitchClient.b.getClass();
        BrowserSwitchRequest browserSwitchRequestA = BrowserSwitchPersistentStore.a(applicationContext);
        if (browserSwitchRequestA != null && intent != null && (data = intent.getData()) != null) {
            Context applicationContext2 = getApplicationContext();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", 1);
                jSONObject.put("deepLinkUrl", data.toString());
                jSONObject.put("browserSwitchRequest", browserSwitchRequestA.b());
                applicationContext2.getApplicationContext().getSharedPreferences("com.braintreepayment.browserswitch.persistentstore", 0).edit().putString("browserSwitch.result", jSONObject.toString()).apply();
            } catch (JSONException e) {
                Log.d("BrowserSwitch", e.getMessage());
                Log.d("BrowserSwitch", Arrays.toString(e.getStackTrace()));
            }
        }
        finish();
    }
}
