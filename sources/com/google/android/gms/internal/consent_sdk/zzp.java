package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    public /* synthetic */ zzp(zzn zznVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List] */
    public static zzcj zza(zzp zzpVar) throws zzg, PackageManager.NameNotFoundException {
        Bundle bundle;
        String string;
        ArrayList arrayList;
        List list;
        PackageInfo packageInfo;
        zzcj zzcjVar = new zzcj();
        zzpVar.zzd.getClass();
        if (TextUtils.isEmpty(null)) {
            try {
                zzn zznVar = zzpVar.zza;
                bundle = zznVar.zza.getPackageManager().getApplicationInfo(zznVar.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        zzcjVar.zza = string;
        if (zzpVar.zzc.f14778a) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zzce.PREVIEWING_DEBUG_MESSAGES);
            arrayList = arrayList2;
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        zzcjVar.zzi = arrayList;
        zzn zznVar2 = zzpVar.zza;
        zzcjVar.zze = zznVar2.zzb.zzc();
        zzpVar.zzd.getClass();
        zzcjVar.zzd = Boolean.FALSE;
        zzcjVar.zzc = Locale.getDefault().toLanguageTag();
        zzcf zzcfVar = new zzcf();
        zzcfVar.zzb = Integer.valueOf(Build.VERSION.SDK_INT);
        zzcfVar.zza = Build.MODEL;
        zzcfVar.zzc = 2;
        zzcjVar.zzb = zzcfVar;
        Configuration configuration = zznVar2.zza.getResources().getConfiguration();
        zznVar2.zza.getResources().getConfiguration();
        zzch zzchVar = new zzch();
        zzchVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzchVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzchVar.zzc = Double.valueOf(zznVar2.zza.getResources().getDisplayMetrics().density);
        Activity activity = zzpVar.zzb;
        Window window = activity == null ? null : activity.getWindow();
        View decorView = window == null ? null : window.getDecorView();
        WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
        DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
        if (displayCutout == null) {
            list = Collections.EMPTY_LIST;
        } else {
            displayCutout.getSafeInsetBottom();
            ArrayList arrayList3 = new ArrayList();
            for (Rect rect : displayCutout.getBoundingRects()) {
                if (rect != null) {
                    zzcg zzcgVar = new zzcg();
                    zzcgVar.zzb = Integer.valueOf(rect.left);
                    zzcgVar.zzc = Integer.valueOf(rect.right);
                    zzcgVar.zza = Integer.valueOf(rect.top);
                    zzcgVar.zzd = Integer.valueOf(rect.bottom);
                    arrayList3.add(zzcgVar);
                }
            }
            list = arrayList3;
        }
        zzchVar.zzd = list;
        zzcjVar.zzf = zzchVar;
        Application application = zznVar2.zza;
        try {
            packageInfo = zznVar2.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcd zzcdVar = new zzcd();
        zzcdVar.zza = application.getPackageName();
        zzn zznVar3 = zzpVar.zza;
        CharSequence applicationLabel = zznVar3.zza.getPackageManager().getApplicationLabel(zznVar3.zza.getApplicationInfo());
        zzcdVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcdVar.zzc = Long.toString(packageInfo.getLongVersionCode());
        }
        zzcjVar.zzg = zzcdVar;
        zzci zzciVar = new zzci();
        zzciVar.zza = "3.2.0";
        zzcjVar.zzh = zzciVar;
        return zzcjVar;
    }
}
