package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.realtime.ips.calibration.PeriodicAutomaticCalibratorImpl;

/* loaded from: classes8.dex */
public final class U2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public PeriodicAutomaticCalibratorImpl f26016a;
    public /* synthetic */ Object b;
    public final /* synthetic */ PeriodicAutomaticCalibratorImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(PeriodicAutomaticCalibratorImpl periodicAutomaticCalibratorImpl, Continuation continuation) {
        super(continuation);
        this.c = periodicAutomaticCalibratorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return PeriodicAutomaticCalibratorImpl.access$scheduleAutoCalibrationTask(this.c, this);
    }
}
