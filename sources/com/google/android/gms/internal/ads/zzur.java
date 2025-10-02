package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface zzur {
    default void zzA(zzaj zzajVar) {
    }

    void zzC(zzun zzunVar);

    zzun zzG(zzup zzupVar, zzyv zzyvVar, long j);

    @Nullable
    default zzbe zzH() {
        return null;
    }

    default boolean zzI() {
        return true;
    }

    zzaj zzJ();

    void zzl(Handler handler, zzva zzvaVar);

    void zzm(zzva zzvaVar);

    void zzn(Handler handler, zzrq zzrqVar);

    void zzo(zzrq zzrqVar);

    void zzp(zzuq zzuqVar, @Nullable zzgy zzgyVar, zzox zzoxVar);

    void zzq(zzuq zzuqVar);

    void zzr(zzuq zzuqVar);

    void zzs(zzuq zzuqVar);

    void zzt() throws IOException;
}
