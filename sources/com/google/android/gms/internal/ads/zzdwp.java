package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzdwp extends com.google.android.gms.ads.internal.client.zzdv {

    @VisibleForTesting
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdwd zzd;
    private final zzgpd zze;
    private zzdvs zzf;

    public zzdwp(Context context, WeakReference weakReference, zzdwd zzdwdVar, zzdwr zzdwrVar, zzgpd zzgpdVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdwdVar;
        this.zze = zzgpdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgot.zzq(this.zzf.zzn(str), new zzdwk(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgot.zzq(this.zzf.zzn(str), new zzdwl(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzeaVarZzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzeaVarZzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzdvs zzdvsVar) {
        this.zzf = zzdvsVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzc(zzdwq zzdwqVar) {
        try {
            String strZzb = zzdwqVar.zzb();
            switch (strZzb.hashCode()) {
                case -1999289321:
                    if (strZzb.equals("NATIVE")) {
                        final String strZza = zzdwqVar.zza();
                        AdLoader.Builder builder = new AdLoader.Builder(zzl(), strZza);
                        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdwn
                            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                                this.zza.zzf(strZza, nativeAd);
                            }
                        });
                        builder.withAdListener(new zzdwj(this));
                        NativeAdOptions nativeAdOptionsZze = zzdwqVar.zze();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzki)).booleanValue() && nativeAdOptionsZze != null) {
                            builder.withNativeAdOptions(nativeAdOptionsZze);
                        }
                        builder.build().loadAd(zzdwqVar.zzc());
                        return;
                    }
                    break;
                case -1372958932:
                    if (strZzb.equals("INTERSTITIAL")) {
                        String strZza2 = zzdwqVar.zza();
                        InterstitialAd.load(zzl(), strZza2, zzdwqVar.zzc(), new zzdwg(this, strZza2));
                        return;
                    }
                    break;
                case -428325382:
                    if (strZzb.equals("APP_OPEN_AD")) {
                        String strZza3 = zzdwqVar.zza();
                        AppOpenAd.load(zzl(), strZza3, zzdwqVar.zzc(), new zzdwe(this, strZza3));
                        return;
                    }
                    break;
                case 543046670:
                    if (strZzb.equals("REWARDED")) {
                        String strZza4 = zzdwqVar.zza();
                        RewardedAd.load(zzl(), strZza4, zzdwqVar.zzc(), new zzdwh(this, strZza4));
                        return;
                    }
                    break;
                case 1854800829:
                    if (strZzb.equals("REWARDED_INTERSTITIAL")) {
                        String strZza5 = zzdwqVar.zza();
                        RewardedInterstitialAd.load(zzl(), strZza5, zzdwqVar.zzc(), new zzdwi(this, strZza5));
                        return;
                    }
                    break;
                case 1951953708:
                    if (strZzb.equals("BANNER")) {
                        String strZza6 = zzdwqVar.zza();
                        zzbbz zzbbzVar = zzbci.zzki;
                        BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && zzdwqVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
                        adManagerAdView.setAdSize(zzdwqVar.zzd());
                        adManagerAdView.setAdUnitId(strZza6);
                        adManagerAdView.setAdListener(new zzdwf(this, strZza6, adManagerAdView));
                        VideoOptions videoOptionsZzf = zzdwqVar.zzf();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && zzdwqVar.zzg() && videoOptionsZzf != null) {
                            ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptionsZzf);
                        }
                        adManagerAdView.loadAd(zzdwqVar.zzc());
                        return;
                    }
                    break;
            }
        } finally {
        }
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        try {
            Activity activityZzo = this.zzd.zzo();
            if (activityZzo != null && (obj = (map = this.zza).get(str)) != null) {
                zzbbz zzbbzVar = zzbci.zzkh;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                    map.remove(str);
                }
                zzk(zzm(obj));
                if (obj instanceof AppOpenAd) {
                    ((AppOpenAd) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof InterstitialAd) {
                    ((InterstitialAd) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof RewardedAd) {
                    ((RewardedAd) obj).show(activityZzo, zzdwo.zza);
                    return;
                }
                if (obj instanceof RewardedInterstitialAd) {
                    ((RewardedInterstitialAd) obj).show(activityZzo, zzdwm.zza);
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzl = zzl();
                    intent.setClassName(contextZzl, OutOfContextTestingActivity.CLASS_NAME);
                    intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzY(contextZzl, intent);
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzdwr.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdwr.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    public final /* synthetic */ zzdwd zzi() {
        return this.zzd;
    }
}
