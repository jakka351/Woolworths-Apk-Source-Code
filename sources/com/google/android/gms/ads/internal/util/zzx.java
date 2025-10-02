package com.google.android.gms.ads.internal.util;

import YU.a;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbci;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@TargetApi
/* loaded from: classes.dex */
public class zzx extends zzv {
    public static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzu() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    Locale locale = Locale.US;
                    int i = rect.left;
                    int i2 = rect.top;
                    int i3 = rect.right;
                    int i4 = rect.bottom;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(",");
                    sb.append(i2);
                    sb.append(",");
                    sb.append(i3);
                    String strN = a.n(sb, ",", i4);
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat(lllqqql.c0063ccc0063c);
                    }
                    strConcat = strConcat.concat(strN);
                }
                zzgVarZzo.zzv(strConcat);
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzo().zzv("");
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzj(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbt)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zzo().zzu() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.zzl(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final int zzk(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
