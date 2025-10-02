package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbn;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: classes5.dex */
public final class zzdgu implements zzcvs, zzdde {
    private final zzbxo zza;
    private final Context zzb;
    private final zzbxr zzc;

    @Nullable
    private final View zzd;
    private String zze;
    private final zzbbn.zza.EnumC0292zza zzf;

    public zzdgu(zzbxo zzbxoVar, Context context, zzbxr zzbxrVar, @Nullable View view, zzbbn.zza.EnumC0292zza enumC0292zza) {
        this.zza = zzbxoVar;
        this.zzb = context;
        this.zzc = zzbxrVar;
        this.zzd = view;
        this.zzf = enumC0292zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    @ParametersAreNonnullByDefault
    public final void zzd(zzbvh zzbvhVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzbxr zzbxrVar = this.zzc;
        Context context = this.zzb;
        if (zzbxrVar.zza(context)) {
            try {
                zzbxrVar.zzo(context, zzbxrVar.zzj(context), this.zza.zzb(), zzbvhVar.zzb(), zzbvhVar.zzc());
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        this.zza.zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzg(view.getContext(), this.zze);
        }
        this.zza.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzh() {
        zzbbn.zza.EnumC0292zza enumC0292zza = this.zzf;
        if (enumC0292zza == zzbbn.zza.EnumC0292zza.APP_OPEN) {
            return;
        }
        String strZzf = this.zzc.zzf(this.zzb);
        this.zze = strZzf;
        this.zze = String.valueOf(strZzf).concat(enumC0292zza == zzbbn.zza.EnumC0292zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
