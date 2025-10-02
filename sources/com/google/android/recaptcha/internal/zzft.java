package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzft implements zzfo {

    @NotNull
    private final CoroutineScope zza;

    @NotNull
    private final zzgf zzb;

    @NotNull
    private final zzhx zzc;

    @NotNull
    private final Map zzd;

    public zzft(@NotNull CoroutineScope coroutineScope, @NotNull zzgf zzgfVar, @NotNull zzhx zzhxVar, @NotNull Map map) {
        this.zza = coroutineScope;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int iZzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (iZza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        int iZzk = zzufVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new zzfq(zzgdVar, list, this, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new zzfr(exc, zzgdVar, this, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(@NotNull String str) {
        BuildersKt.c(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}
