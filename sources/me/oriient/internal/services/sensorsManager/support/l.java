package me.oriient.internal.services.sensorsManager.support;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;

/* loaded from: classes7.dex */
public final class l implements SensorsDataProvider.SessionStartListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SupportSensorsManagerImpl f25599a;

    public l(SupportSensorsManagerImpl supportSensorsManagerImpl) {
        this.f25599a = supportSensorsManagerImpl;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider.SessionStartListener
    public final void onError(SensorManagerError error) {
        Intrinsics.h(error, "error");
        this.f25599a.getLogger().e("SupportSensorsManager", "onError: failed to restart sensors - " + error.getMessage());
        this.f25599a.getELog().e("SupportSensorsManager", "failed to restart sensors", MapsKt.i(new Pair("errorMessage", error.getMessage())));
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider.SessionStartListener
    public final void onSessionStart() {
        this.f25599a.getLogger().i("SupportSensorsManager", "onSessionStart: sensors restarted");
        this.f25599a.getELog().i("SupportSensorsManager", "sensors restarted");
    }
}
