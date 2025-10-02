package me.oriient.internal.services.uploadingManager;

import java.util.HashMap;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.powerManager.PowerManager;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemMetadata;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemStatus;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;

/* renamed from: me.oriient.internal.services.uploadingManager.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1530h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25635a;
    public final /* synthetic */ C1536n b;
    public final /* synthetic */ DataUploaderSession c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530h(C1536n c1536n, DataUploaderSession dataUploaderSession, Continuation continuation) {
        super(2, continuation);
        this.b = c1536n;
        this.c = dataUploaderSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1530h(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1530h(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25635a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        C1536n c1536n = this.b;
        DataUploaderImpl dataUploaderImpl = c1536n.c;
        DataUploaderSession dataUploaderSession = this.c;
        DataUploaderItemMetadata dataUploaderItemMetadata = new DataUploaderItemMetadata(dataUploaderSession.getUploadingUrl(), dataUploaderSession.getApiKey(), dataUploaderSession.getSpaceId(), dataUploaderSession.getSessionStartTimeMillis(), dataUploaderSession.getSessionStartTimeMillis() + Math.abs(0L), 1, ((Number) ((PowerManager) c1536n.n.getD()).getBatteryLevel().getValue()).floatValue(), dataUploaderSession.getDataFormatVersion(), dataUploaderSession.getSessionType());
        DataUploaderItem.EndReason.StartMarker startMarker = new DataUploaderItem.EndReason.StartMarker();
        String string = UUID.randomUUID().toString();
        DataUploaderDataType dataUploaderDataType = c1536n.e;
        String id = dataUploaderSession.getId();
        long startTimeMillis = dataUploaderItemMetadata.getStartTimeMillis();
        String value = startMarker.getValue();
        DataUploaderItemStatus dataUploaderItemStatus = DataUploaderItemStatus.COLLECTING;
        HashMap<String, Jsonable> clientMetadata = dataUploaderSession.getClientMetadata();
        boolean shouldBeUploaded = dataUploaderSession.getShouldBeUploaded();
        Intrinsics.e(string);
        DataUploaderItem dataUploaderItem = new DataUploaderItem(string, dataUploaderDataType, id, startTimeMillis, 0L, value, false, dataUploaderItemStatus, null, null, dataUploaderItemMetadata, clientMetadata, shouldBeUploaded);
        this.f25635a = 1;
        Object objSendUploadingStartRequest = dataUploaderImpl.sendUploadingStartRequest(dataUploaderItem, this);
        return objSendUploadingStartRequest == coroutineSingletons ? coroutineSingletons : objSendUploadingStartRequest;
    }
}
