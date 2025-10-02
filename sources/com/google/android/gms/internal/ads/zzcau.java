package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class zzcau {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    public static int zzP() {
        return zza.get();
    }

    public static int zzQ() {
        return zzb.get();
    }

    public static AtomicInteger zzf() {
        return zza;
    }

    public static AtomicInteger zzi() {
        return zzb;
    }

    public abstract void zzA(int i);

    public abstract boolean zzB();

    public abstract int zzC();

    public abstract long zzD();

    public abstract void zzE(boolean z);

    public abstract void zzF(int i);

    public abstract void zzG(int i);

    public abstract long zzH();

    public abstract long zzI();

    public abstract long zzJ();

    public abstract long zzK();

    public abstract int zzL();

    public abstract void zzM(boolean z);

    public abstract long zzN();

    public abstract long zzO();

    @Nullable
    public abstract Integer zzj();

    public abstract void zzn(@Nullable Integer num);

    public abstract void zzq(Uri[] uriArr, String str);

    public abstract void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    public abstract void zzs(zzcat zzcatVar);

    public abstract void zzt();

    public abstract void zzu(Surface surface, boolean z) throws IOException;

    public abstract void zzv(float f, boolean z) throws IOException;

    public abstract void zzw();

    public abstract void zzx(long j);

    public abstract void zzy(int i);

    public abstract void zzz(int i);
}
