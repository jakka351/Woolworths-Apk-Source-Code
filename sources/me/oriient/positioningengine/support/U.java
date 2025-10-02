package me.oriient.positioningengine.support;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class U extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public OnDeviceSessionsUploadManagerImpl f26514a;
    public /* synthetic */ Object b;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, Continuation continuation) {
        super(continuation);
        this.c = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.updateFloorMetadata(null, this);
    }
}
