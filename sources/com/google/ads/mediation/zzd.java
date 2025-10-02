package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

@VisibleForTesting
/* loaded from: classes4.dex */
final class zzd extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f14384a;
    public final MediationInterstitialListener b;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f14384a = abstractAdViewAdapter;
        this.b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.b.onAdClosed(this.f14384a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.b.onAdOpened(this.f14384a);
    }
}
