package com.google.androidbrowserhelper.trusted;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.camera.camera2.interop.d;

/* loaded from: classes6.dex */
public class QualityEnforcer extends CustomTabsCallback {

    public interface Delegate {
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        String string = bundle != null ? bundle.getString("crash_reason") : null;
        if (string == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle2 = new Bundle();
        if (str.equals("quality_enforcement.crash")) {
            bundle2.putBoolean("success", true);
            new Handler(Looper.getMainLooper()).post(new d(string, 29));
        }
        return bundle2;
    }
}
