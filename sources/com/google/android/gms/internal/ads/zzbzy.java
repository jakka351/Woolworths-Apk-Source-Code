package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbzy implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcah zzb;

    public zzbzy(zzcah zzcahVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcahVar);
        this.zzb = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcah zzcahVar = this.zzb;
        zzcahVar.zzs(this.zza);
        if (zzcahVar.zzt() != null) {
            zzcahVar.zzt().zzb();
        }
    }
}
