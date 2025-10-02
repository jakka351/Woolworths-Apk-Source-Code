package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes6.dex */
final class zzea extends SuspendLambda implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ CompletableDeferred zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, CompletableDeferred completableDeferred, Continuation continuation) {
        super(1, continuation);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new zzea(this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        zzbd e;
        zzen zzenVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.zzb;
        if (i == 0) {
            ResultKt.b(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j, this);
                if (objZzo != coroutineSingletons) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return coroutineSingletons;
            } catch (zzbd e2) {
                zzenVar = zzenVarZzf;
                e = e2;
                this.zzc.zzd = e;
                zzenVar.zzb(e);
                throw e;
            }
        }
        if (i != 1) {
            zzenVar = (zzen) this.zza;
            try {
                ResultKt.b(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return Boolean.valueOf(this.zze.h(Unit.f24250a));
            } catch (zzbd e3) {
                e = e3;
                this.zzc.zzd = e;
                zzenVar.zzb(e);
                throw e;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            ResultKt.b(obj);
        } catch (zzbd e4) {
            e = e4;
            zzenVar = zzenVar2;
            this.zzc.zzd = e;
            zzenVar.zzb(e);
            throw e;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j2 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j2, this) != coroutineSingletons) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(this.zze.h(Unit.f24250a));
        }
        return coroutineSingletons;
    }
}
