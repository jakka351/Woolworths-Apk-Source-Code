package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;

@VisibleForTesting
/* loaded from: classes4.dex */
final class zzb extends AdListener implements AppEventListener, com.google.android.gms.ads.internal.client.zza {
    public final AbstractAdViewAdapter d;
    public final MediationBannerListener e;

    public zzb(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.d = abstractAdViewAdapter;
        this.e = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.e.onAdClicked(this.d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.e.onAdClosed(this.d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.e.onAdFailedToLoad(this.d, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.e.onAdLoaded(this.d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.e.onAdOpened(this.d);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.e.zza(this.d, str, str2);
    }
}
