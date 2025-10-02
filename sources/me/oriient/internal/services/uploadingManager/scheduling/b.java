package me.oriient.internal.services.uploadingManager.scheduling;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* loaded from: classes7.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25656a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Intent c;
    public final /* synthetic */ DataUploadScheduler.WakeUpReason d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, Intent intent, DataUploadScheduler.WakeUpReason wakeUpReason, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = intent;
        this.d = wakeUpReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25656a;
        if (i == 0) {
            ResultKt.b(obj);
            d dVar = DataUploadScheduledWork.Companion;
            Context context = this.b;
            Bundle extras = this.c.getExtras();
            DataUploadScheduler.WakeUpReason wakeUpReason = this.d;
            this.f25656a = 1;
            dVar.getClass();
            if (d.a(context, extras, wakeUpReason, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
