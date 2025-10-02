package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
final class zzfyx extends zzfzq {
    private final Map zza;
    private final Context zzb;
    private final zzfvd zzc;
    private final long zzd;
    private final long zze;

    public zzfyx(zzarw zzarwVar, zzfym zzfymVar, Map map, Context context, zzfvd zzfvdVar, zzfui zzfuiVar, zzgea zzgeaVar) {
        super("mLLgbGPnthnmbtiY4qwSRZlP76fxHEn5RINQ3z6Wy79B89SpuoxQV8DFaf5u5bey", "s6mOQtxGebk+yjD4WdDHHvKqxnbPaF0rtJwo8mM3ABY=", zzarwVar, zzfymVar, zzgeaVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzfvdVar;
        this.zzd = zzfuiVar.zzj();
        this.zze = zzfuiVar.zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        zzast zzastVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String strZzb = "E";
        int i = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzastVar = (zzast) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzastVar.zzb().length() > 1)) {
                strZzb = zzastVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.zza.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzghs.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzarwVar) {
            try {
                zzarwVar.zzu(((Long) objArr[0]).longValue());
                zzarwVar.zzt((String) objArr[1]);
                zzarwVar.zzD((String) objArr[2]);
                zzarwVar.zzE((String) objArr[3]);
                zzgmk zzgmkVarZzi = zzgmk.zzn().zzi();
                byte[] bArr = (byte[]) objArr[4];
                zzarwVar.zzp(zzgmkVarZzi.zzj(bArr, 0, bArr.length));
                zzarwVar.zzo(strZzb);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    zzarwVar.zzai(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
