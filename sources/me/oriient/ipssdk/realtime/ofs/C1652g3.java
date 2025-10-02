package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.Positioning;

/* renamed from: me.oriient.ipssdk.realtime.ofs.g3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1652g3 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C1652g3 f26078a = new C1652g3();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            Positioning.access$getChargingBasedSessionController(Positioning.INSTANCE).activate();
        } else if (!zBooleanValue) {
            Positioning.access$getChargingBasedSessionController(Positioning.INSTANCE).deactivate();
        }
        return Unit.f24250a;
    }
}
