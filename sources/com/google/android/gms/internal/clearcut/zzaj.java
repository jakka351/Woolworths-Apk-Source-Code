package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;
import au.com.woolworths.shop.checkout.ui.confirmation.c;

/* loaded from: classes5.dex */
final class zzaj extends zzae<Boolean> {
    public zzaj(zzao zzaoVar, String str, Boolean bool) {
        super(zzaoVar, str, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzae
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final Boolean zza(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.zzds, false));
        } catch (ClassCastException e) {
            String strValueOf = String.valueOf(this.zzds);
            Log.e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(strValueOf) : new String("Invalid boolean value in SharedPreferences for "), e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    public final /* synthetic */ Boolean zzb(String str) {
        if (zzy.zzcr.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (zzy.zzcs.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.zzds;
        StringBuilder sb = new StringBuilder(c.f(c.f(28, str2), str));
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
