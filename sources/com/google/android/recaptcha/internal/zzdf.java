package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
final class zzdf extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsp zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzdt zzdtVar, zzsp zzspVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzdtVar;
        this.zzc = zzspVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdf(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdf) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws MissingResourceException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.zza;
        ResultKt.b(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            zzsp zzspVar = this.zzc;
            zzfj zzfjVarZzh = zzdt.zzh(zzdtVar);
            zzbr zzbrVarZzd = zzdt.zzd(zzdtVar);
            this.zza = 1;
            obj = zzfjVarZzh.zzb(zzbrVarZzd, zzspVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        zzsr zzsrVar = (zzsr) obj;
        this.zzd.zza();
        return zzsrVar;
    }
}
