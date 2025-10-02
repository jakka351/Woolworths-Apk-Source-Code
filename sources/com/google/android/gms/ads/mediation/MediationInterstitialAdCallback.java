package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* loaded from: classes5.dex */
public interface MediationInterstitialAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@NonNull AdError adError);

    @Deprecated
    void onAdFailedToShow(@NonNull String str);

    void onAdLeftApplication();
}
