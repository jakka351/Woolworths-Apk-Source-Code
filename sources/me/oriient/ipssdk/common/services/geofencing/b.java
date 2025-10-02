package me.oriient.ipssdk.common.services.geofencing;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveGeofenceManagerImpl f25781a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        super(0);
        this.f25781a = liveGeofenceManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return LiveGeofenceStatusesProviderImpl.INSTANCE.newInstance(this.f25781a.g);
    }
}
