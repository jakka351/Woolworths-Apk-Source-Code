package me.oriient.internal.services.sensorsManager.support;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.SensorsManager;

/* loaded from: classes7.dex */
public final class p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SupportSensorsManagerImpl f25603a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SupportSensorsManagerImpl supportSensorsManagerImpl) {
        super(0);
        this.f25603a = supportSensorsManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SensorsManager sensorsManagerCreateSensorManager = this.f25603a.sensorsDataProviderFactory.createSensorManager(false);
        SupportSensorsManagerImpl supportSensorsManagerImpl = this.f25603a;
        sensorsManagerCreateSensorManager.setDelegate(supportSensorsManagerImpl.sensorsDataProviderDelegate);
        supportSensorsManagerImpl.getFreezeMonitor().setSensorTimestampsProvider(sensorsManagerCreateSensorManager);
        supportSensorsManagerImpl.getSensorIssuesMonitor().setDelegate(new n(supportSensorsManagerImpl));
        return sensorsManagerCreateSensorManager;
    }
}
