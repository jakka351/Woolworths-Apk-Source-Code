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
final class zzdx extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzecVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdx(this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.zza;
        ResultKt.b(obj);
        if (i == 0) {
            CompletableDeferred completableDeferred = this.zzb.zzc;
            this.zza = 1;
            if (completableDeferred.await(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f24250a;
    }
}
