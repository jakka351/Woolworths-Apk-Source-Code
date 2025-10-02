package me.oriient.ipssdk.realtime.ips.calibration;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ofs.R2;

/* loaded from: classes8.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PeriodicAutomaticCalibratorImpl f25877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl) {
        super(0);
        this.f25877a = periodicAutomaticCalibratorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new R2(this.f25877a);
    }
}
