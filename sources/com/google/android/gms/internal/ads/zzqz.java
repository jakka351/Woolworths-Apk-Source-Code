package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzqz extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzrb zza;

    public zzqz(zzrb zzrbVar) {
        Objects.requireNonNull(zzrbVar);
        this.zza = zzrbVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ()) && zzrcVar.zzI() != null && zzrcVar.zzL()) {
            zzrcVar.zzI().zza();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ())) {
            zzrcVar.zzK(true);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ()) && zzrcVar.zzI() != null && zzrcVar.zzL()) {
            zzrcVar.zzI().zza();
        }
    }
}
