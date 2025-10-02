package me.oriient.positioningengine.ondevice;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.positioningengine.ondevice.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1833u extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public I f26480a;
    public /* synthetic */ Object b;
    public final /* synthetic */ I c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833u(I i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return I.c(this.c, this);
    }
}
