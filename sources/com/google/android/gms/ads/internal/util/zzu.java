package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbci;

@TargetApi
/* loaded from: classes.dex */
public class zzu extends zzt {
    @VisibleForTesting
    public static final boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfy)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfA)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, configuration.screenHeightDp);
        int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = zzs.zzx(windowManager);
        int i = displayMetricsZzx.heightPixels;
        int i2 = displayMetricsZzx.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfw)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        return (zze(i, iZzC + dimensionPixelSize, iIntValue) && zze(i2, iZzC2, iIntValue)) ? false : true;
    }
}
