package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
final class zzeb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ CompletableDeferred zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, CompletableDeferred completableDeferred, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzecVar;
        this.zzc = completableDeferred;
        this.zzd = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzeb(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (this.zza != 0) {
            try {
                ResultKt.b(obj);
                zzebVar = this;
            } catch (zzbd e2) {
                zzbdVar = e2;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.g(zzbdVar);
                return Unit.f24250a;
            }
        } else {
            ResultKt.b(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (zzbd e3) {
                    e = e3;
                    zzbdVar = e;
                    zzebVar.zzb.zzf = zzcm.zzd;
                    zzebVar.zzc.g(zzbdVar);
                    return Unit.f24250a;
                }
            } catch (zzbd e4) {
                e = e4;
                zzebVar = this;
                zzbdVar = e;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.g(zzbdVar);
                return Unit.f24250a;
            }
        }
        ((Boolean) obj).getClass();
        return Unit.f24250a;
    }
}
