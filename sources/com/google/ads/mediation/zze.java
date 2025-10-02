package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbgr;

@VisibleForTesting
/* loaded from: classes4.dex */
final class zze extends AdListener implements zzg, com.google.android.gms.ads.formats.zze, com.google.android.gms.ads.formats.zzd {
    public final AbstractAdViewAdapter d;
    public final MediationNativeListener e;

    public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.d = abstractAdViewAdapter;
        this.e = mediationNativeListener;
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
    public final void onAdImpression() {
        this.e.onAdImpression(this.d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.e.onAdOpened(this.d);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        zza zzaVar = new zza();
        zzaVar.setHeadline(unifiedNativeAd.zza());
        zzaVar.setImages(unifiedNativeAd.zzb());
        zzaVar.setBody(unifiedNativeAd.zzc());
        zzaVar.setIcon(unifiedNativeAd.zzd());
        zzaVar.setCallToAction(unifiedNativeAd.zze());
        zzaVar.setAdvertiser(unifiedNativeAd.zzf());
        zzaVar.setStarRating(unifiedNativeAd.zzg());
        zzaVar.setStore(unifiedNativeAd.zzh());
        zzaVar.setPrice(unifiedNativeAd.zzi());
        zzaVar.zzb(unifiedNativeAd.zzk());
        zzaVar.setOverrideImpressionRecording(true);
        zzaVar.setOverrideClickHandling(true);
        zzaVar.zza(unifiedNativeAd.zzj());
        this.e.onAdLoaded(this.d, zzaVar);
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbgr zzbgrVar) {
        this.e.zzc(this.d, zzbgrVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbgr zzbgrVar, String str) {
        this.e.zzd(this.d, zzbgrVar, str);
    }
}
