package me.oriient.positioningengine.support;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.support.OnDeviceSessionsUploadManager;

/* loaded from: classes8.dex */
public final class S extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public OnDeviceSessionsUploadManagerImpl f26512a;
    public OnDeviceSessionsUploadManager.StartPositioningParams b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, Continuation continuation) {
        super(continuation);
        this.e = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.startPositioning(null, this);
    }
}
