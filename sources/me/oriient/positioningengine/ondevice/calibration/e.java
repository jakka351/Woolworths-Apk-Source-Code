package me.oriient.positioningengine.ondevice.calibration;

import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.models.CalibrationNeeded;
import me.oriient.positioningengine.common.u;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e implements DiProvidable {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final me.oriient.positioningengine.ondevice.models.calibration.c f26415a;
    public final PersistentStorage b;
    public final MutableStateFlow c;
    public final CoroutineScope d;
    public Job e;
    public me.oriient.positioningengine.ondevice.models.calibration.b f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;

    public e(me.oriient.positioningengine.ondevice.models.calibration.c calibrationType, PersistentStorage prefs, CoroutineContext engineCoroutineContext, CoroutineContextProvider coroutineContextProvider) {
        CalibrationNeeded calibrationNeeded;
        Intrinsics.h(calibrationType, "calibrationType");
        Intrinsics.h(prefs, "prefs");
        Intrinsics.h(engineCoroutineContext, "engineCoroutineContext");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        this.f26415a = calibrationType;
        this.b = prefs;
        if (prefs.getBoolean("pref.calibration_needed", true)) {
            CalibrationNeeded.Companion.getClass();
            calibrationNeeded = CalibrationNeeded.Timeout;
        } else {
            calibrationNeeded = null;
        }
        this.c = StateFlowKt.a(calibrationNeeded);
        this.d = CoroutineScopeKt.a(coroutineContextProvider.getIo());
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.g = di.inject(reflectionFactory.b(me.oriient.positioningengine.common.config.c.class));
        this.h = DiKt.getDi().inject(reflectionFactory.b(CalibrationInfoDatabase.class));
        this.i = DiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.j = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
        BuildersKt.c(CoroutineScopeKt.a(engineCoroutineContext), null, null, new a(this, null), 3);
    }

    public final void a(CalibrationNeeded needed) {
        Intrinsics.h(needed, "needed");
        if (((me.oriient.positioningengine.common.config.a) ((me.oriient.positioningengine.common.config.d) ((me.oriient.positioningengine.common.config.c) this.g.getD())).f26374a.getValue()).g) {
            return;
        }
        ((ELog) this.j.getD()).i("CalibrationDataRepository", "Calibration needed updated", MapsKt.j(new Pair("state", h.NEEDED.getValue()), new Pair("engineType", u.ON_DEVICE.getValue$service_positioning_engine_publishRelease()), new Pair("reason", needed.getReason().getValue())));
        this.c.setValue(needed);
        this.b.putBoolean("pref.calibration_needed", this.c.getValue() != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof me.oriient.positioningengine.ondevice.calibration.d
            if (r0 == 0) goto L13
            r0 = r13
            me.oriient.positioningengine.ondevice.calibration.d r0 = (me.oriient.positioningengine.ondevice.calibration.d) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.positioningengine.ondevice.calibration.d r0 = new me.oriient.positioningengine.ondevice.calibration.d
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            me.oriient.positioningengine.ondevice.models.calibration.b r11 = r0.b
            me.oriient.positioningengine.ondevice.calibration.e r12 = r0.f26414a
            kotlin.ResultKt.b(r13)
            goto L5f
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            kotlin.ResultKt.b(r13)
            me.oriient.positioningengine.ondevice.models.calibration.b r4 = new me.oriient.positioningengine.ondevice.models.calibration.b
            java.util.Date r13 = new java.util.Date
            r13.<init>()
            long r5 = r13.getTime()
            me.oriient.positioningengine.ondevice.models.calibration.c r9 = r10.f26415a
            r8 = r11
            r7 = r12
            r4.<init>(r5, r7, r8, r9)
            kotlin.Lazy r11 = r10.h
            java.lang.Object r11 = r11.getD()
            me.oriient.positioningengine.ondevice.calibration.CalibrationInfoDatabase r11 = (me.oriient.positioningengine.ondevice.calibration.CalibrationInfoDatabase) r11
            r0.f26414a = r10
            r0.b = r4
            r0.e = r3
            java.lang.Object r11 = r11.upsertCalibrationRecord(r4, r0)
            if (r11 != r1) goto L5d
            return r1
        L5d:
            r12 = r10
            r11 = r4
        L5f:
            r12.f = r11
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.calibration.e.a(me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
