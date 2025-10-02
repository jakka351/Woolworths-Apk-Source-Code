package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
final class zzfsq extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfrv zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfsq(zzfrv zzfrvVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfrvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfsq zzfsqVar = new zzfsq(this.zzb, continuation);
        zzfsqVar.zza = obj;
        return zzfsqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfsq) create((zzfrz) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        zzfsb zzfsbVarZza = zzfsa.zza((zzfrx) ((zzfrz) this.zza).zzcc());
        zzhll zzhllVarZzb = zzfsbVarZza.zzb();
        zzfrv zzfrvVar = this.zzb;
        String strZza = zzfrvVar.zza();
        Intrinsics.g(strZza, "getGwsQueryId(...)");
        zzfsbVarZza.zzc(zzhllVarZzb, strZza, zzfrvVar);
        return zzfsbVarZza.zza();
    }
}
