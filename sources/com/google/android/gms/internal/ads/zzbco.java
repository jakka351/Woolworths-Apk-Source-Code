package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes5.dex */
public final class zzbco {
    public static final void zza(zzbcn zzbcnVar, @Nullable zzbcl zzbclVar) {
        if (zzbclVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbclVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbcnVar.zza(zzbclVar.zzb(), zzbclVar.zzc(), zzbclVar.zza(), zzbclVar.zzd());
    }
}
