package com.google.android.gms.common;

import androidx.constraintlayout.core.state.a;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes5.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i) {
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 104 + String.valueOf(i).length() + 194);
        a.t(i2, i, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", sb);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i, sb.toString());
    }
}
