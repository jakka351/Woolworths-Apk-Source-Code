package me.oriient.internal.services.sensorsManager.support;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;

/* loaded from: classes7.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SupportSensorsManagerImpl f25604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SupportSensorsManagerImpl supportSensorsManagerImpl) {
        super(0);
        this.f25604a = supportSensorsManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SensorsDataProvider sensorsDataProviderCreateSensorsDataProvider = this.f25604a.sensorsDataProviderFactory.createSensorsDataProvider();
        SupportSensorsManagerImpl supportSensorsManagerImpl = this.f25604a;
        sensorsDataProviderCreateSensorsDataProvider.setDelegate(supportSensorsManagerImpl.sensorsDataProviderDelegate);
        supportSensorsManagerImpl.getFreezeMonitor().setDelegate(null);
        supportSensorsManagerImpl.getSensorIssuesMonitor().setDelegate(null);
        return sensorsDataProviderCreateSensorsDataProvider;
    }
}
