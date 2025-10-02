package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.systemStateManager.EngineEvent;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* loaded from: classes8.dex */
public final class G0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final G0 f25942a = new G0();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        CoreLogic.access$getSystemStateManager(CoreLogic.INSTANCE).onEngineEvent(new EngineEvent.IsPositionLockedChanged(((Boolean) obj).booleanValue()));
        return Unit.f24250a;
    }
}
