package me.oriient.positioningengine.support.engineManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;

/* loaded from: classes8.dex */
public final class q extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DiProvidable f26541a;
    public PositioningEngineCredentials b;
    public EngineConfig c;
    public SpecificEngineConfig d;
    public PredefinedDataShift e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SupportPositioningEngineManagerImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, Continuation continuation) {
        super(continuation);
        this.g = supportPositioningEngineManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.createOnDeviceEngine(null, null, null, null, this);
    }
}
