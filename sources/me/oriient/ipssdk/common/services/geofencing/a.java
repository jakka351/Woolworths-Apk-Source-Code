package me.oriient.ipssdk.common.services.geofencing;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;

/* loaded from: classes2.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveGeofenceManagerImpl f25780a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        super(0);
        this.f25780a = liveGeofenceManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return LiveGeofenceStabilizerImpl.INSTANCE.newInstance(this.f25780a.g, ((RemoteConfig) LiveGeofenceManagerImpl.access$getConfigManager(this.f25780a).getConfig().getValue()).getRealTime().getGeofence().getGeofenceStabilityTimeLimitMillis(), LiveGeofenceManagerImpl.access$getGeofenceStatusesProvider(this.f25780a).getGeofenceStatuses());
    }
}
