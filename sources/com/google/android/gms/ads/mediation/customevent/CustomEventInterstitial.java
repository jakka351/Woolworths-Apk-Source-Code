package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.MediationAdRequest;

@Deprecated
/* loaded from: classes5.dex */
public interface CustomEventInterstitial extends CustomEvent {
    void requestInterstitialAd(@NonNull Context context, @NonNull CustomEventInterstitialListener customEventInterstitialListener, @Nullable String str, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle);

    void showInterstitial();
}
