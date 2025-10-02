package me.oriient.positioningengine.support.engineManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class l extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public SupportPositioningEngineManagerImpl f26536a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ SupportPositioningEngineManagerImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, Continuation continuation) {
        super(continuation);
        this.d = supportPositioningEngineManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.clearBuildingCache(null, this);
    }
}
