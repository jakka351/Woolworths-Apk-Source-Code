package me.oriient.positioningengine.ondevice;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class W extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public X f26408a;
    public /* synthetic */ Object b;
    public final /* synthetic */ X c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
