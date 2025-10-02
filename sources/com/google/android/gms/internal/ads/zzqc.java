package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public interface zzqc {
    void zzA();

    default void zzB() {
    }

    void zza(zzpz zzpzVar);

    default void zzb(@Nullable zzox zzoxVar) {
    }

    default void zzc(zzdb zzdbVar) {
    }

    boolean zzd(zzu zzuVar);

    int zze(zzu zzuVar);

    default zzpg zzf(zzu zzuVar) {
        throw null;
    }

    long zzg(boolean z);

    void zzh(zzu zzuVar, int i, @Nullable int[] iArr) throws zzpx;

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzpy, zzqb;

    void zzl() throws zzqb;

    boolean zzm();

    boolean zzn();

    void zzo(zzau zzauVar);

    zzau zzp();

    void zzq(boolean z);

    void zzr(zzc zzcVar);

    void zzs(int i);

    void zzt(zzd zzdVar);

    default void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    long zzv();

    @RequiresApi
    default void zzw(int i, int i2) {
    }

    void zzx(float f);

    void zzy();

    void zzz();
}
