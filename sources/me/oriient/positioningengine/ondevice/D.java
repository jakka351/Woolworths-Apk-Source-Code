package me.oriient.positioningengine.ondevice;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.common.PositioningContext;

/* loaded from: classes8.dex */
public final class D extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public I f26396a;
    public PositioningContext b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ I e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(I i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return I.a(this.e, (PositioningContext) null, false, (ContinuationImpl) this);
    }
}
