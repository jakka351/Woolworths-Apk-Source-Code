package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes5.dex */
public final class zzhpk extends zzhpp {
    final String zza;

    public zzhpk(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhpp
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.f(au.com.woolworths.shop.checkout.ui.confirmation.c.f(1, str2), str));
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
