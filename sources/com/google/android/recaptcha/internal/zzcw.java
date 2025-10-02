package com.google.android.recaptcha.internal;

import java.util.MissingResourceException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
final class zzcw extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws MissingResourceException {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo52execute0E7RQCE = this.zzb.mo52execute0E7RQCE(null, 0L, this);
        return objMo52execute0E7RQCE == CoroutineSingletons.d ? objMo52execute0E7RQCE : new Result(objMo52execute0E7RQCE);
    }
}
