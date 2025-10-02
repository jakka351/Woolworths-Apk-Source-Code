package me.oriient.internal.services.uploadingManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* loaded from: classes7.dex */
public final class A extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25611a;
    public final /* synthetic */ DataUploaderImpl b;
    public final /* synthetic */ DataUploaderItem c;
    public final /* synthetic */ DataUploadScheduler.UploadTrigger d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(DataUploaderImpl dataUploaderImpl, DataUploaderItem dataUploaderItem, DataUploadScheduler.UploadTrigger uploadTrigger, Continuation continuation) {
        super(2, continuation);
        this.b = dataUploaderImpl;
        this.c = dataUploaderItem;
        this.d = uploadTrigger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25611a;
        if (i == 0) {
            ResultKt.b(obj);
            DataUploaderImpl dataUploaderImpl = this.b;
            DataUploaderItem dataUploaderItem = this.c;
            DataUploadScheduler.UploadTrigger uploadTrigger = this.d;
            this.f25611a = 1;
            if (dataUploaderImpl.uploadItem(dataUploaderItem, uploadTrigger, this) == coroutineSingletons) {
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
