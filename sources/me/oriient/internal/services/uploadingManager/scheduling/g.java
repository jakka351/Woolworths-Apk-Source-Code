package me.oriient.internal.services.uploadingManager.scheduling;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* loaded from: classes7.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25658a;
    public final /* synthetic */ DataUploadScheduledWork b;
    public final /* synthetic */ DataUploadSchedulerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DataUploadScheduledWork dataUploadScheduledWork, DataUploadSchedulerImpl dataUploadSchedulerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = dataUploadScheduledWork;
        this.c = dataUploadSchedulerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25658a;
        if (i == 0) {
            ResultKt.b(obj);
            DataUploadScheduledWork dataUploadScheduledWork = this.b;
            Context context = this.c.getContextProvider().getContext();
            DataUploadScheduler.WakeUpReason wakeUpReason = DataUploadScheduler.WakeUpReason.AGGRESSIVE_MODE;
            this.f25658a = 1;
            if (dataUploadScheduledWork.execute(context, wakeUpReason, this) == coroutineSingletons) {
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
