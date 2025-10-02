package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
final class zzfzl extends zzfzq {
    private final Context zza;
    private final Map zzb;

    public zzfzl(zzarw zzarwVar, zzfym zzfymVar, Map map, Context context, zzgea zzgeaVar) {
        super("x/ivla75gbIxCSMBtwVFWwE7jSlsNIYRehCnDl+Ns11wdt5XgfFS+Bzic10LR+be", "N9mlriyqiGYjveLiAIuV0+bKr3wcLcRtJx5Wr89lqng=", zzarwVar, zzfymVar, zzgeaVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfzq
    public final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l = (Long) method.invoke("", this.zza);
                if (l == null) {
                    throw null;
                }
                lValueOf = l;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) this.zzb.get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    lValueOf = Long.valueOf(((zzast) listenableFuture.get()).zzd());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzarwVar) {
            zzarwVar.zzR(lValueOf.longValue());
        }
    }
}
