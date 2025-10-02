package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.positioningengine.common.PositioningEngine;

/* renamed from: me.oriient.ipssdk.realtime.ofs.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1655h0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C1655h0 f26080a = new C1655h0();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        CoreLogic.access$observerEngine(CoreLogic.INSTANCE, (PositioningEngine) obj);
        return Unit.f24250a;
    }
}
