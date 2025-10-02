package me.oriient.ipssdk.common.ofs;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class V implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveGeofenceManagerImpl f25733a;

    public V(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        this.f25733a = liveGeofenceManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Unit unit = Unit.f24250a;
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            LiveGeofenceManagerImpl.access$onNewStableGeofences(this.f25733a, map);
            return unit;
        }
        Object obj2 = this.f25733a.j;
        LiveGeofenceManagerImpl liveGeofenceManagerImpl = this.f25733a;
        synchronized (obj2) {
            liveGeofenceManagerImpl.k.clear();
        }
        return unit;
    }
}
