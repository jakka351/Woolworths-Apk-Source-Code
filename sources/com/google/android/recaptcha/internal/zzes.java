package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzes implements zzeo {

    @Nullable
    private static Timer zza;

    @NotNull
    private final Context zzb;

    @NotNull
    private final zzet zzc;

    @NotNull
    private final CoroutineScope zzd;

    @Nullable
    private final zzei zze;

    public zzes(@NotNull Context context, @NotNull zzet zzetVar, @NotNull CoroutineScope coroutineScope) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = coroutineScope;
        zzei zzeiVar = null;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, null) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzei zzeiVar;
        zztx zztxVarZzk;
        int iZzN;
        int i;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            Iterator it = CollectionsKt.O0(zzeiVar2.zzd(), 20, 20).iterator();
            while (it.hasNext()) {
                List<zzej> list = (List) it.next();
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        iZzN = zztxVarZzk.zzN();
                        i = iZzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (iZzN == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        zzrdVarZzi.zzq(zztxVarZzk.zzf());
                    } else if (i == 1) {
                        zzrdVarZzi.zzr(zztxVarZzk.zzg());
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(zzejVar);
                }
                if (zzrdVarZzi.zzf() + zzrdVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(@NotNull zztx zztxVar) {
        BuildersKt.c(this.zzd, null, null, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}
