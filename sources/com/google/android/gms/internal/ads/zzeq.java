package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzeq {
    public final String zza;

    private zzeq(int i, int i2, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzeq zza(zzef zzefVar) {
        String str;
        zzefVar.zzk(2);
        int iZzs = zzefVar.zzs();
        int i = iZzs >> 1;
        int i2 = iZzs & 1;
        int iZzs2 = zzefVar.zzs() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i3 = iZzs2 | (i2 << 5);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i3).length();
        String str2 = i < 10 ? ".0" : ".";
        int iE = au.com.woolworths.shop.checkout.ui.confirmation.c.e(str.length(), length, str2);
        String str3 = i3 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.e(iE, length2, str3));
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
        sb.append(i3);
        return new zzeq(i, i3, sb.toString());
    }
}
