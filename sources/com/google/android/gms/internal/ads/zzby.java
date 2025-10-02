package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzby {
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zzc zzd;

    @Nullable
    private final Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    public zzby(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zzc zzcVar, boolean z) {
        this.zzc = handler;
        this.zzd = zzcVar;
        this.zzb = onAudioFocusChangeListener;
        this.zzf = new AudioFocusRequest.Builder(1).setAudioAttributes(zzcVar.zza()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzby)) {
            return false;
        }
        zzby zzbyVar = (zzby) obj;
        return Objects.equals(this.zzb, zzbyVar.zzb) && Objects.equals(this.zzc, zzbyVar.zzc) && Objects.equals(this.zzd, zzbyVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(1, this.zzb, this.zzc, this.zzd, Boolean.FALSE);
    }

    public final zzc zza() {
        return this.zzd;
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    @RequiresApi
    public final AudioFocusRequest zzc() {
        Object obj = this.zzf;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }
}
