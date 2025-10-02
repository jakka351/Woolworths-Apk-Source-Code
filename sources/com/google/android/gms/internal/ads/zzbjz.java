package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbjz implements zzbjl {
    private final zzdwp zza;

    public zzbjz(zzdwp zzdwpVar) {
        this.zza = zzdwpVar;
    }

    private static final Bundle zzb(Map map) throws JSONException {
        Bundle bundleG = au.com.woolworths.shop.checkout.ui.confirmation.c.g("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundleG.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundleG.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundleG.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundleG.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundleG.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundleG.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTestingGmsgHandler.generateNetworkExtras");
            }
        }
        return bundleG;
    }

    private static final List zzc(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2));
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        AdRequest adRequestBuild;
        AdSize adSize;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkg)).booleanValue()) {
            zzdwq zzdwqVar = new zzdwq();
            String str = (String) map.get("adUnitId");
            if (!TextUtils.isEmpty(str)) {
                zzdwqVar.zzh(str);
            }
            String str2 = (String) map.get("format");
            if (!TextUtils.isEmpty(str2)) {
                zzdwqVar.zzi(str2);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzki)).booleanValue()) {
                boolean z = false;
                if (map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1")) {
                    z = true;
                }
                zzdwqVar.zzn(z);
                if (zzdwqVar.zzg()) {
                    AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        Iterator it = zzc((String) map.get("keywords"), "keywords").iterator();
                        while (it.hasNext()) {
                            builder.addKeyword((String) it.next());
                        }
                    }
                    builder.addNetworkExtrasBundle(AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                builder.addCustomTargeting(next, jSONObject.getString(next));
                            }
                        } catch (JSONException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTestingGmsgHandler.generateAdManagerAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        builder.setContentUrl((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder.setNeighboringContentUrls(zzc((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder.setRequestAgent((String) map.get("requestAgent"));
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        builder.setPublisherProvidedId((String) map.get("publisherProvidedId"));
                    }
                    if (map.containsKey("categoryExclusions")) {
                        Iterator it2 = zzc((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            builder.addCategoryExclusion((String) it2.next());
                        }
                    }
                    adRequestBuild = builder.build();
                } else {
                    AdRequest.Builder builder2 = new AdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        Iterator it3 = zzc((String) map.get("keywords"), "keywords").iterator();
                        while (it3.hasNext()) {
                            builder2.addKeyword((String) it3.next());
                        }
                    }
                    builder2.addNetworkExtrasBundle(AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys2 = jSONObject2.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                builder2.addCustomTargeting(next2, jSONObject2.getString(next2));
                            }
                        } catch (JSONException e2) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OutOfContextTestingGmsgHandler.generateAdMobAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        builder2.setContentUrl((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder2.setNeighboringContentUrls(zzc((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder2.setRequestAgent((String) map.get("requestAgent"));
                    }
                    adRequestBuild = builder2.build();
                }
                zzdwqVar.zzj(adRequestBuild);
                String str3 = (String) map.get("width");
                String str4 = (String) map.get("height");
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    adSize = AdSize.BANNER;
                } else {
                    try {
                        adSize = new AdSize(Integer.parseInt(str3), Integer.parseInt(str4));
                    } catch (NumberFormatException e3) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "OutOfContextTestingGmsgHandler.generateAdSize");
                        adSize = AdSize.BANNER;
                    }
                }
                zzdwqVar.zzk(adSize);
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    VideoOptions.Builder builder3 = new VideoOptions.Builder();
                    if (map.containsKey("startMuted")) {
                        builder3.setStartMuted(((String) map.get("startMuted")).equals("1"));
                    }
                    if (map.containsKey("customControlsRequested")) {
                        builder3.setCustomControlsRequested(((String) map.get("customControlsRequested")).equals("1"));
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        builder3.setClickToExpandRequested(((String) map.get("clickToExpandRequested")).equals("1"));
                    }
                    zzdwqVar.zzm(builder3.build());
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (zzdwqVar.zzf() != null && zzdwqVar.zzb().equals("NATIVE"))) {
                    NativeAdOptions.Builder builder4 = new NativeAdOptions.Builder();
                    if (map.containsKey("disableImageLoading")) {
                        builder4.setReturnUrlsForImageAssets(((String) map.get("disableImageLoading")).equals("1"));
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str5 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str5)) {
                            try {
                                builder4.setMediaAspectRatio(Integer.parseInt(str5));
                            } catch (NumberFormatException e4) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio");
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        builder4.setRequestMultipleImages(((String) map.get("shouldRequestMultipleImages")).equals("1"));
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str6 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                builder4.setAdChoicesPlacement(Integer.parseInt(str6));
                            } catch (NumberFormatException e5) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e5, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition");
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        builder4.setRequestCustomMuteThisAd(((String) map.get("customMuteThisAdRequested")).equals("1"));
                    }
                    VideoOptions videoOptionsZzf = zzdwqVar.zzf();
                    if (videoOptionsZzf != null) {
                        builder4.setVideoOptions(videoOptionsZzf);
                    }
                    zzdwqVar.zzl(builder4.build());
                }
            }
            String str7 = (String) map.get(UrlHandler.ACTION);
            if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(zzdwqVar.zza())) {
                return;
            }
            if (str7.equals("load") && !TextUtils.isEmpty(zzdwqVar.zzb())) {
                this.zza.zzc(zzdwqVar);
            } else if (str7.equals("show")) {
                this.zza.zzd(zzdwqVar.zza());
            }
        }
    }
}
