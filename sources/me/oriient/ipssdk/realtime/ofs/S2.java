package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl;

/* loaded from: classes8.dex */
public final class S2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PeriodicAutomaticCalibratorImpl f26006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        super(0);
        this.f26006a = periodicAutomaticCalibratorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("buildingId", this.f26006a.n);
    }
}
