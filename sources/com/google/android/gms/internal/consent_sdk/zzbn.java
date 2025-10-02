package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: classes5.dex */
public final /* synthetic */ class zzbn implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
    public final /* synthetic */ ConsentForm.OnConsentFormDismissedListener zza;

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(FormError formError) {
        this.zza.a();
    }
}
