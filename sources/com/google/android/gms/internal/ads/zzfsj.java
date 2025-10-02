package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
final class zzfsj extends SuspendLambda implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfsj(String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzfsj zzfsjVar = new zzfsj(this.zzb, continuation);
        zzfsjVar.zza = obj;
        return zzfsjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfsj) create((zzfrz) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        zzfsb zzfsbVarZza = zzfsa.zza((zzfrx) ((zzfrz) this.zza).zzcc());
        zzfsbVarZza.zzd(zzfsbVarZza.zzb(), this.zzb);
        return zzfsbVarZza.zza();
    }
}
