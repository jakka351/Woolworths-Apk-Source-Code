package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface zzll extends zzlg {
    String zzS();

    default long zzT(long j, long j2) {
        if (zze() == 1) {
            return (zzX() || zzY()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default void zzU(float f, float f2) throws zzhz {
    }

    default void zzV() {
    }

    void zzW(long j, long j2) throws zzhz;

    boolean zzX();

    boolean zzY();

    int zza();

    zzln zzb();

    void zzc(int i, zzox zzoxVar, zzdb zzdbVar);

    void zzcY() throws zzhz;

    void zzcZ(zzu[] zzuVarArr, zzwf zzwfVar, long j, long j2, zzup zzupVar) throws zzhz;

    @Nullable
    zzkm zzd();

    @Nullable
    zzwf zzda();

    boolean zzdb();

    int zze();

    void zzf(zzlo zzloVar, zzu[] zzuVarArr, zzwf zzwfVar, long j, boolean z, boolean z2, long j2, long j3, zzup zzupVar) throws zzhz;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbe zzbeVar);

    void zzp(long j) throws zzhz;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}
