package me.oriient.ipssdk.common.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class M implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveGeofenceManagerImpl f25726a;

    public M(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        this.f25726a = liveGeofenceManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        LiveGeofenceManagerImpl.access$getGeofenceStabilizer(this.f25726a).setStabilityTimeLimitMillis(((RemoteConfig) obj).getRealTime().getGeofence().getGeofenceStabilityTimeLimitMillis());
        return Unit.f24250a;
    }
}
