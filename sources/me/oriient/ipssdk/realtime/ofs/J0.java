package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.positioningengine.common.ActiveFloorUpdate;

/* loaded from: classes8.dex */
public final class J0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final J0 f25960a = new J0();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        CoreLogic.access$onActiveFloorChanged(CoreLogic.INSTANCE, ((ActiveFloorUpdate) obj).getFloorId());
        return Unit.f24250a;
    }
}
