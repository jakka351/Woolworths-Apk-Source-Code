package com.swrve.sdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrvePermissionRequesterActivity extends Activity {
    public static final /* synthetic */ int e = 0;
    public boolean d = false;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    public static void a() {
        JSONObject jSONObjectP0;
        Swrve swrve = (Swrve) SwrveSDKBase.f19075a;
        SwrveSDKBase.a();
        String userId = SwrveSDKBase.f19075a.getUserId();
        if (swrve.I0()) {
            try {
                jSONObjectP0 = swrve.p0();
            } catch (Exception e2) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e2, new Object[0]);
                jSONObjectP0 = null;
            }
        } else {
            jSONObjectP0 = new JSONObject();
        }
        swrve.L(userId, jSONObjectP0);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102) {
            a();
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        int i = Build.VERSION.SDK_INT;
        getWindow().setStatusBarColor(0);
        Bundle extras = getIntent().getExtras();
        String string = (extras == null || !extras.containsKey("PERMISSION")) ? null : extras.getString("PERMISSION");
        this.d = shouldShowRequestPermissionRationale(string);
        if (!SwrveHelper.o(string) || ContextCompat.a(this, string) != -1) {
            SwrveLogger.g("SwrveSDK: %s permission is already GRANTED", string);
            finish();
            return;
        }
        if (((Swrve) SwrveSDKBase.f19075a).D0(string) < 2) {
            requestPermissions(new String[]{string}, 101);
            return;
        }
        if (i < 33 || !"android.permission.POST_NOTIFICATIONS".equalsIgnoreCase(string)) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", getPackageName(), null));
            startActivityForResult(intent, 102);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent2.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        startActivityForResult(intent2, 102);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRequestPermissionsResult(int r3, java.lang.String[] r4, int[] r5) {
        /*
            r2 = this;
            r0 = 101(0x65, float:1.42E-43)
            r1 = 1
            if (r3 == r0) goto Lb
            int r3 = r4.length     // Catch: java.lang.Throwable -> L9
            if (r3 != r1) goto Le
            goto Lb
        L9:
            r3 = move-exception
            goto L56
        Lb:
            int r3 = r5.length     // Catch: java.lang.Throwable -> L9
            if (r3 == r1) goto L12
        Le:
            r2.finish()
            return
        L12:
            r3 = 0
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L9
            r3 = r5[r3]     // Catch: java.lang.Throwable -> L9
            if (r3 != 0) goto L23
            java.lang.String r3 = "SwrveSDK: %s permission is GRANTED"
            java.lang.Object[] r5 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L9
            com.swrve.sdk.SwrveLogger.g(r3, r5)     // Catch: java.lang.Throwable -> L9
            goto L2f
        L23:
            r5 = -1
            if (r3 != r5) goto L2f
            java.lang.String r3 = "SwrveSDK: %s permission is DENIED"
            java.lang.Object[] r5 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L9
            com.swrve.sdk.SwrveLogger.g(r3, r5)     // Catch: java.lang.Throwable -> L9
        L2f:
            boolean r3 = r2.shouldShowRequestPermissionRationale(r4)     // Catch: java.lang.Throwable -> L9
            boolean r5 = r2.d     // Catch: java.lang.Throwable -> L9
            if (r5 == r3) goto L4f
            java.lang.Object r3 = com.swrve.sdk.SwrveSDKBase.f19075a     // Catch: java.lang.Throwable -> L9
            com.swrve.sdk.Swrve r3 = (com.swrve.sdk.Swrve) r3     // Catch: java.lang.Throwable -> L9
            int r5 = r3.D0(r4)     // Catch: java.lang.Throwable -> L9
            int r5 = r5 + r1
            java.lang.String r4 = com.swrve.sdk.SwrveHelper.h(r4)     // Catch: java.lang.Throwable -> L9
            com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage r3 = r3.s     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = ""
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L9
            r3.g(r0, r4, r5)     // Catch: java.lang.Throwable -> L9
        L4f:
            a()     // Catch: java.lang.Throwable -> L9
            r2.finish()
            return
        L56:
            r2.finish()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrvePermissionRequesterActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
