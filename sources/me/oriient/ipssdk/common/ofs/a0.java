package me.oriient.ipssdk.common.ofs;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStabilizerImpl;

/* loaded from: classes2.dex */
public final class a0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveGeofenceStabilizerImpl f25739a;

    public a0(LiveGeofenceStabilizerImpl liveGeofenceStabilizerImpl) {
        this.f25739a = liveGeofenceStabilizerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        LiveGeofenceStabilizerImpl.access$onNewGeofences(this.f25739a, (Map) obj);
        return Unit.f24250a;
    }
}
