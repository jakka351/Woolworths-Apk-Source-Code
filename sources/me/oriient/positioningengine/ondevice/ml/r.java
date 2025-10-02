package me.oriient.positioningengine.ondevice.ml;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class r extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public u f26462a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
