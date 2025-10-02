package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
final class zza extends ContinuationImpl {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzeVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbd {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == CoroutineSingletons.d ? objZzc : new Result(objZzc);
    }
}
