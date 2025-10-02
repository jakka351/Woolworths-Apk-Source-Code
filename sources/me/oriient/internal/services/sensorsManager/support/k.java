package me.oriient.internal.services.sensorsManager.support;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.SensorsDataProviderDelegate;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;

/* loaded from: classes7.dex */
public final class k implements SensorsDataProviderDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SupportSensorsManagerImpl f25598a;

    public k(SupportSensorsManagerImpl supportSensorsManagerImpl) {
        this.f25598a = supportSensorsManagerImpl;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProviderDelegate
    public final void onNewSample(SensorsDataSample sample, List errors) {
        Intrinsics.h(sample, "sample");
        Intrinsics.h(errors, "errors");
        this.f25598a.onNewSample(sample, errors);
    }
}
