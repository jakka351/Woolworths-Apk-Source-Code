package me.oriient.positioningengine.support;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.common.CalibrationContext;

/* loaded from: classes8.dex */
public final class P extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public OnDeviceSessionsUploadManagerImpl f26510a;
    public CalibrationContext b;
    public /* synthetic */ Object c;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, Continuation continuation) {
        super(continuation);
        this.d = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.startCalibration(null, 0L, null, null, this);
    }
}
