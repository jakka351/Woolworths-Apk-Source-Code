package me.oriient.positioningengine.support.engineManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class B extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f26531a;
    public Object b;
    public Object c;
    public PositioningEngine d;
    public /* synthetic */ Object e;
    public final /* synthetic */ SupportPositioningEngineManagerImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, Continuation continuation) {
        super(continuation);
        this.f = supportPositioningEngineManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.resetSupportObjects(null, null, null, this);
    }
}
