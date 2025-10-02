package com.google.android.gms.internal.ads;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
final class zzfso extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzftd zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfso(zzftd zzftdVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzftdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfso(this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfso) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.zza;
        ResultKt.b(obj);
        if (i == 0) {
            zzftd zzftdVar = this.zzb;
            this.zza = 1;
            if (zzftdVar.zzj(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f24250a;
    }
}
