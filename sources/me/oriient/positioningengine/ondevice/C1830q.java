package me.oriient.positioningengine.ondevice;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.positioningengine.ondevice.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1830q extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26476a;
    public final /* synthetic */ I b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1830q(I i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26476a = obj;
        this.c |= Integer.MIN_VALUE;
        return I.b(this.b, this);
    }
}
