package me.oriient.positioningengine.ondevice.debugging;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes8.dex */
public final class e implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f26420a;

    public e(n nVar) {
        this.f26420a = nVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objA = n.a(this.f26420a, ((PositioningDebuggingWalk) obj).getStartCalibrated(), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
