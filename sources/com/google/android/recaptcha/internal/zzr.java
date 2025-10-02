package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
final class zzr extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzy zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzy zzyVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzyVar;
        this.zzc = str;
        this.zzd = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzr(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.zza;
        ResultKt.b(obj);
        if (i == 0) {
            zzy zzyVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzyVar.zzc(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.zzd.add((zzaa) obj);
        return Unit.f24250a;
    }
}
