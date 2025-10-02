package me.oriient.positioningengine.ondevice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfigProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.mainOrientation.MainOrientationCalculator;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.common.util.UtilsKt;
import me.oriient.positioningengine.ondevice.initialization.EngineSessionConfig;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfoEngineResult;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class X implements K {

    @NotNull
    private static final M Companion = new M();

    /* renamed from: a, reason: collision with root package name */
    public final C1821h f26409a;
    public EngineSessionMetadata b;
    public final EngineCalibrationInfo c;
    public final PredefinedDataShift d;
    public final OnDeviceEngineCoreConfigProvider e;
    public final long f;
    public final OnDeviceEnginePerformanceMonitor g;
    public EngineSessionConfig h;
    public N i;
    public final ArrayList j;
    public MappingData.Building k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public Long r;
    public final LinkedHashMap s;

    public X(C1821h delegate, EngineSessionMetadata metadata, EngineCalibrationInfo engineCalibrationInfo, PredefinedDataShift predefinedDataShift, OnDeviceEngineCoreConfigProvider engineCoreConfigProvider, OnDeviceEnginePerformanceMonitor performanceMonitor) {
        Intrinsics.h(delegate, "delegate");
        Intrinsics.h(metadata, "metadata");
        Intrinsics.h(engineCoreConfigProvider, "engineCoreConfigProvider");
        Intrinsics.h(performanceMonitor, "performanceMonitor");
        this.f26409a = delegate;
        this.b = metadata;
        this.c = engineCalibrationInfo;
        this.d = predefinedDataShift;
        this.e = engineCoreConfigProvider;
        this.f = 0L;
        this.g = performanceMonitor;
        this.i = N.IDLE;
        this.j = new ArrayList();
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.l = di.inject(reflectionFactory.b(me.oriient.positioningengine.ondevice.ndkBridge.a.class));
        this.m = DiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.n = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.o = DiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.p = DiKt.getDi().inject(reflectionFactory.b(RuntimeDataProvider.class));
        this.q = DiKt.getDi().inject(reflectionFactory.b(MainOrientationCalculator.class));
        this.s = new LinkedHashMap();
    }

    public final Object a(MappingData.FloorFullData floorFullData, SuspendLambda suspendLambda) {
        Unit unit = Unit.f24250a;
        ((Logger) this.m.getD()).d("OnDeviceEngineCore", "setFloor() called with: map = " + floorFullData.getMetadata().getFloorId());
        if (this.i != N.POSITIONING) {
            UtilsKt.assertionFailure("Got floor data while " + this.i);
        }
        try {
            ((me.oriient.positioningengine.ondevice.ndkBridge.a) this.l.getD()).setFloor(floorFullData);
            for (MappingData.FloorFullData.RestrictedArea restrictedArea : floorFullData.getRestrictedAreas()) {
                this.s.put(restrictedArea.getId(), restrictedArea);
            }
            return unit;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "NDK Exception";
            }
            Object objA = a(new PositioningEngineError.EngineCoreError(message), suspendLambda);
            return objA == CoroutineSingletons.d ? objA : unit;
        }
    }

    public final EngineCalibrationInfoEngineResult b() {
        if (this.i == N.IDLE) {
            return null;
        }
        try {
            return ((me.oriient.positioningengine.ondevice.ndkBridge.a) this.l.getD()).getLastCalibrationInfo();
        } catch (Exception e) {
            ((ELog) this.n.getD()).e("OnDeviceEngineCore", "Failed to get calibration info", MapsKt.i(new Pair("errorMessage", e.getLocalizedMessage())));
            UtilsKt.assertionFailure("Failed to get calibration info " + e);
            return null;
        }
    }

    public final Outcome a() {
        if (this.i == N.IDLE) {
            return new Outcome.Success(null);
        }
        try {
            return ((me.oriient.positioningengine.ondevice.ndkBridge.a) this.l.getD()).getAnalytics();
        } catch (Exception e) {
            ((ELog) this.n.getD()).e("OnDeviceEngineCore", "Failed to get engine analytics", MapsKt.i(new Pair("errorMessage", e.getLocalizedMessage())));
            UtilsKt.assertionFailure("Failed to get engine analytics: " + e);
            return new Outcome.Failure(PositioningEngineError.AnalyticsWasNotReceived.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
    
        if (a(r10) == r11) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
    
        if (r3.a(r2, r10) != r11) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d3, code lost:
    
        if (a(r10) == r11) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ed, code lost:
    
        if (r3.a(r2, r10) == r11) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ef, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.positioningengine.common.PositioningContext r19, me.oriient.positioningengine.ondevice.mappingData.MappingData.Building r20, me.oriient.positioningengine.ondevice.EngineSessionMetadata r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.X.a(me.oriient.positioningengine.common.PositioningContext, me.oriient.positioningengine.ondevice.mappingData.MappingData$Building, me.oriient.positioningengine.ondevice.EngineSessionMetadata, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if (r13.a(r0, r15) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof me.oriient.positioningengine.ondevice.V
            if (r0 == 0) goto L14
            r0 = r15
            me.oriient.positioningengine.ondevice.V r0 = (me.oriient.positioningengine.ondevice.V) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            me.oriient.positioningengine.ondevice.V r0 = new me.oriient.positioningengine.ondevice.V
            r0.<init>(r12, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r15.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r0)
            goto L97
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            me.oriient.positioningengine.ondevice.X r13 = r15.f26407a
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L3b
            goto L97
        L3b:
            r0 = move-exception
            r14 = r0
            goto L7e
        L3e:
            kotlin.ResultKt.b(r0)
            kotlin.Lazy r0 = r12.l     // Catch: java.lang.Exception -> L63
            java.lang.Object r0 = r0.getD()     // Catch: java.lang.Exception -> L63
            r5 = r0
            me.oriient.positioningengine.ondevice.ndkBridge.a r5 = (me.oriient.positioningengine.ondevice.ndkBridge.a) r5     // Catch: java.lang.Exception -> L63
            me.oriient.positioningengine.ondevice.EngineSessionMetadata r6 = r12.b     // Catch: java.lang.Exception -> L63
            me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo r7 = r12.c     // Catch: java.lang.Exception -> L63
            me.oriient.positioningengine.support.device_data.model.PredefinedDataShift r8 = r12.d     // Catch: java.lang.Exception -> L63
            me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfigProvider r0 = r12.e     // Catch: java.lang.Exception -> L63
            me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfig r10 = r0.configForBuilding(r14)     // Catch: java.lang.Exception -> L63
            r9 = 0
            r11 = r14
            me.oriient.positioningengine.ondevice.initialization.EngineSessionConfig r14 = r5.startCalibration(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L63
            r12.h = r14     // Catch: java.lang.Exception -> L63
            if (r13 != r4) goto L67
            me.oriient.positioningengine.ondevice.N r13 = me.oriient.positioningengine.ondevice.N.PRE_CALIBRATION     // Catch: java.lang.Exception -> L63
            goto L6b
        L63:
            r0 = move-exception
            r14 = r0
            r13 = r12
            goto L7e
        L67:
            if (r13 != 0) goto L78
            me.oriient.positioningengine.ondevice.N r13 = me.oriient.positioningengine.ondevice.N.CONTINUOUS_CALIBRATION     // Catch: java.lang.Exception -> L63
        L6b:
            r12.i = r13     // Catch: java.lang.Exception -> L63
            r15.f26407a = r12     // Catch: java.lang.Exception -> L63
            r15.d = r4     // Catch: java.lang.Exception -> L63
            java.lang.Object r13 = r12.a(r15)     // Catch: java.lang.Exception -> L63
            if (r13 != r1) goto L97
            goto L96
        L78:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L63
            r13.<init>()     // Catch: java.lang.Exception -> L63
            throw r13     // Catch: java.lang.Exception -> L63
        L7e:
            me.oriient.positioningengine.common.util.PositioningEngineError$EngineCoreError r0 = new me.oriient.positioningengine.common.util.PositioningEngineError$EngineCoreError
            java.lang.String r14 = r14.getMessage()
            if (r14 != 0) goto L88
            java.lang.String r14 = "NDK Exception"
        L88:
            r0.<init>(r14)
            r14 = 0
            r15.f26407a = r14
            r15.d = r3
            java.lang.Object r13 = r13.a(r0, r15)
            if (r13 != r1) goto L97
        L96:
            return r1
        L97:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.X.a(boolean, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        if (r12 == r1) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #1 {Exception -> 0x0045, blocks: (B:18:0x0040, B:38:0x007d, B:40:0x008b), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.X.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(EngineCalibrationInfoEngineResult engineCalibrationInfoEngineResult, P p) {
        boolean zIsSuccessful = engineCalibrationInfoEngineResult.isSuccessful();
        Unit unit = Unit.f24250a;
        if (!zIsSuccessful) {
            return unit;
        }
        EngineCalibrationInfo engineCalibrationInfo = engineCalibrationInfoEngineResult.getEngineCalibrationInfo();
        if (Math.abs(((TimeProvider) this.o.getD()).getCurrentTimeMillis() - me.oriient.positioningengine.common.util.a.a(engineCalibrationInfo.getCalibrationData().getLastSuccessfulTime(), ((TimeProvider) this.o.getD()).getTimeZoneGmt())) > this.f) {
            C1821h c1821h = this.f26409a;
            Object objA = c1821h.f26432a.b.a(engineCalibrationInfo, this.b.getSessionId(), p);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            if (objA != coroutineSingletons) {
                objA = unit;
            }
            if (objA == coroutineSingletons) {
                return objA;
            }
        }
        return unit;
    }

    /* JADX WARN: Path cross not found for [B:28:0x00ab, B:39:0x0152], limit reached: 107 */
    /* JADX WARN: Path cross not found for [B:39:0x0152, B:28:0x00ab], limit reached: 107 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:26:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a2 -> B:26:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample r116, kotlin.coroutines.jvm.internal.ContinuationImpl r117) {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.X.a(me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(PositioningEngineError.EngineCoreError engineCoreError, ContinuationImpl continuationImpl) {
        Unit unit = Unit.f24250a;
        ((ELog) this.n.getD()).w("OnDeviceEngineCore", "Engine crashed with error", MapsKt.i(new Pair("errorMessage", engineCoreError.getMessage())));
        this.i = N.IDLE;
        ((me.oriient.positioningengine.ondevice.ndkBridge.a) this.l.getD()).terminateEngine();
        I i = this.f26409a.f26432a;
        i.y = null;
        Object objA = i.a(engineCoreError, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        if (objA != coroutineSingletons) {
            objA = unit;
        }
        return objA == coroutineSingletons ? objA : unit;
    }
}
