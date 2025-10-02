package me.oriient.positioningengine.support.device_data;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class i extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DeviceDataRestImpl f26527a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DeviceDataRestImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DeviceDataRestImpl deviceDataRestImpl, Continuation continuation) {
        super(continuation);
        this.c = deviceDataRestImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.withTimeoutOrFailure(0L, null, this);
    }
}
