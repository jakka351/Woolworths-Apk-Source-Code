package me.oriient.internal.infra.locationManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class Q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SystemLocationManagerFactoryImpl f24942a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(SystemLocationManagerFactoryImpl systemLocationManagerFactoryImpl) {
        super(0);
        this.f24942a = systemLocationManagerFactoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FusedLocationManager(this.f24942a.getContextProvider().getContext(), null, null, null, null, null, 62, null);
    }
}
