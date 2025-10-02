package me.oriient.internal.services.uploadingManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* renamed from: me.oriient.internal.services.uploadingManager.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1528f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25633a;
    public final /* synthetic */ C1536n b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528f(C1536n c1536n, Continuation continuation) {
        super(2, continuation);
        this.b = c1536n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1528f(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1528f(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        me.oriient.internal.services.uploadingManager.models.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25633a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            C1536n c1536n = this.b;
            DataUploaderSession dataUploaderSession = c1536n.p;
            if (dataUploaderSession == null || (aVar = c1536n.q) == null || dataUploaderSession.getShouldBeUploaded()) {
                return unit;
            }
            dataUploaderSession.setShouldBeUploaded(true);
            aVar.c.setShouldBeUploaded(true);
            DataUploaderItemsStorage dataUploaderItemsStorage = this.b.b;
            String id = dataUploaderSession.getId();
            DataUploaderDataType dataUploaderDataType = this.b.e;
            this.f25633a = 1;
            obj = dataUploaderItemsStorage.getAllItems(id, dataUploaderDataType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        C1536n c1536n2 = this.b;
        for (DataUploaderItem dataUploaderItem : (Iterable) obj) {
            dataUploaderItem.setShouldBeUploaded(true);
            c1536n2.b.upsert("moveCurrentSessionToUploading", dataUploaderItem);
        }
        ((DataUploadScheduler) this.b.m.getD()).setConfig(this.b.f.getSchedulingConfig());
        DataUploadScheduler dataUploadScheduler = (DataUploadScheduler) this.b.m.getD();
        C1536n c1536n3 = this.b;
        dataUploadScheduler.scheduleUploading(c1536n3.i, c1536n3.h);
        return unit;
    }
}
