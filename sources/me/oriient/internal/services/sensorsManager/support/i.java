package me.oriient.internal.services.sensorsManager.support;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SensorsDataProviderFactoryImpl f25597a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SensorsDataProviderFactoryImpl sensorsDataProviderFactoryImpl) {
        super(0);
        this.f25597a = sensorsDataProviderFactoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f25597a.getLocationManagerFactory().create();
    }
}
