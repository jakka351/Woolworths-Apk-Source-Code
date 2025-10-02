package me.oriient.internal.services.geofence.strategy;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.locationManager.SystemLocationManagerFactory;

/* loaded from: classes7.dex */
public final class w extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f25515a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar) {
        super(0);
        this.f25515a = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((SystemLocationManagerFactory) this.f25515a.h.getD()).create();
    }
}
