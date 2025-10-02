package me.oriient.positioningengine.ondevice.calibration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public e f26414a;
    public me.oriient.positioningengine.ondevice.models.calibration.b b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
