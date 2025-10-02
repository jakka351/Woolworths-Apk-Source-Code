package me.oriient.positioningengine.support;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.services.uploadingManager.DataUploadManager;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;

/* loaded from: classes8.dex */
public final class N extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f26508a;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl b;
    public final /* synthetic */ DataUploaderSession c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, DataUploaderSession dataUploaderSession, Continuation continuation) {
        super(1, continuation);
        this.b = onDeviceSessionsUploadManagerImpl;
        this.c = dataUploaderSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new N(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new N(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26508a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        DataUploadManager dataUploadManager = this.b.sensorsDataUploader;
        DataUploaderSession dataUploaderSession = this.c;
        this.f26508a = 1;
        Object objSendUploadingStartRequest = dataUploadManager.sendUploadingStartRequest(dataUploaderSession, this);
        return objSendUploadingStartRequest == coroutineSingletons ? coroutineSingletons : objSendUploadingStartRequest;
    }
}
