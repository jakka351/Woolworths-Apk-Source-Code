package me.oriient.positioningengine.support.engineManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;

/* loaded from: classes8.dex */
public final class z extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public SupportPositioningEngineManagerImpl f26550a;
    public PositioningEngineCredentials b;
    public EngineConfig c;
    public SpecificEngineConfig d;
    public /* synthetic */ Object e;
    public final /* synthetic */ SupportPositioningEngineManagerImpl f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, Continuation continuation) {
        super(continuation);
        this.f = supportPositioningEngineManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.reCreateOnDeviceEngine(null, null, null, this);
    }
}
