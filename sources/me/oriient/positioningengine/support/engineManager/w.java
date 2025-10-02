package me.oriient.positioningengine.support.engineManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.models.OnDeviceEngineSession;

/* loaded from: classes8.dex */
public final class w extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f26547a;
    public PositioningEngine b;
    public EngineConfig c;
    public h d;
    public OnDeviceEngineSession e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ SupportPositioningEngineManagerImpl h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, Continuation continuation) {
        super(continuation);
        this.h = supportPositioningEngineManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.provideRelevantEngine(null, null, false, this);
    }
}
