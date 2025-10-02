package me.oriient.internal.services.uploadingManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* renamed from: me.oriient.internal.services.uploadingManager.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1529g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25634a;
    public final /* synthetic */ C1536n b;
    public final /* synthetic */ DataUploadScheduledWork c;
    public final /* synthetic */ DataUploadScheduler.UploadTrigger d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529g(C1536n c1536n, DataUploadScheduledWork dataUploadScheduledWork, DataUploadScheduler.UploadTrigger uploadTrigger, Continuation continuation) {
        super(2, continuation);
        this.b = c1536n;
        this.c = dataUploadScheduledWork;
        this.d = uploadTrigger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1529g(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1529g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25634a;
        if (i == 0) {
            ResultKt.b(obj);
            C1536n.a(this.b).d("DataUploadManager", "onUploadTrigger() called");
            DataUploaderImpl dataUploaderImpl = this.b.c;
            DataUploadScheduledWork dataUploadScheduledWork = this.c;
            DataUploadScheduler.UploadTrigger uploadTrigger = this.d;
            this.f25634a = 1;
            if (dataUploaderImpl.uploadEverything(dataUploadScheduledWork, uploadTrigger, this) == coroutineSingletons) {
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
