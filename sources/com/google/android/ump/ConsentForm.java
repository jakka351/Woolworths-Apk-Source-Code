package com.google.android.ump;

import android.app.Activity;

/* loaded from: classes6.dex */
public interface ConsentForm {

    public interface OnConsentFormDismissedListener {
        void a();
    }

    void show(Activity activity, OnConsentFormDismissedListener onConsentFormDismissedListener);
}
