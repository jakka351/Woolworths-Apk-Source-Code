package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes6.dex */
final class zzfq extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, continuation);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.zza;
        Unit unit = Unit.f24250a;
        ResultKt.b(obj);
        if (i != 0) {
            return unit;
        }
        CoroutineScope coroutineScope = (CoroutineScope) this.zze;
        while (true) {
            zzgd zzgdVar = this.zzb;
            if (zzgdVar.zza() < 0) {
                break;
            }
            if (zzgdVar.zza() >= this.zzc.size() || !CoroutineScopeKt.d(coroutineScope)) {
                break;
            }
            zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
            try {
                zzft.zzf(this.zzd, zzufVar, this.zzb);
            } catch (Exception e) {
                zzufVar.zzk();
                Boxing.a(zzufVar.zzg());
                CollectionsKt.M(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                zzft zzftVar = this.zzd;
                zzgd zzgdVar2 = this.zzb;
                this.zza = 1;
                if (zzftVar.zzh(e, zzgdVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return unit;
    }
}
