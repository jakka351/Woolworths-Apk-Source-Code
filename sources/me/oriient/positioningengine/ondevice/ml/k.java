package me.oriient.positioningengine.ondevice.ml;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class k extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public o f26457a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return o.a(this.c, this);
    }
}
