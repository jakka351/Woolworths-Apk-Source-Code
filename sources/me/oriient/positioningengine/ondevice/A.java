package me.oriient.positioningengine.ondevice;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class A extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public I f26393a;
    public EngineSessionMetadata b;
    public /* synthetic */ Object c;
    public final /* synthetic */ I d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(I i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((EngineSessionMetadata) null, this);
    }
}
