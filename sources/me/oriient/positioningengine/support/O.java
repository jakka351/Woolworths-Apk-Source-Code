package me.oriient.positioningengine.support;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.retryOperation.RetryExtensionsKt;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;

/* loaded from: classes8.dex */
public final class O extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26509a;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl b;
    public final /* synthetic */ DataUploaderSession c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, DataUploaderSession dataUploaderSession, Continuation continuation) {
        super(2, continuation);
        this.b = onDeviceSessionsUploadManagerImpl;
        this.c = dataUploaderSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new O(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new O(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        O o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26509a;
        if (i == 0) {
            ResultKt.b(obj);
            Logger logger = this.b.getLogger();
            int i2 = this.b.startReportingRetryCount;
            long j = this.b.startReportingRetryIntervalMillis;
            N n = new N(this.b, this.c, null);
            this.f26509a = 1;
            o = this;
            obj = RetryExtensionsKt.retryToPeriodic("OnDeviceSessionsUploadM", "sending session start", logger, i2, j, n, o);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            o = this;
        }
        Outcome outcome = (Outcome) obj;
        OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl = o.b;
        if (outcome instanceof Outcome.Success) {
            onDeviceSessionsUploadManagerImpl.getELog().d("OnDeviceSessionsUploadM", "Reported session start");
        }
        OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl2 = o.b;
        if (outcome instanceof Outcome.Failure) {
            onDeviceSessionsUploadManagerImpl2.getELog().e("OnDeviceSessionsUploadM", "Failed to report session start", MapsKt.i(new Pair("errorMessage", ((OriientError) ((Outcome.Failure) outcome).getValue()).getMessage())));
        }
        return Unit.f24250a;
    }
}
