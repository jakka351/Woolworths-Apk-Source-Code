package me.oriient.internal.services.uploadingManager.scheduling;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.PersistableBundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* loaded from: classes7.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25657a;
    public final /* synthetic */ DataUploadScheduledJob b;
    public final /* synthetic */ JobParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DataUploadScheduledJob dataUploadScheduledJob, JobParameters jobParameters, Continuation continuation) {
        super(2, continuation);
        this.b = dataUploadScheduledJob;
        this.c = jobParameters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25657a;
        if (i == 0) {
            ResultKt.b(obj);
            d dVar = DataUploadScheduledWork.Companion;
            Context applicationContext = this.b.getApplicationContext();
            Intrinsics.g(applicationContext, "getApplicationContext(...)");
            PersistableBundle extras = this.c.getExtras();
            DataUploadScheduler.WakeUpReason wakeUpReason = DataUploadScheduler.WakeUpReason.SCHEDULED_JOB;
            this.f25657a = 1;
            dVar.getClass();
            if (d.a(applicationContext, extras, wakeUpReason, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.b.jobFinished(this.c, false);
        return Unit.f24250a;
    }
}
