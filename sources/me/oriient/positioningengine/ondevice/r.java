package me.oriient.positioningengine.ondevice;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingWalk;

/* loaded from: classes8.dex */
public final class r implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f26477a;

    public r(I i) {
        this.f26477a = i;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        String str = (String) obj;
        PositioningDebuggingManager positioningDebuggingManager = this.f26477a.h;
        PositioningDebuggingWalk walk = positioningDebuggingManager != null ? positioningDebuggingManager.getWalk() : null;
        Unit unit = Unit.f24250a;
        if (walk != null) {
            return unit;
        }
        C1821h c1821h = this.f26477a.x;
        PositioningEngineError.EngineCoreError engineCoreError = new PositioningEngineError.EngineCoreError(str);
        I i = c1821h.f26432a;
        i.y = null;
        Object objA = i.a(engineCoreError, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (objA != coroutineSingletons) {
            objA = unit;
        }
        return objA == coroutineSingletons ? objA : unit;
    }
}
