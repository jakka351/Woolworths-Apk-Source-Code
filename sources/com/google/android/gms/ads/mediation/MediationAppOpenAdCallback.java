package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* loaded from: classes5.dex */
public interface MediationAppOpenAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@NonNull AdError adError);
}
