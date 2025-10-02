package me.oriient.positioningengine.support;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;

/* loaded from: classes8.dex */
public final class M extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public OnDeviceSessionsUploadManagerImpl f26507a;
    public DataUploadScheduler.UploadTrigger b;
    public DataUploadScheduledWork c;
    public /* synthetic */ Object d;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, Continuation continuation) {
        super(continuation);
        this.e = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.onUploadTrigger(null, null, this);
    }
}
