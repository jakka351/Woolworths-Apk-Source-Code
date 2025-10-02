package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;

/* loaded from: classes5.dex */
public final class zzena implements zzeup {
    private final zzeup zza;
    private final zzfdc zzb;
    private final Context zzc;
    private final zzbyv zzd;

    public zzena(zzepd zzepdVar, zzfdc zzfdcVar, Context context, zzbyv zzbyvVar) {
        this.zza = zzepdVar;
        this.zzb = zzfdcVar;
        this.zzc = context;
        this.zzd = zzbyvVar;
    }

    private final Insets zzd(float f) {
        Window window;
        View decorView;
        WindowInsetsCompat windowInsetsCompatN;
        Insets insetsE = Insets.e;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return insetsE;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) this.zzc.getSystemService("window");
            if (windowManager != null) {
                insetsE = Insets.d(windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
            }
        } else {
            Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
            if (activityZzd != null && (window = activityZzd.getWindow()) != null && (decorView = window.getDecorView()) != null && (windowInsetsCompatN = ViewCompat.n(decorView)) != null) {
                insetsE = windowInsetsCompatN.e(647);
            }
        }
        return Insets.c((int) Math.ceil(insetsE.f2430a / f), (int) Math.ceil(insetsE.b / f), (int) Math.ceil(insetsE.c / f), (int) Math.ceil(insetsE.d / f));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zzk(this.zza.zza(), new zzggr() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzeuy) obj);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 7;
    }

    public final /* synthetic */ zzenb zzc(zzeuy zzeuyVar) {
        String str;
        boolean z;
        int i;
        String strZzu;
        float f;
        int i2;
        int i3;
        int i4;
        WindowManager windowManager;
        int iWidth;
        int iHeight;
        DisplayMetrics displayMetrics;
        zzfdc zzfdcVar = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfdcVar.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
            str = null;
            z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z4 = zzrVar2.zzi;
                if (!z4 && !z2) {
                    str = zzrVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z = true;
                    }
                    z3 = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z = zzrVar.zzi;
        }
        Context context = this.zzc;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            i = 0;
            strZzu = null;
            f = BitmapDescriptorFactory.HUE_RED;
            i2 = 0;
        } else {
            zzbyv zzbyvVar = this.zzd;
            f = displayMetrics.density;
            i2 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            strZzu = zzbyvVar.zzo().zzu();
        }
        Insets insetsZzd = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoe)).booleanValue() || Build.VERSION.SDK_INT < 35) ? null : zzd(f);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzof)).booleanValue() && (i4 = Build.VERSION.SDK_INT) <= 34 && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            if (i4 >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                iWidth = currentWindowMetrics.getBounds().width();
                iHeight = currentWindowMetrics.getBounds().height();
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                iWidth = point.x;
                iHeight = point.y;
            }
            i = iHeight;
            i2 = iWidth;
            insetsZzd = zzd(f);
        }
        int i5 = i;
        StringBuilder sb = new StringBuilder();
        if (zzrVarArr != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar3 : zzrVarArr) {
                if (zzrVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append(lllqqql.c0063ccc0063c);
                    }
                    int i6 = zzrVar3.zze;
                    if (i6 == -1) {
                        i6 = f != BitmapDescriptorFactory.HUE_RED ? (int) (zzrVar3.zzf / f) : -1;
                    }
                    sb.append(i6);
                    sb.append("x");
                    int i7 = zzrVar3.zzb;
                    if (i7 == -2) {
                        i7 = f != BitmapDescriptorFactory.HUE_RED ? (int) (zzrVar3.zzc / f) : -2;
                    }
                    sb.append(i7);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, lllqqql.c0063ccc0063c);
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzenb(zzrVar, str, z, sb.toString(), f, i2, i5, strZzu, zzfdcVar.zzr, insetsZzd);
    }
}
