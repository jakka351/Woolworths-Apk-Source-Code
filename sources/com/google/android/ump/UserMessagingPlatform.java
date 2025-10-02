package com.google.android.ump;

/* loaded from: classes6.dex */
public final class UserMessagingPlatform {

    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(FormError formError);
    }

    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(ConsentForm consentForm);
    }
}
